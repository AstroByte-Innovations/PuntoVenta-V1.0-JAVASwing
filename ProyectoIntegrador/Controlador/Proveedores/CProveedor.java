package Proveedores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Inventario.VInventario;
import Principal.CPrincipal;

public class CProveedor implements ActionListener {

	public VProveedor ventana;
	
	public CProveedor() {
		this.ventana = new VProveedor();
		this.ventana.setVisible(true);
		
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.centro.btnSalida.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		}else if(e.getSource() == this.ventana.centro.btnSalida || e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		}
	}

}
