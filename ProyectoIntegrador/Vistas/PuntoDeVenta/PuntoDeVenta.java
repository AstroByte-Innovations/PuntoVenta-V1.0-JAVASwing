package PuntoDeVenta;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import General.Nav;
import Usuario.Cliente;
import Usuario.Empleado;

public class PuntoDeVenta extends JFrame {

	private JPanel contentPane;

	public Nav navegacion;
	public PV centro;
	
	public PuntoDeVenta(String Num,String fecha, String root) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 600);
		
		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.centro = new PV(Num, fecha, root);
		this.navegacion = new Nav();
		this.contentPane.add(navegacion,BorderLayout.NORTH);
		this.contentPane.add(centro,BorderLayout.CENTER);
		setContentPane(contentPane);
	}

}
