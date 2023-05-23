package Inventario;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;

public class agregarInventario extends JPanel {
	public JTextField ID;
	private JTextField Codigo;
	public JTextField IDA;
	private JTextField NombreA;
	private JTextField Estado;
	public JTextField Cantidad;
	public JSpinner nuevaCantidad;
	/**
	 * Create the panel.
	 */
	public agregarInventario(String[] data) {
		this.setPreferredSize(new Dimension(600,250));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel_5 = new JLabel("Datos del Producto");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 4;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("ID");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		ID = new JTextField(data[0]);
		ID.setEditable(false);
		GridBagConstraints gbc_ID = new GridBagConstraints();
		gbc_ID.gridwidth = 3;
		gbc_ID.insets = new Insets(0, 0, 5, 0);
		gbc_ID.fill = GridBagConstraints.HORIZONTAL;
		gbc_ID.gridx = 1;
		gbc_ID.gridy = 1;
		add(ID, gbc_ID);
		ID.setColumns(10);
		
		JLabel lblNombre = new JLabel("Codigo");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		Codigo = new JTextField(data[1]);
		Codigo.setEditable(false);
		GridBagConstraints gbc_Codigo = new GridBagConstraints();
		gbc_Codigo.gridwidth = 3;
		gbc_Codigo.insets = new Insets(0, 0, 5, 0);
		gbc_Codigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_Codigo.gridx = 1;
		gbc_Codigo.gridy = 2;
		add(Codigo, gbc_Codigo);
		Codigo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JTextArea textArea = new JTextArea(data[2]);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 3;
		add(textArea, gbc_textArea);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 4;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 4;
		add(separator, gbc_separator);
		
		JLabel lblNewLabel_1 = new JLabel("Datos de Almacen");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 6;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		IDA = new JTextField(data[3]);
		IDA.setEditable(false);
		GridBagConstraints gbc_IDA = new GridBagConstraints();
		gbc_IDA.insets = new Insets(0, 0, 5, 5);
		gbc_IDA.fill = GridBagConstraints.HORIZONTAL;
		gbc_IDA.gridx = 1;
		gbc_IDA.gridy = 6;
		add(IDA, gbc_IDA);
		IDA.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		NombreA = new JTextField(data[4]);
		NombreA.setEditable(false);
		GridBagConstraints gbc_NombreA = new GridBagConstraints();
		gbc_NombreA.insets = new Insets(0, 0, 5, 0);
		gbc_NombreA.fill = GridBagConstraints.HORIZONTAL;
		gbc_NombreA.gridx = 3;
		gbc_NombreA.gridy = 6;
		add(NombreA, gbc_NombreA);
		NombreA.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 4;
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 7;
		add(separator_1, gbc_separator_1);
		
		JLabel lblNewLabel_9 = new JLabel("Inventario");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.gridwidth = 4;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 8;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_6 = new JLabel("Estado");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 9;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		Estado = new JTextField(data[5]);
		Estado.setEditable(false);
		GridBagConstraints gbc_Estado = new GridBagConstraints();
		gbc_Estado.insets = new Insets(0, 0, 5, 5);
		gbc_Estado.fill = GridBagConstraints.HORIZONTAL;
		gbc_Estado.gridx = 1;
		gbc_Estado.gridy = 9;
		add(Estado, gbc_Estado);
		Estado.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cantidad");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 9;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		Cantidad = new JTextField(data[6]);
		Cantidad.setEditable(false);
		GridBagConstraints gbc_Cantidad = new GridBagConstraints();
		gbc_Cantidad.insets = new Insets(0, 0, 5, 0);
		gbc_Cantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_Cantidad.gridx = 3;
		gbc_Cantidad.gridy = 9;
		add(Cantidad, gbc_Cantidad);
		Cantidad.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Agregar");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 10;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		nuevaCantidad = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 0, 5);
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 10;
		add(nuevaCantidad, gbc_spinner);
	}

}
