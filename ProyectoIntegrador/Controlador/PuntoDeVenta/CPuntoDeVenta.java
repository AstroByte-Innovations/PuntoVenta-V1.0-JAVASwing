package PuntoDeVenta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Principal.CPrincipal;

public class CPuntoDeVenta implements ActionListener{

	private PuntoDeVenta ventana;
	
	public CPuntoDeVenta() {
		this.ventana = new PuntoDeVenta("000",null,null,"00/00/0000","src/Assets/img/imagenop.png");
		this.ventana.setVisible(true);
		this.ventana.centro.btnCancelar.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.centro.btnCancelar || e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		}
	}

}
