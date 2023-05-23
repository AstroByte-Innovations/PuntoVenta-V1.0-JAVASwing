package Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import General.guardarImagen;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedWriter;

public class CVerProducto implements ActionListener {

	private VerProducto produc;
	Producto producto;
	public CVerProducto(Producto producto) {
		this.producto = producto;
		produc = new VerProducto(producto);
		this.produc.BtnActualizar.addActionListener(this);
		this.produc.BtnEliminar.addActionListener(this);
		this.produc.BtnCancelar.addActionListener(this);
		this.produc.btnActualizarImagen.addActionListener(this);
		String[] opciones = { "Pieza", "Granel", "Paquete" };
		this.produc.tipo.addItem(opciones[0]);
		this.produc.tipo.addItem(opciones[1]);
		this.produc.tipo.addItem(opciones[2]);
		if (producto != null) {
			this.produc.ID.setText(producto.getID());
			this.produc.Codigo.setText(producto.getCodigo());
			this.produc.NombreProducto.setText(producto.getNombre());
			this.produc.Precio.setText("$ " + producto.getPrecio());
			this.produc.Costo.setText("$ " + producto.getCosto());

			switch (producto.getTipo()) {
			case 1:
				this.produc.tipo.setSelectedIndex(0);
				break;
			case 2:
				this.produc.tipo.setSelectedIndex(1);
				break;
			case 3:
				this.produc.tipo.setSelectedIndex(2);
				break;
			}

			switch (producto.getEstado()) {
			case 1:
				this.produc.Estado.setText("Activo");
				break;
			case 2:
				this.produc.Estado.setText("Descontinuado");
				break;
			}

			this.produc.NombreProveedor.setText(producto.getProveedor().getNombres());
			this.produc.ApellidoProveedor.setText(producto.getProveedor().getApellidos());
			this.produc.NombreComercial.setText(producto.getProveedor().getNombre_Comercial());
			this.produc.GiroComercial.setText(producto.getProveedor().getGiro_Comercial());
			this.produc.Telefono.setText(producto.getProveedor().getTelefono());
			this.produc.Correo.setText(producto.getProveedor().getCorreo());
			this.produc.WEB.setText(producto.getProveedor().getSitio_Web());

			this.produc.Descripcion.setText(producto.getDescripcion());
			this.produc.Notas.setText(producto.getNotas());

			this.produc.Categoria.setText(producto.getCategoria().getNombre());
			this.produc.SubCategoria.setText(producto.getSubCategoria().getNombre());
		}

		produc.setVisible(true);
	}

	private void chagueState() {
		String button = this.produc.BtnActualizar.getText();
		System.out.println(button);
		boolean s = false;
		if (button.equals("Actualizar")) {
			this.produc.BtnActualizar.setText("Guardar");
			s = true;
		} else if(button.equals("Guardar")){
			
			this.produc.BtnActualizar.setText("Actualizar");
		}
		this.produc.Estado.setEditable(s);
		this.produc.Precio.setEditable(s);
		this.produc.Costo.setEditable(s);
		this.produc.Codigo.setEditable(s);
		this.produc.Descripcion.setEditable(s);
		this.produc.Notas.setEditable(s);
		this.produc.tipo.setEnabled(s);
		this.produc.NombreProducto.setEditable(s);
		this.produc.btnActualizarImagen.setEnabled(s);
	}

	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.produc.BtnCancelar) {
			this.produc.dispose();
		} else if (e.getSource() == this.produc.BtnActualizar) {
			chagueState();
		} else if (e.getSource() == this.produc.btnActualizarImagen) {
			guardarImagen img = new guardarImagen();
			int result = JOptionPane.showConfirmDialog(null, img,"Selecciones una imagen",JOptionPane.CLOSED_OPTION,JOptionPane.INFORMATION_MESSAGE);
			System.out.println(img.nombreArchivo);
			this.producto.setImagen(img.nombreArchivo);
		}
	}

}
