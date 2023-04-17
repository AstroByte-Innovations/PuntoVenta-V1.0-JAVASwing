package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import PuntoDeVenta.CPuntoDeVenta;
import Categorias.VCategorias;
import Producto.CProductos;
import Productos.VProductos;

public class CPrincipal implements ActionListener{

	private Principal principal;
	
	
	public CPrincipal() {
		this.principal = new Principal();
		this.principal.setVisible(true);
		
		this.principal.navegacion.logo.grid.addActionListener(this);
		this.principal.centro.opciones.opciones[1].addActionListener(this);
		this.principal.centro.opciones.opciones[7].addActionListener(this);
		this.principal.centro.opciones.opciones[0].addActionListener(this);
		//this.principal.centro.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.principal.centro.opciones.opciones[1]) {
			CPuntoDeVenta puntoventa = new CPuntoDeVenta();
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[7]) {
			VCategorias categorias = new VCategorias();
			categorias.setVisible(true);
			this.principal.dispose();
		}else if(e.getSource() == this.principal.centro.opciones.opciones[0]) {
			CProductos productos = new CProductos();
			this.principal.dispose();
		}
	}

}
