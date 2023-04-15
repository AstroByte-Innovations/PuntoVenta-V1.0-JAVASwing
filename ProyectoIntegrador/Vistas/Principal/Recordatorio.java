package Principal;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Recordatorio extends JPanel {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private JLabel fecha;
	private JLabel asunto;
	private JLabel texto;
	private JPanel encabezado;
	
	public Recordatorio(String Fecha, String Asunto, String Texto) {
		this.setBounds(0, 0, 200, 100);
		this.setBorder(new EmptyBorder(5,0,5,0));
		setLayout(new BorderLayout(0, 0));
		this.encabezado = new JPanel();
		this.encabezado.setLayout(new BorderLayout());
		
		this.fecha = new JLabel(Fecha);
		fecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.encabezado.add(this.fecha,BorderLayout.NORTH);
		
		
		this.asunto = new JLabel(Asunto);
		asunto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.encabezado.add(this.asunto,BorderLayout.CENTER);
		
		this.add(encabezado,BorderLayout.NORTH);
		this.texto = new JLabel(Texto);
		texto.setVerticalAlignment(SwingConstants.TOP);
		texto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(this.texto,BorderLayout.CENTER);
	}

}
