package Categorias;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import General.Nav;

public class VCategorias extends JFrame {

	private JPanel contentPane;
	public Nav navegacion;
	public Categorias categorias;

	public VCategorias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 600);
		
		this.navegacion = new Nav();
		this.categorias = new Categorias();
		
		contentPane = new JPanel();
		this.contentPane.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.contentPane.add(navegacion,BorderLayout.NORTH);
		this.contentPane.add(categorias,BorderLayout.CENTER);
		setContentPane(contentPane);
	}

}
