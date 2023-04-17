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

	/**
	 * Create the frame.
	 */
	public VProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		this.navegacion = new Nav();
		
		contentPane = new JPanel();
		this.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.contentPane.add(navegacion,BorderLayout.NORTH);
		setContentPane(contentPane);
	}

}
