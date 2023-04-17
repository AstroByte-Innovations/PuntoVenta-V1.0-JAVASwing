package Producto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Productos.MProductos;
import Productos.PProducto;
import Productos.Producto;
import Productos.VProductos;

public class CProductos implements ActionListener{

	public VProductos productos;
	
	public CProductos() {
		this.productos = new VProductos();
		this.productos.setVisible(true);
		
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos = MProductos.CargarProductos();
		for(Producto e: productos) {
			this.productos.productos.Productos.add(new PProducto(e));
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
