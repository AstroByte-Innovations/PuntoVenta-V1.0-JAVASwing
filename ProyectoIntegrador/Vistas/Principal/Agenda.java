package Principal;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Agenda extends JPanel {

	private JPanel bienvenida;
	private JLabel Lbienvenida = new JLabel("BIENVENIDO DE VUELTA:");
	private JLabel Usuario;
	
	private Recordatorios recordatorios;
	public Agenda(String user) {
		this.setLayout(new BorderLayout());
		this.setBounds(0, 0, 200, 900);
		
		this.bienvenida = new JPanel();
		this.Usuario = new JLabel(user);
		Usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Usuario.setHorizontalAlignment(SwingConstants.RIGHT);
		
		this.bienvenida.setLayout(new BorderLayout());
		Lbienvenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Lbienvenida.setHorizontalAlignment(SwingConstants.LEFT);
		this.bienvenida.add(Lbienvenida,BorderLayout.NORTH);
		this.bienvenida.add(Usuario,BorderLayout.SOUTH);

		this.add(bienvenida,BorderLayout.NORTH);
		
		this.recordatorios = new Recordatorios();
		this.add(recordatorios,BorderLayout.CENTER);
		
	}

}
