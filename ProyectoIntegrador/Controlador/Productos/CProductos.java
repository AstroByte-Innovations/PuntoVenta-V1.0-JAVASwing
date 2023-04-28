package Productos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Principal.CPrincipal;
import Productos.MProductos;
import Productos.PProducto;
import Productos.Producto;
import Productos.VProductos;

public class CProductos implements ActionListener{

	public VProductos productos;
	
	public CProductos() {
		this.productos = new VProductos();
		this.productos.setVisible(true);
		
		this.productos.productos.btnSalida.addActionListener(this);
		this.productos.navegacion.logo.grid.addActionListener(this);
		this.productos.navegacion.SMsalida.addActionListener(this);
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos = MProductos.CargarProductos();
		for(Producto e: productos) {
			this.productos.productos.Productos.add(new PProducto(e));
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.productos.navegacion.SMsalida) {
			this.productos.dispose();
		}else if(e.getSource() == this.productos.productos.btnSalida || e.getSource() == this.productos.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.productos.dispose();
		}
	}

}
