package PuntoDeVenta;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import General.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import General.ImageRenderer;
import General.genericos;
import Principal.CPrincipal;
import Productos.ProductoTicket;

public class CPuntoDeVenta implements ActionListener, ListSelectionListener {

	private PuntoDeVenta ventana;
	private ArrayList<String[]> productos;
	private String[] p;
	private ArrayList<ProductoTicket> productosTicket;

	public CPuntoDeVenta() {
		LocalDate fechaHoy = LocalDate.now();
		this.ventana = new PuntoDeVenta(String.valueOf(MPuntoDeVenta.getNextTicket()), fechaHoy.toString(),
				"src/Assets/img/imagenop.png");
		this.productos = MPuntoDeVenta.getInventario();
		this.productosTicket = new ArrayList<ProductoTicket>();
		DefaultTableModel model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// Devolver false para todas las celdas, evitando la edición
				return column == 4;
			}
		};
		// Agregar las columnas al modelo de la tabla
		model.addColumn("IMAGEN");
		model.addColumn("CODIGO");
		model.addColumn("NOMBRE");
		model.addColumn("PRECIO");
		model.addColumn("CANTIDAD");
		model.addColumn("TOTAL");

		this.ventana.centro.tablaProductos.table.setModel(model);
		this.ventana.centro.tablaProductos.table.setRowHeight(100);

		this.ventana.centro.tablaProductos.table.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
		this.ventana.centro.tablaProductos.table.getColumnModel().getColumn(4).setCellEditor(new SpinnerEditor());

		this.ventana.setVisible(true);
		this.ventana.centro.tablaProductos.table.getSelectionModel().addListSelectionListener(this);
		this.ventana.centro.btnCancelar.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.centro.Codigo.addActionListener(this);
		this.ventana.centro.btnModo.addActionListener(this);
		this.ventana.centro.btnAgregar.addActionListener(this);
		this.ventana.centro.btnPagar.addActionListener(this);

	}

	public void agregarProductoTicket(String[] p, int cantidad) {
		JScrollPane scrollPane = this.ventana.centro.tablaProductos;
		Rectangle rect = this.ventana.centro.tablaProductos.table
				.getCellRect(this.ventana.centro.tablaProductos.table.getRowCount() - 1, 0, true);
		String root = "src/Assets/img/imagenop.png";
		File imagen = new File("src/Assets/imgProductos/" + p[6]);
		if (imagen.exists()) {
			root = "src/Assets/imgProductos/" + p[6];
		}
		createCellContentImg img = new createCellContentImg(root);
		double total = cantidad * Double.parseDouble(p[4]);
		Object[] data = { img, p[2], p[3], p[4], cantidad, total };
		DefaultTableModel model = (DefaultTableModel) this.ventana.centro.tablaProductos.table.getModel();
		model.addRow(data);
		this.productosTicket.add(new ProductoTicket(String.valueOf(cantidad),p[0],p[2],p[3],p[4],String.valueOf(total)));
		scrollPane.getViewport().scrollRectToVisible(rect);
	}

	private boolean actualizarProductoTicket(String id, int cantidad) {
		boolean ck = false;
		int filas = this.ventana.centro.tablaProductos.table.getRowCount();
		DefaultTableModel model = (DefaultTableModel) this.ventana.centro.tablaProductos.table.getModel();
		for (int i = 0; i < filas; i++) {
			if (id.equals(model.getValueAt(i, 1).toString())) {
				model.setValueAt(Integer.parseInt(model.getValueAt(i, 4).toString()) + cantidad, i, 4);
				double total = Double.parseDouble(model.getValueAt(i, 3).toString())
						* Integer.parseInt(model.getValueAt(i, 4).toString());
				model.setValueAt(total, i, 5);
				this.actualizarProductoTicketL(id, cantidad);
				ck = true;
			}
		}
		return ck;
	}
	
	private void actualizarProductoTicketL(String id,int cantidad) {
		for(ProductoTicket e: this.productosTicket) {
			if(e.getCodigo().equals(id)) {
				e.setCantidad(String.valueOf(Integer.parseInt(e.getCantidad()) + cantidad));
				double total = Double.parseDouble(e.getCantidad()) * Double.parseDouble(e.getPrecio());
				e.setSubtotal(String.valueOf(total));
			}
		}
	}

	private void modoAutomatico() {
		if (p != null) {
			if (this.ventana.centro.btnModo.getText().equals("Automatico")) {
				this.ventana.centro.Codigo.setText("");
				if (!this.actualizarProductoTicket(p[2], 1))
					this.agregarProductoTicket(p, 1);
				this.totales();
			}
		}
	}

	private void obtenerProducto() {
		String codigo = this.ventana.centro.Codigo.getText();
		p = this.busqueda(productos, codigo);
		if (p != null) {
			this.ventana.centro.Nombre.setText(p[3]);
			this.ventana.centro.Precio.setText("$ " + p[4]);
			String root = "src/Assets/img/imagenop.png";
			File imagen = new File("src/Assets/imgProductos/" + p[6]);
			if (imagen.exists()) {
				root = "src/Assets/imgProductos/" + p[6];
			}
			ImageIcon img = new ImageIcon(root);
			Image icono = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			ImageIcon resizedIcon = new ImageIcon(icono);
			this.ventana.centro.Imagen.setIcon(resizedIcon);
		} else {
			genericos.error("El producto " + codigo + " no existe en la base de datos");
		}
		this.ventana.centro.Codigo.setText("");

	}

	public String[] busqueda(ArrayList<String[]> A, String codigo) {
		String[] p = null;
		for (String[] e : A) {
			if (e[2].equals(codigo)) {
				p = e;
			}
		}
		return p;

	}

	private void btnModo() {
		if (this.ventana.centro.btnModo.getText().equals("Manual")) {
			this.ventana.centro.btnModo.setText("Automatico");
			this.ventana.centro.btnModo.setBackground(new Color(196, 4, 4));
			this.state(false);
		} else if (this.ventana.centro.btnModo.getText().equals("Automatico")) {
			this.ventana.centro.btnModo.setText("Manual");
			this.ventana.centro.btnModo.setBackground(new Color(116, 200, 3));
			this.state(true);
		}
	}

	private void state(boolean s) {
		this.ventana.centro.Nombre.setEditable(s);
		this.ventana.centro.spinner.setEnabled(s);
		this.ventana.centro.btnAgregar.setEnabled(s);
	}

	private void modoManual() {
		int cantidad = (int) this.ventana.centro.spinner.getValue();
		if (cantidad > 0) {
			if (p != null && !this.ventana.centro.Nombre.getText().isEmpty()
					&& !this.ventana.centro.Precio.getText().isEmpty()) {
				if (this.ventana.centro.btnModo.getText().equals("Manual")) {
					this.ventana.centro.Codigo.setText("");
					if (!this.actualizarProductoTicket(p[2], cantidad))
						this.agregarProductoTicket(p, cantidad);
					this.totales();
					this.ventana.centro.Nombre.setText("");
					this.ventana.centro.Precio.setText("");
					this.ventana.centro.spinner.setValue(0);
				}
			}
		} else {
			genericos.error("No se puede agregar una cantidad 0 a un producto");
		}
	}

	public void totales() {
		double IVA, Subtotal = 0, Total;
		int cantidad = 0;
		int filas = this.ventana.centro.tablaProductos.table.getRowCount();
		DefaultTableModel model = (DefaultTableModel) this.ventana.centro.tablaProductos.table.getModel();
		for (int i = 0; i < filas; i++) {
			Subtotal += Double.parseDouble(model.getValueAt(i, 5).toString());
			cantidad += Integer.parseInt(model.getValueAt(i,4).toString());
		}
		IVA = Subtotal * 0.16;
		Total = IVA + Subtotal;
		
		this.ventana.centro.IVA.setText(String.valueOf(IVA));
		this.ventana.centro.CantidadT.setText(String.valueOf(cantidad));
		this.ventana.centro.Subtotal.setText(String.valueOf(Subtotal));
		this.ventana.centro.Total.setText(String.valueOf(Total));
	}
	
	private void Pagar() {
		String subtotal = this.ventana.centro.Subtotal.getText();
		String IVA = this.ventana.centro.IVA.getText();
		String Total = this.ventana.centro.Total.getText();
		String Efectivo = this.ventana.centro.Efectivo.getText();
		String Cambio;
		int Cantidad = Integer.parseInt(this.ventana.centro.CantidadT.getText());
		if(Double.parseDouble(Efectivo) >= Double.parseDouble(Total)) {
			double cambio = Double.parseDouble(Efectivo) - Double.parseDouble(Total);
			Cambio = String.valueOf(cambio);
			String ticket = MPuntoDeVenta.agregarTicket("1", subtotal, IVA, Total, Efectivo, Cambio);
			for(ProductoTicket e: this.productosTicket) {
				MPuntoDeVenta.agregarProductoTicket(ticket, e.getId(), e.getCantidad(), e.getSubtotal(), e.getPrecio());
			}
			Libreria.generarTicketPDF.generarReporte(ticket, "22-05-2023", Double.parseDouble(subtotal), Double.parseDouble(IVA), Double.parseDouble(Total), Double.parseDouble(Efectivo), Double.parseDouble(Cambio), Cantidad, productosTicket);
			this.ventana.dispose();
			CPuntoDeVenta nuevo = new CPuntoDeVenta();
		}else {
			genericos.advertencia("Por favor ingrese efectivo para completar el monto de la compra");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		} else if (e.getSource() == this.ventana.centro.btnCancelar
				|| e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		} else if (e.getSource() == this.ventana.centro.Codigo) {
			obtenerProducto();
			this.modoAutomatico();
		} else if (e.getSource() == this.ventana.centro.btnModo) {
			this.btnModo();
		} else if (e.getSource() == this.ventana.centro.btnAgregar) {
			this.modoManual();
		}else if(e.getSource() == this.ventana.centro.btnPagar) {
			this.Pagar();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

	private static class SpinnerEditor extends AbstractCellEditor implements TableCellEditor {
		private JSpinner spinner;

		public SpinnerEditor() {
			spinner = new JSpinner();
			SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
			spinner.setModel(spinnerModel);
		}

		@Override
		public Object getCellEditorValue() {
			return spinner.getValue();
		}

		@Override
		public java.awt.Component getTableCellEditorComponent(javax.swing.JTable table, Object value,
				boolean isSelected, int row, int column) {
			spinner.setValue(value);
			return spinner;
		}
	}

}
