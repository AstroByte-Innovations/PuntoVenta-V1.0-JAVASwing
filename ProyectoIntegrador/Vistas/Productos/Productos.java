package Productos;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;

public class Productos extends JPanel {
	public JTextField NombreBuscar;
	public JTextField Mostrar;
	public JButton btnSalida;
	public JButton btnBuscar;
	public JPanel Productos;
	public JComboBox SubCategorias;
	public JComboBox Categorias;
	public JScrollPane scrollPane;
	/**
	 * Create the panel.
	 */
	public Productos() {
		//this.setBounds(0, 0, 1000, 750);
		this.setPreferredSize(new Dimension(1000,750));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 100, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTitulo = new JLabel("Productos");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.gridwidth = 12;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblProducto = new GridBagConstraints();
		gbc_lblProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto.anchor = GridBagConstraints.EAST;
		gbc_lblProducto.gridx = 1;
		gbc_lblProducto.gridy = 2;
		add(lblProducto, gbc_lblProducto);
		
		NombreBuscar = new JTextField();
		NombreBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_NombreBuscar = new GridBagConstraints();
		gbc_NombreBuscar.gridwidth = 6;
		gbc_NombreBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_NombreBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_NombreBuscar.gridx = 2;
		gbc_NombreBuscar.gridy = 2;
		add(NombreBuscar, gbc_NombreBuscar);
		NombreBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 8;
		gbc_btnBuscar.gridy = 2;
		add(btnBuscar, gbc_btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 10;
		gbc_btnAgregar.gridy = 2;
		add(btnAgregar, gbc_btnAgregar);
		
		JLabel lblCategorias = new JLabel("Categorias");
		lblCategorias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblCategorias = new GridBagConstraints();
		gbc_lblCategorias.anchor = GridBagConstraints.EAST;
		gbc_lblCategorias.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategorias.gridx = 1;
		gbc_lblCategorias.gridy = 3;
		add(lblCategorias, gbc_lblCategorias);
		
		Categorias = new JComboBox();
		Categorias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_Categorias = new GridBagConstraints();
		gbc_Categorias.fill = GridBagConstraints.HORIZONTAL;
		gbc_Categorias.insets = new Insets(0, 0, 5, 5);
		gbc_Categorias.gridx = 2;
		gbc_Categorias.gridy = 3;
		add(Categorias, gbc_Categorias);
		
		JLabel lblSubCategorias = new JLabel("SubCategorias");
		lblSubCategorias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSubCategorias = new GridBagConstraints();
		gbc_lblSubCategorias.anchor = GridBagConstraints.EAST;
		gbc_lblSubCategorias.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubCategorias.gridx = 5;
		gbc_lblSubCategorias.gridy = 3;
		add(lblSubCategorias, gbc_lblSubCategorias);
		
		SubCategorias = new JComboBox();
		SubCategorias.setEnabled(false);
		SubCategorias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_SubCategorias = new GridBagConstraints();
		gbc_SubCategorias.insets = new Insets(0, 0, 5, 5);
		gbc_SubCategorias.fill = GridBagConstraints.HORIZONTAL;
		gbc_SubCategorias.gridx = 6;
		gbc_SubCategorias.gridy = 3;
		add(SubCategorias, gbc_SubCategorias);
		
		JLabel lblMostrar = new JLabel("Mostrar");
		lblMostrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMostrar = new GridBagConstraints();
		gbc_lblMostrar.anchor = GridBagConstraints.EAST;
		gbc_lblMostrar.insets = new Insets(0, 0, 5, 5);
		gbc_lblMostrar.gridx = 9;
		gbc_lblMostrar.gridy = 3;
		add(lblMostrar, gbc_lblMostrar);
		
		Mostrar = new JTextField();
		Mostrar.setHorizontalAlignment(SwingConstants.CENTER);
		Mostrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Mostrar.setText("50");
		GridBagConstraints gbc_Mostrar = new GridBagConstraints();
		gbc_Mostrar.insets = new Insets(0, 0, 5, 5);
		gbc_Mostrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_Mostrar.gridx = 10;
		gbc_Mostrar.gridy = 3;
		add(Mostrar, gbc_Mostrar);
		Mostrar.setColumns(10);
		
		
		scrollPane = new JScrollPane();
		//scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 11;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		
		Productos = new JPanel();
		Productos.setLayout(new GridLayout(0, 5, 10, 10));
		
		this.scrollPane.setViewportView(Productos);
		add(scrollPane, gbc_scrollPane);
		
		
		btnSalida = new JButton("Salida");
		btnSalida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnSalida = new GridBagConstraints();
		gbc_btnSalida.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalida.gridx = 10;
		gbc_btnSalida.gridy = 6;
		add(btnSalida, gbc_btnSalida);
	}


}
