package Almacen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import General.Nav;
import General.Visualizar;

public class VAlmacen extends JFrame {

	private JPanel contentPane;

	public Nav navegacion;
	public Almacen centro;
	
	
	public VAlmacen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 600);
		this.navegacion = new Nav();
		this.centro = new Almacen();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.contentPane.setLayout(new BorderLayout());
		
		this.contentPane.add(navegacion,BorderLayout.NORTH);
		this.contentPane.add(centro,BorderLayout.CENTER);

		setContentPane(contentPane);
	}

}
