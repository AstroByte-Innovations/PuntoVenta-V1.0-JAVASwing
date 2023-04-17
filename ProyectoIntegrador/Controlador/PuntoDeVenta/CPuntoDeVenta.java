package PuntoDeVenta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPuntoDeVenta implements ActionListener{

	private PuntoDeVenta ventana;
	
	public CPuntoDeVenta() {
		this.ventana = new PuntoDeVenta("000",null,null,"00/00/0000","src/Assets/img/imageop.png");
		this.ventana.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
