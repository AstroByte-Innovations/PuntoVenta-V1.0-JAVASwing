package Almacen;

import javax.swing.JPanel;

import General.CRUD;
import General.Table;

import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.FlowLayout;

public class Almacen extends JPanel {

	public CRUD crud; 
	private JTextField Nombre;
	private JTextField buscar;
	public Table tabla;
	public JButton btnAgregar, btnEliminar, btnActualizar, btnBuscar, btnFiltro,btnSalida;
	
	public Almacen() {
		setLayout(new BorderLayout(0, 0));
		this.setBounds(0, 0, 1200, 750);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane);
		
		JPanel editar = new JPanel();
		splitPane.setLeftComponent(editar);
		GridBagLayout gbl_editar = new GridBagLayout();
		gbl_editar.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_editar.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_editar.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_editar.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		editar.setLayout(gbl_editar);
		
		JLabel lblTitulo = new JLabel("Almacenes");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 5;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		editar.add(lblTitulo, gbc_lblTitulo);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 5;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		editar.add(separator, gbc_separator);
		
		JLabel lblNewLabel_1 = new JLabel("Ediccion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		editar.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		editar.add(lblNewLabel, gbc_lblNewLabel);
		
		Nombre = new JTextField();
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Nombre.setEditable(false);
		GridBagConstraints gbc_Nombre = new GridBagConstraints();
		gbc_Nombre.insets = new Insets(0, 0, 5, 5);
		gbc_Nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_Nombre.gridx = 1;
		gbc_Nombre.gridy = 3;
		editar.add(Nombre, gbc_Nombre);
		Nombre.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 2;
		gbc_btnAgregar.gridy = 3;
		editar.add(btnAgregar, gbc_btnAgregar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 3;
		editar.add(btnEliminar, gbc_btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnActualizar = new GridBagConstraints();
		gbc_btnActualizar.insets = new Insets(0, 0, 5, 0);
		gbc_btnActualizar.gridx = 4;
		gbc_btnActualizar.gridy = 3;
		editar.add(btnActualizar, gbc_btnActualizar);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 5;
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 5;
		editar.add(separator_1, gbc_separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Buscador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		editar.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Almacen: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 7;
		editar.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		buscar = new JTextField();
		buscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_buscar = new GridBagConstraints();
		gbc_buscar.insets = new Insets(0, 0, 5, 5);
		gbc_buscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_buscar.gridx = 1;
		gbc_buscar.gridy = 7;
		editar.add(buscar, gbc_buscar);
		buscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 2;
		gbc_btnBuscar.gridy = 7;
		editar.add(btnBuscar, gbc_btnBuscar);
		
		btnFiltro = new JButton("Filtro");
		btnFiltro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnFiltro = new GridBagConstraints();
		gbc_btnFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_btnFiltro.gridx = 3;
		gbc_btnFiltro.gridy = 7;
		editar.add(btnFiltro, gbc_btnFiltro);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_2.gridwidth = 5;
		gbc_separator_2.insets = new Insets(0, 0, 0, 5);
		gbc_separator_2.gridx = 0;
		gbc_separator_2.gridy = 9;
		editar.add(separator_2, gbc_separator_2);
		
		JPanel tabla = new JPanel();
		splitPane.setRightComponent(tabla);
		tabla.setLayout(new BorderLayout(0, 0));
		
		this.tabla = new Table();
		tabla.add(this.tabla,BorderLayout.CENTER);
		
		JPanel Salida = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Salida.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		tabla.add(Salida, BorderLayout.SOUTH);
		
		btnSalida = new JButton("Salida");
		btnSalida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Salida.add(btnSalida);
		
	}

}
