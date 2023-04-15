package PuntoDeVenta;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Usuario.Cliente;
import Usuario.Empleado;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Datos_Generales extends JPanel {

	private JLabel LNumTicket = new JLabel("Ticket N°");
	private JLabel LCajero = new JLabel("Te atiende"); 
	private JLabel LCliente = new JLabel("Cliente");
	private JLabel LFecha;
	
	private JTextField NumTicket;
	private JTextField Cajero;
	private JTextField Cliente;
	
	private JPanel datos, fecha;
	
	public Datos_Generales(String ticket, Empleado cajero, Cliente cliente, String fecha) {
		this.setBounds(0, 0, 900, 40);
		this.setBorder(new EmptyBorder(5,5,5,5));
		this.setLayout(new BorderLayout());
		this.datos = new JPanel();
		this.fecha = new JPanel();
		
		this.NumTicket = new JTextField(ticket);
		NumTicket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.Cajero = new JTextField(cajero.getNombres());
		Cajero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.Cliente = new JTextField(cliente.getNombres());
		Cliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.LFecha = new JLabel(fecha);
		LFecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LNumTicket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		this.datos.add(LNumTicket);
		this.datos.add(NumTicket);
		LCajero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.datos.add(LCajero);
		this.datos.add(Cajero);
		LCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.datos.add(LCliente);
		this.datos.add(Cliente);
		this.fecha.add(LFecha);
		
		this.add(datos,BorderLayout.CENTER);
		this.add(this.fecha,BorderLayout.EAST);
	}

}
