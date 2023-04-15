package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CPrincipal implements ActionListener{

	private Principal principal;
	
	
	public CPrincipal() {
		this.principal = new Principal();
		this.principal.setVisible(true);
		
		this.principal.navegacion.logo.grid.addActionListener(this);
		this.principal.centro.opciones.opciones[0].addActionListener(this);
		//this.principal.centro.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
