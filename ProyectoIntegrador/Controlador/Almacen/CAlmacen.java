package Almacen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Principal.CPrincipal;

public class CAlmacen implements ActionListener {

	private VAlmacen ventana;
	
	
	public CAlmacen() {
		this.ventana = new VAlmacen();
		this.ventana.centro.btnActualizar.addActionListener(this);;
		this.ventana.centro.btnAgregar.addActionListener(this);
		this.ventana.centro.btnBuscar.addActionListener(this);
		this.ventana.centro.btnEliminar.addActionListener(this);
		this.ventana.centro.btnFiltro.addActionListener(this);
		this.ventana.centro.btnSalida.addActionListener(this);
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		
		
		
		this.ventana.setVisible(true);
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
