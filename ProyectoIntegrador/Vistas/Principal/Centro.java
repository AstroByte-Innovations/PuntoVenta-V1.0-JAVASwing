package Principal;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Centro extends JPanel {

	public Agenda agenda;
	public Opciones opciones;
	
	public Centro(String user) {
		this.setLayout(new BorderLayout());
		this.agenda = new Agenda(user);
		this.add(agenda,BorderLayout.WEST);
		
		this.opciones = new Opciones();
		this.add(opciones,BorderLayout.CENTER);
	}

}
