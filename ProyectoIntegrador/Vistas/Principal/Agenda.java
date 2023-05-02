package Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Font;

public class Agenda extends JPanel {

	private JPanel bienvenida;
	private JLabel Lbienvenida = new JLabel("BIENVENIDO DE VUELTA:");
	private JLabel Usuario;
	
	public Recordatorios recordatorios;
	public Agenda(String user) {
		this.setLayout(new BorderLayout());
		this.setBounds(0, 0, 200, 900);
		this.setMaximumSize(new Dimension(200,900));
		this.setBorder(new LineBorder(new Color(0,0,0)));
		
		
		this.bienvenida = new JPanel();
		this.Usuario = new JLabel(user);
		Usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Usuario.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.bienvenida.setLayout(new BorderLayout());
		this.bienvenida.setBorder(new EmptyBorder(20,10,20,10));
		Lbienvenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Lbienvenida.setHorizontalAlignment(SwingConstants.LEFT);
		this.bienvenida.add(Lbienvenida,BorderLayout.NORTH);
		this.bienvenida.add(Usuario,BorderLayout.SOUTH);

		this.add(bienvenida,BorderLayout.NORTH);
		
		this.recordatorios = new Recordatorios();
		this.add(recordatorios,BorderLayout.CENTER);
		
	}

}
