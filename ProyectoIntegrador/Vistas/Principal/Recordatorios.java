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
	public JPanel recordatorios;
	
	public Recordatorios() {
		this.setBounds(0, 0, 200, 400);
		setLayout(new BorderLayout(0, 0));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(titulo,BorderLayout.NORTH);
		
		this.scroll = new JScrollPane();
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.recordatorios = new JPanel();
		recordatorios.setLayout(new BoxLayout(recordatorios, BoxLayout.Y_AXIS));
		/*
		for(int i = 0; i < 20; i++) {
			this.recordatorios.add(new Recordatorio("12/12/2023","Viene el proveedor","Hola soy un recordatorio\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent suscipit iaculis placerat. Pellentesque auctor erat mi, ac tincidunt nulla imperdiet vitae. Donec odio est, egestas ut malesuada eu, maximus nec dolor. Aliquam varius arcu non porta dignissim. Nulla dignissim rhoncus nunc, eu venenatis dolor malesuada vel. Morbi iaculis tincidunt aliquam. Suspendisse porttitor lectus vel consequat tempor. Integer ac elit quis justo dignissim pretium. Proin a mollis enim, vel interdum diam. Proin sed sem sit amet urna egestas fermentum eget vitae magna. Fusce non nisi at leo malesuada dapibus nec in ipsum. Phasellus lacus turpis, efficitur id posuere non, aliquam eu dolor."));
		}*/
		

		this.scroll.setViewportView(recordatorios);
		this.add(scroll,BorderLayout.CENTER);
		
		
	}

}
