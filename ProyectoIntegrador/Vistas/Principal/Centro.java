package Principal;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Centro extends JPanel {

	private Agenda agenda;
	public Opciones opciones;
	
	public Centro() {
		this.setLayout(new BorderLayout());
		this.agenda = new Agenda("Marcos");
		this.add(agenda,BorderLayout.WEST);
		
		this.opciones = new Opciones();
		this.add(opciones,BorderLayout.CENTER);
	}

}
