package Productos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;

import Categorias.MCategorias;
import General.genericos;
import Principal.CPrincipal;
import Productos.MProductos;
import Productos.PProducto;
import Productos.Producto;
import Productos.VProductos;

public class CProductos implements ActionListener, ItemListener{

	public VProductos productos;
	private ArrayList<Producto> Lproductos;
	private int page = 1;
	private Categoria cat = new Categoria("0","Sin valor");
	private SubCategoria sub = new SubCategoria("0","Sin valor",null);
	public CProductos() {
		this.productos = new VProductos();

		
		this.productos.productos.btnSalida.addActionListener(this);
		this.productos.productos.btnSiguiente.addActionListener(this);
		this.productos.productos.btnAtras.addActionListener(this);
		this.productos.navegacion.logo.grid.addActionListener(this);
		this.productos.navegacion.SMsalida.addActionListener(this);
		ArrayList<Categoria> categorias = MCategorias.obtenerCategorias();
		for(Categoria e: categorias) {
			this.productos.productos.Categorias.addItem(e);
		}
		mostrarProductos(page, Integer.parseInt(this.productos.productos.Mostrar.getText()), 0, 0);
		this.productos.productos.Categorias.addItemListener(this);
		this.productos.productos.SubCategorias.addItemListener(this);
		this.productos.setVisible(true);
	}
	
	private void categorias() {
		this.productos.productos.SubCategorias.removeAllItems();
		cat = (Categoria) this.productos.productos.Categorias.getSelectedItem();
		
		if(!cat.getId().equals("0")) {
			ArrayList<SubCategoria> listado = MCategorias.obtenerSubCategoriasbyCategoriaID(Integer.parseInt(cat.getId()));
			
			if(listado.size() > 0) {
				this.productos.productos.SubCategorias.setEnabled(true);
				for(SubCategoria e: listado) {
					this.productos.productos.SubCategorias.addItem(e);
				}
			}else {
				this.productos.productos.SubCategorias.setEnabled(false);
			}
			
		}else {
			this.productos.productos.SubCategorias.setEnabled(false);
		}
	}
	
	private void mostrarProductos(int page, int size, int cat, int sub) {
		this.productos.productos.Productos.setVisible(false);
		this.productos.productos.Productos.removeAll();
		if(cat != 0 && sub != 0) {
			this.page = 1;
			Lproductos = MProductos.mostrarProductosByCategoriaAndSubcategorias(page, size, cat, sub);
			for(Producto e: Lproductos) {
				this.productos.productos.Productos.add(new PProducto(e));
			}
		}else if(cat != 0) {
			Lproductos = MProductos.mostrarProductosByCategoria(page, size, cat);
			for(Producto e: Lproductos) {
				this.productos.productos.Productos.add(new PProducto(e));
			}
		}else {
			Lproductos = MProductos.mostrarProductos(page, size);
			for(Producto e: Lproductos) {
				this.productos.productos.Productos.add(new PProducto(e));
			}
		}
		this.productos.productos.Productos.repaint();
		this.productos.productos.Productos.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.productos.navegacion.SMsalida) {
			this.productos.dispose();
		}else if(e.getSource() == this.productos.productos.btnSalida || e.getSource() == this.productos.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.productos.dispose();
		}else if(e.getSource() == this.productos.productos.btnSiguiente) {
			this.page++;
			System.out.println("Pagina: " + this.page);
			mostrarProductos(page, Integer.parseInt(this.productos.productos.Mostrar.getText()), Integer.parseInt(this.cat.getId()), Integer.parseInt(this.sub.getID()));
		}else if(e.getSource() == this.productos.productos.btnAtras) {
			this.page--;
			System.out.println("Pagina: " + this.page);
			mostrarProductos(page, Integer.parseInt(this.productos.productos.Mostrar.getText()), Integer.parseInt(this.cat.getId()), Integer.parseInt(this.sub.getID()));
		}
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.productos.productos.Categorias && e.getStateChange() == ItemEvent.SELECTED) {
			this.categorias();
			this.page = 1;
			mostrarProductos(page, Integer.parseInt(this.productos.productos.Mostrar.getText()), Integer.parseInt(this.cat.getId()), Integer.parseInt(this.sub.getID()));
		}else if(e.getSource() == this.productos.productos.SubCategorias && e.getStateChange() == ItemEvent.SELECTED) {
			this.page = 1;
			mostrarProductos(page, Integer.parseInt(this.productos.productos.Mostrar.getText()), Integer.parseInt(this.cat.getId()), Integer.parseInt(this.sub.getID()));
		}
	}

}
