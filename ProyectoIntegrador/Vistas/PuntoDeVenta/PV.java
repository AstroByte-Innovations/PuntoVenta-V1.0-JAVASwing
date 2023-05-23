package PuntoDeVenta;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import General.Table;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import java.awt.Font;
import Usuario.*;
import javax.swing.JSpinner;
import java.awt.Color;

public class PV extends JPanel {
	private JTextField Ticket;
	public JTextField Codigo;
	private JTextField cajero;
	public JTextField Nombre;
	public JTextField Precio;
	public JTextField Total;
	public JTextField Efectivo;
	public JTextField Cambio;
	public JTextField Subtotal;
	public JTextField CantidadT;
	public JTextField IVA;
	public Table tablaProductos;
	public JButton btnCancelar;
	public JButton btnAgregar;
	public JButton btnPagar;
	public JSpinner spinner;
	public JButton btnModo;
	public JLabel Imagen;
	/**
	 * Create the panel.
	 */
	public PV(String Num, String fecha, String root) {
		this.setBounds(0, 0, 900, 800);
		String NC, NE;
		/*
		if(empleado != null) NE = empleado.getNombres();
		else NE = "UNKNOW";
		
		
		if(cliente != null) NC = cliente.getNombres();
		else NC = "Cliente Eventual";*/
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 47, 0, 100, 0, 0, 0, 0, 0, 80, 0, 109, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 8, 64, 0, 200, 0, 50, 0, 50, 0, 50, 0, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTicket = new JLabel("Ticket N°");
		lblTicket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTicket = new GridBagConstraints();
		gbc_lblTicket.anchor = GridBagConstraints.EAST;
		gbc_lblTicket.insets = new Insets(0, 0, 5, 5);
		gbc_lblTicket.gridx = 1;
		gbc_lblTicket.gridy = 0;
		add(lblTicket, gbc_lblTicket);
		
		Ticket = new JTextField(Num);
		Ticket.setEnabled(false);
		Ticket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_Ticket = new GridBagConstraints();
		gbc_Ticket.insets = new Insets(0, 0, 5, 5);
		gbc_Ticket.fill = GridBagConstraints.HORIZONTAL;
		gbc_Ticket.gridx = 2;
		gbc_Ticket.gridy = 0;
		add(Ticket, gbc_Ticket);
		Ticket.setColumns(10);
		
		JLabel lblCajero = new JLabel("Te atiende:");
		lblCajero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCajero = new GridBagConstraints();
		gbc_lblCajero.anchor = GridBagConstraints.EAST;
		gbc_lblCajero.insets = new Insets(0, 0, 5, 5);
		gbc_lblCajero.gridx = 3;
		gbc_lblCajero.gridy = 0;
		add(lblCajero, gbc_lblCajero);
		
		cajero = new JTextField("Marcos Falcon");
		cajero.setEnabled(false);
		cajero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_cajero = new GridBagConstraints();
		gbc_cajero.fill = GridBagConstraints.HORIZONTAL;
		gbc_cajero.insets = new Insets(0, 0, 5, 5);
		gbc_cajero.gridx = 4;
		gbc_cajero.gridy = 0;
		gbc_cajero.gridwidth = 3;
		add(cajero, gbc_cajero);
		cajero.setColumns(10);
		
		btnModo = new JButton("Manual");
		btnModo.setBackground(new Color(128, 255, 128));
		GridBagConstraints gbc_btnModo = new GridBagConstraints();
		gbc_btnModo.insets = new Insets(0, 0, 5, 5);
		gbc_btnModo.gridx = 10;
		gbc_btnModo.gridy = 0;
		add(btnModo, gbc_btnModo);
		
		JLabel Fecha = new JLabel(fecha);
		Fecha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Fecha.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_Fecha = new GridBagConstraints();
		gbc_Fecha.insets = new Insets(0, 0, 5, 5);
		gbc_Fecha.gridx = 12;
		gbc_Fecha.gridy = 0;
		add(Fecha, gbc_Fecha);
		
		Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(root));
		GridBagConstraints gbc_Imagen = new GridBagConstraints();
		gbc_Imagen.insets = new Insets(0, 0, 5, 0);
		gbc_Imagen.gridx = 13;
		gbc_Imagen.gridy = 0;
		gbc_Imagen.gridheight = 3;
		add(Imagen, gbc_Imagen);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 8;
		gbc_lblPrecio.gridy = 1;
		add(lblPrecio, gbc_lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidad.gridx = 10;
		gbc_lblCantidad.gridy = 1;
		add(lblCantidad, gbc_lblCantidad);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCodigo = new GridBagConstraints();
		gbc_lblCodigo.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigo.gridx = 1;
		gbc_lblCodigo.gridy = 2;
		add(lblCodigo, gbc_lblCodigo);
		
		Codigo = new JTextField();
		Codigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_Codigo = new GridBagConstraints();
		gbc_Codigo.anchor = GridBagConstraints.NORTH;
		gbc_Codigo.insets = new Insets(0, 0, 5, 5);
		gbc_Codigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_Codigo.gridx = 2;
		gbc_Codigo.gridy = 2;
		add(Codigo, gbc_Codigo);
		Codigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		Nombre = new JTextField();
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_Nombre = new GridBagConstraints();
		gbc_Nombre.anchor = GridBagConstraints.NORTH;
		gbc_Nombre.insets = new Insets(0, 0, 5, 5);
		gbc_Nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_Nombre.gridx = 4;
		gbc_Nombre.gridy = 2;
		gbc_Nombre.gridwidth = 4;
		add(Nombre, gbc_Nombre);
		Nombre.setColumns(10);
		
		Precio = new JTextField();
		Precio.setEnabled(false);
		Precio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_Precio = new GridBagConstraints();
		gbc_Precio.fill = GridBagConstraints.HORIZONTAL;
		gbc_Precio.anchor = GridBagConstraints.NORTH;
		gbc_Precio.insets = new Insets(0, 0, 5, 5);
		gbc_Precio.gridx = 8;
		gbc_Precio.gridy = 2;
		add(Precio, gbc_Precio);
		Precio.setColumns(10);
		
		spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.anchor = GridBagConstraints.NORTH;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 10;
		gbc_spinner.gridy = 2;
		add(spinner, gbc_spinner);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.anchor = GridBagConstraints.NORTH;
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 12;
		gbc_btnAgregar.gridy = 2;
		add(btnAgregar, gbc_btnAgregar);
		
		this.tablaProductos = new Table();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.gridwidth = 12;
		add(tablaProductos, gbc_scrollPane);
		
		JPanel Botones = new JPanel();
		GridBagConstraints gbc_Botones = new GridBagConstraints();
		gbc_Botones.insets = new Insets(0, 0, 5, 0);
		gbc_Botones.fill = GridBagConstraints.BOTH;
		gbc_Botones.gridx = 13;
		gbc_Botones.gridy = 4;
		add(Botones, gbc_Botones);
		Botones.setLayout(new GridLayout(2, 3, 5, 0));
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotal.gridx = 13;
		gbc_lblTotal.gridy = 5;
		add(lblTotal, gbc_lblTotal);
		
		Total = new JTextField();
		Total.setEnabled(false);
		Total.setHorizontalAlignment(SwingConstants.RIGHT);
		Total.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Total.setText("$ 0.00");
		GridBagConstraints gbc_Total = new GridBagConstraints();
		gbc_Total.insets = new Insets(0, 0, 5, 0);
		gbc_Total.fill = GridBagConstraints.BOTH;
		gbc_Total.gridx = 13;
		gbc_Total.gridy = 6;
		add(Total, gbc_Total);
		Total.setColumns(10);
		
		JLabel lblEfectivo = new JLabel("Efectivo");
		lblEfectivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblEfectivo = new GridBagConstraints();
		gbc_lblEfectivo.insets = new Insets(0, 0, 5, 0);
		gbc_lblEfectivo.gridx = 13;
		gbc_lblEfectivo.gridy = 7;
		add(lblEfectivo, gbc_lblEfectivo);
		
		Efectivo = new JTextField();
		Efectivo.setHorizontalAlignment(SwingConstants.RIGHT);
		Efectivo.setText("0.00");
		Efectivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_Efectivo = new GridBagConstraints();
		gbc_Efectivo.insets = new Insets(0, 0, 5, 0);
		gbc_Efectivo.fill = GridBagConstraints.BOTH;
		gbc_Efectivo.gridx = 13;
		gbc_Efectivo.gridy = 8;
		add(Efectivo, gbc_Efectivo);
		Efectivo.setColumns(10);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCambio = new GridBagConstraints();
		gbc_lblCambio.insets = new Insets(0, 0, 5, 0);
		gbc_lblCambio.gridx = 13;
		gbc_lblCambio.gridy = 9;
		add(lblCambio, gbc_lblCambio);
		
		Cambio = new JTextField();
		Cambio.setEnabled(false);
		Cambio.setText("$ 0.00");
		Cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		Cambio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_Cambio = new GridBagConstraints();
		gbc_Cambio.insets = new Insets(0, 0, 5, 0);
		gbc_Cambio.fill = GridBagConstraints.BOTH;
		gbc_Cambio.gridx = 13;
		gbc_Cambio.gridy = 10;
		add(Cambio, gbc_Cambio);
		Cambio.setColumns(10);
		
		JLabel lblIVA = new JLabel("IVA");
		lblIVA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblIVA = new GridBagConstraints();
		gbc_lblIVA.gridwidth = 2;
		gbc_lblIVA.insets = new Insets(0, 0, 5, 5);
		gbc_lblIVA.gridx = 8;
		gbc_lblIVA.gridy = 11;
		add(lblIVA, gbc_lblIVA);
		
		JLabel lblCantidadT = new JLabel("Cantidad");
		lblCantidadT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCantidadT = new GridBagConstraints();
		gbc_lblCantidadT.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadT.gridx = 10;
		gbc_lblCantidadT.gridy = 11;
		add(lblCantidadT, gbc_lblCantidadT);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSubtotal = new GridBagConstraints();
		gbc_lblSubtotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubtotal.gridx = 12;
		gbc_lblSubtotal.gridy = 11;
		add(lblSubtotal, gbc_lblSubtotal);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 12;
		add(btnCancelar, gbc_btnCancelar);
		
		IVA = new JTextField();
		IVA.setEnabled(false);
		IVA.setHorizontalAlignment(SwingConstants.RIGHT);
		IVA.setText("$ 0.00");
		IVA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_IVA = new GridBagConstraints();
		gbc_IVA.gridwidth = 2;
		gbc_IVA.insets = new Insets(0, 0, 0, 5);
		gbc_IVA.fill = GridBagConstraints.BOTH;
		gbc_IVA.gridx = 8;
		gbc_IVA.gridy = 12;
		add(IVA, gbc_IVA);
		IVA.setColumns(10);
		
		CantidadT = new JTextField();
		CantidadT.setEnabled(false);
		CantidadT.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CantidadT.setText("0");
		GridBagConstraints gbc_CantidadT = new GridBagConstraints();
		gbc_CantidadT.insets = new Insets(0, 0, 0, 5);
		gbc_CantidadT.fill = GridBagConstraints.BOTH;
		gbc_CantidadT.gridx = 10;
		gbc_CantidadT.gridy = 12;
		add(CantidadT, gbc_CantidadT);
		CantidadT.setColumns(10);
		
		Subtotal = new JTextField();
		Subtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		Subtotal.setText("$ 0.00");
		Subtotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Subtotal.setEnabled(false);
		GridBagConstraints gbc_Subtotal = new GridBagConstraints();
		gbc_Subtotal.fill = GridBagConstraints.BOTH;
		gbc_Subtotal.insets = new Insets(0, 0, 0, 5);
		gbc_Subtotal.gridx = 12;
		gbc_Subtotal.gridy = 12;
		add(Subtotal, gbc_Subtotal);
		Subtotal.setColumns(10);
		
		btnPagar = new JButton("Pagar");
		btnPagar.setIcon(new ImageIcon("C:\\Users\\Marcos\\Downloads\\cheque.png"));
		btnPagar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnPagar = new GridBagConstraints();
		gbc_btnPagar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPagar.gridx = 13;
		gbc_btnPagar.gridy = 12;
		add(btnPagar, gbc_btnPagar);

	}

}
