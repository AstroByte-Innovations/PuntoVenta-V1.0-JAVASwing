package PuntoDeVenta;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Datos_Productos extends JPanel {

	private JLabel LCodigo = new JLabel("Codigo");
	private JLabel LNombre = new JLabel("Nombre");
	private JLabel LPrecio = new JLabel("Precio");
	private JLabel LCantidad = new JLabel("Cantidad");
	
	public JTextField Codigo;
	public JTextField Nombre;
	public JTextField Precio;
	public JTextField Cantidad;
	
	public JButton agregar;
	
	private JPanel CN = new JPanel(); 
	private JPanel Cant = new JPanel();

	
	public Datos_Productos() {
		this.setLayout(new BorderLayout());
		this.setBounds(0, 0, 900, 40);
		this.CN.setBounds(0, 0, 300, 60);
		this.Cant.setBounds(0, 0, 100, 60);
		
		this.Codigo = new JTextField();
		Codigo.setColumns(6);
		this.Nombre = new JTextField();
		Nombre.setColumns(15);
		this.Precio = new JTextField();
		Precio.setColumns(6);
		this.Cantidad = new JTextField();
		Cantidad.setColumns(6);
		
		this.agregar = new JButton("Agregar");
		CN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.CN.add(this.LCodigo);
		this.CN.add(this.Codigo);
		this.CN.add(LNombre);
		this.CN.add(Nombre);
		Cant.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.Cant.add(LPrecio);
		this.Cant.add(Precio);
		this.Cant.add(LCantidad);
		this.Cant.add(Cantidad);
		this.Cant.add(agregar);
		
		
		this.add(CN,BorderLayout.CENTER);
		this.add(this.Cant,BorderLayout.EAST);
		
		
	}

}
