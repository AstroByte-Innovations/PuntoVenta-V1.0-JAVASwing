package Productos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import General.Nav;

public class VProductos extends JFrame {

	private JPanel contentPane;

	public Nav navegacion;
	public Productos productos;

	/**
	 * Create the frame.
	 */
	public VProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 600);
		
		contentPane = new JPanel();
		this.contentPane.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.navegacion = new Nav();
		this.productos = new Productos();

		this.contentPane.add(navegacion,BorderLayout.NORTH);
		this.contentPane.add(productos,BorderLayout.CENTER);
		setContentPane(contentPane);
	}

}
