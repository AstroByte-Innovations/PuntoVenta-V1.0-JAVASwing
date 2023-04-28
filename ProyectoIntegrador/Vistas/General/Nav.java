package General;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import Principal.Usuario;

public class Nav extends JPanel {
	public Logo logo;
	public JMenuBar navegacion;
	public Usuario usuario;
	private JMenu salida;
	public JMenuItem SMsalida;
	
	public Nav() {
		this.setLayout(new BorderLayout());
		this.setBounds(0, 0, 1000, 50);
		
		this.logo = new Logo();
		
		this.navegacion = new JMenuBar();
		this.salida = new JMenu("Salida");
		this.navegacion.add(salida);
		this.navegacion.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.SMsalida = new JMenuItem("Salida");
		this.salida.add(this.SMsalida);
		
		this.usuario = new Usuario("Marcos");
		
		this.add(logo,BorderLayout.WEST);
		this.add(navegacion,BorderLayout.CENTER);
		this.add(usuario,BorderLayout.EAST);
	}

}
