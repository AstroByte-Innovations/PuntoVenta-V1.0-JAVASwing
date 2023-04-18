package Principal;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.ScrollPaneConstants;

public class Recordatorios extends JPanel {

	private JLabel titulo = new JLabel("Recordatorios");
	private JScrollPane scroll;
	private JPanel recordatorios;
	
	public Recordatorios() {
		this.setBounds(0, 0, 200, 400);
		setLayout(new BorderLayout(0, 0));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(titulo,BorderLayout.NORTH);
		
		this.scroll = new JScrollPane();
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.recordatorios = new JPanel();
		recordatorios.setLayout(new BoxLayout(recordatorios, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < 20; i++) {
			this.recordatorios.add(new Recordatorio("12/12/2023","Viene el proveedor","Hola soy un recordatorio"));
		}
		this.scroll.setViewportView(recordatorios);
		this.add(scroll,BorderLayout.CENTER);
		
		
	}

}
