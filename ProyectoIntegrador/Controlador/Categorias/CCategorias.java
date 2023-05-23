package Categorias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Almacen.MAlmacen;
import General.genericos;
import Inventario.MInventario;
import Principal.CPrincipal;
import Productos.Categoria;
import Productos.SubCategoria;

public class CCategorias implements ActionListener, ListSelectionListener {

	public VCategorias ventana;
	private String idCat,idSub;
	private Categoria cat;
	private SubCategoria sub;
	
	public CCategorias() {
		this.ventana = new VCategorias();
		DefaultTableModel model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// Devolver false para todas las celdas, evitando la edición
				return false;
			}
		};
		// Agregar las columnas al modelo de la tabla
		model.addColumn("ID");
		model.addColumn("NOMBRE");

		ArrayList<Categoria> lista = MCategorias.obtenerCategorias();
		for (Categoria e : lista) {
			String[] data = { e.getId(), e.getNombre() };
			model.addRow(data);
		}

		this.ventana.categorias.tablaCategorias.table.setModel(model);
		this.ventana.categorias.tablaCategorias.table.getSelectionModel().addListSelectionListener(this);

		// CATEGORIAS
		DefaultTableModel model2 = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// Devolver false para todas las celdas, evitando la edición
				return false;
			}
		};
		// Agregar las columnas al modelo de la tabla
		model2.addColumn("ID");
		model2.addColumn("NOMBRE");

		this.ventana.categorias.tablaSubCategorias.table.setModel(model2);
		this.ventana.categorias.tablaSubCategorias.table.getSelectionModel().addListSelectionListener(this);

		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.categorias.btnSalida.addActionListener(this);
		this.ventana.categorias.BtnAgregarCat.addActionListener(this);
		this.ventana.categorias.btnActualizarCat.addActionListener(this);
		this.ventana.categorias.btnEliminarCat.addActionListener(this);
		this.ventana.categorias.btnActualizarSub.addActionListener(this);
		this.ventana.categorias.btnEliminarSub.addActionListener(this);
		this.ventana.categorias.BtnAgregarSub.addActionListener(this);
		this.ventana.setVisible(true);
	}

	public void change1(boolean s) {
		this.ventana.categorias.BtnAgregarSub.setEnabled(s);
		this.ventana.categorias.btnActualizarCat.setEnabled(s);
		this.ventana.categorias.btnEliminarCat.setEnabled(s);
	}

	private void mostrarSubCategorias() {
		int rowCount = this.ventana.categorias.tablaSubCategorias.table.getModel().getRowCount();
		for (int i = rowCount - 1; i >= 0; i--) {
			((DefaultTableModel) this.ventana.categorias.tablaSubCategorias.table.getModel()).removeRow(i);
		}
		DefaultTableModel model2 = (DefaultTableModel) this.ventana.categorias.tablaSubCategorias.table.getModel();
		ArrayList<SubCategoria> lista = MCategorias.obtenerSubCategoriasbyCategoriaID(Integer.parseInt(this.idCat));
		for (SubCategoria e : lista) {
			String[] data = { e.getID(), e.getNombre() };
			model2.addRow(data);
		}
	}

	private void agregarCategoria() {
		String nombre = JOptionPane.showInputDialog("Ingresa el nombre de la Categoria");
		if (nombre.isEmpty()) {
			genericos.error("El nombre de la categoria no debe estar vacio");
		} else {
			Categoria cat = MCategorias.agregarCategoria(nombre);
			if (cat != null) {
				TableModel model = this.ventana.categorias.tablaCategorias.table.getModel();
				Object[] newRow = { cat.getId(), cat.getNombre() };
				((DefaultTableModel) model).addRow(newRow);
			}
		}
	}
	
	private void actualizarCategoria() {
		String nombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre de la Categoria");
		if (nombre.isEmpty()) {
			genericos.error("El nombre de la categoria no debe estar vacio");
		} else {
			Categoria cat = MCategorias.actualizarCategoria(idCat, nombre);
			if (cat != null) {
            	int selectedRow = this.ventana.categorias.tablaCategorias.table.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < this.ventana.categorias.tablaCategorias.table.getRowCount()) {
                    DefaultTableModel model = (DefaultTableModel) this.ventana.categorias.tablaCategorias.table.getModel();
                    model.setValueAt(cat.getNombre(), selectedRow, 1);
                }
			}
		}
	}
	
	private void eliminarCat() {
		int selectedRow = this.ventana.categorias.tablaCategorias.table.getSelectedRow();
		String ID = this.ventana.categorias.tablaCategorias.table.getValueAt(selectedRow, 0).toString();
		if(MCategorias.eliminarCat(ID)) {
	        if (selectedRow >= 0 && selectedRow < this.ventana.categorias.tablaCategorias.table.getRowCount()) {
	            DefaultTableModel model = (DefaultTableModel) this.ventana.categorias.tablaCategorias.table.getModel();
	            model.removeRow(selectedRow);
	            this.ventana.categorias.tablaCategorias.table.repaint();
	        }
		}
	}
	
	public void change2(boolean s) {
		this.ventana.categorias.btnActualizarSub.setEnabled(s);
		this.ventana.categorias.btnEliminarSub.setEnabled(s);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		} else if (e.getSource() == this.ventana.categorias.btnSalida
				|| e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		} else if (e.getSource() == this.ventana.categorias.BtnAgregarCat) {
			this.agregarCategoria();
		}else if(e.getSource() == this.ventana.categorias.btnActualizarCat) {
			this.actualizarCategoria();
		}else if(e.getSource() == this.ventana.categorias.btnEliminarCat) {
			this.eliminarCat();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		int selectedRow = this.ventana.categorias.tablaCategorias.table.getSelectedRow();
		if (selectedRow != -1) {
			this.change1(true);
			this.idCat = this.ventana.categorias.tablaCategorias.table.getValueAt(selectedRow, 0).toString();
			this.mostrarSubCategorias();
		} else {
			this.change1(false);
		}
		/*
		int selectedRow2 = this.ventana.categorias.tablaSubCategorias.table.getSelectedRow();
		if (selectedRow2 != -1) {
			this.change2(true);
			this.idSub = this.ventana.categorias.tablaSubCategorias.table.getValueAt(selectedRow2, 0).toString();
		} else {
			this.change2(false);
		}*/
	}

}
