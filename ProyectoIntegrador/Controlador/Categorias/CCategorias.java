package Categorias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Principal.CPrincipal;

public class CCategorias implements ActionListener{

	
	public VCategorias ventana;
	
	public CCategorias() {
		this.ventana = new VCategorias();
		this.ventana.setVisible(true);
		this.ventana.navegacion.SMsalida.addActionListener(this);
		this.ventana.navegacion.logo.grid.addActionListener(this);
		this.ventana.categorias.btnSalida.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.navegacion.SMsalida) {
			this.ventana.dispose();
		}else if(e.getSource() == this.ventana.categorias.btnSalida || e.getSource() == this.ventana.navegacion.logo.grid) {
			CPrincipal principal = new CPrincipal();
			this.ventana.dispose();
		}
	}

}
