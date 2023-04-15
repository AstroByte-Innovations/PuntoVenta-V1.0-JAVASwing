package Principal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Opcion extends JButton{

	private JLabel imagen;
	private JLabel texto;
	private JPanel panel;
	public Opcion(String titulo,String imgRuta,int font) {
		this.setBorder(new EmptyBorder(5,5,5,5));
		this.panel = new JPanel(new BorderLayout());
		
		ImageIcon icon = new ImageIcon(imgRuta);
		this.imagen = new JLabel(icon);
		this.panel.add(imagen,BorderLayout.CENTER);
		
		this.texto = new JLabel(titulo);
		this.texto.setHorizontalAlignment(SwingConstants.CENTER);
		this.texto.setFont(new Font("Tahoma", Font.PLAIN, font));
		this.panel.add(texto,BorderLayout.SOUTH);
		
		this.add(panel);
		this.setPreferredSize(new Dimension(100,100));
	}
	
	
}
