package Roles;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import General.CRUD;
import General.Nav;

public class VRoles extends JFrame {
	
	private JPanel contentPane;
	public Nav navegacion;
	public CRUD centro;
	
	public VRoles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 600);
		
		this.navegacion = new Nav();
		this.centro = new CRUD("Roles","Nombre del rol");
		
		
		contentPane = new JPanel();
		this.contentPane.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.contentPane.add(navegacion,BorderLayout.NORTH);
		this.contentPane.add(centro,BorderLayout.CENTER);
		setContentPane(contentPane);
		
	}

}
