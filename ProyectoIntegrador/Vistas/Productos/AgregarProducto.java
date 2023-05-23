package Productos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;

import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class AgregarProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField Estado;
	public JTextField Precio;
	public JTextField Costo;
	public JTextField Categoria;
	public JTextField SubCategoria;
	public JTextField WEB;
	public JTextField Telefono;
	public JTextField Correo;
	public JTextField NombreProveedor;
	public JTextField ApellidoProveedor;
	public JTextField NombreComercial;
	public JTextField GiroComercial;
	public JButton	BtnAgregar,BtnEliminar,BtnCancelar,btnActualizarImagen;
	public JTextField Codigo;
	public JTextArea NombreProducto;
	public JTextArea Descripcion;
	public JTextArea Notas;
	public JComboBox tipo;
	public JSpinner Cantidad;
	public AgregarProducto() {
		setBounds(100, 100, 850, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JSplitPane splitPane = new JSplitPane();
			splitPane.setResizeWeight(1.0);
			contentPanel.add(splitPane, BorderLayout.CENTER);
			{
				JPanel datos = new JPanel();
				splitPane.setLeftComponent(datos);
				GridBagLayout gbl_datos = new GridBagLayout();
				gbl_datos.columnWidths = new int[]{0, 0, 0, 0, 0};
				gbl_datos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_datos.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
				gbl_datos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
				datos.setLayout(gbl_datos);
				{
					JLabel lblNewLabel_1 = new JLabel("Nombre: ");
					GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
					gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_1.gridx = 0;
					gbc_lblNewLabel_1.gridy = 1;
					datos.add(lblNewLabel_1, gbc_lblNewLabel_1);
				}
				{
					NombreProducto = new JTextArea("UNKNOW");
					NombreProducto.setEditable(false);
					NombreProducto.setWrapStyleWord(true);
					NombreProducto.setLineWrap(true);
					GridBagConstraints gbc_NombreProducto = new GridBagConstraints();
					gbc_NombreProducto.insets = new Insets(0, 0, 5, 5);
					gbc_NombreProducto.fill = GridBagConstraints.BOTH;
					gbc_NombreProducto.gridx = 1;
					gbc_NombreProducto.gridy = 1;
					datos.add(NombreProducto, gbc_NombreProducto);
				}
				{
					JLabel lblNewLabel_6 = new JLabel("Tipo: ");
					GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
					gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_6.gridx = 2;
					gbc_lblNewLabel_6.gridy = 1;
					datos.add(lblNewLabel_6, gbc_lblNewLabel_6);
				}
				{
					tipo = new JComboBox();
					GridBagConstraints gbc_comboBox = new GridBagConstraints();
					gbc_comboBox.insets = new Insets(0, 0, 5, 0);
					gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox.gridx = 3;
					gbc_comboBox.gridy = 1;
					datos.add(tipo, gbc_comboBox);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Precio: ");
					GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
					gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_2.gridx = 0;
					gbc_lblNewLabel_2.gridy = 2;
					datos.add(lblNewLabel_2, gbc_lblNewLabel_2);
				}
				{
					Precio = new JTextField("$ 0.00");
					Precio.setEditable(false);
					GridBagConstraints gbc_Precio = new GridBagConstraints();
					gbc_Precio.anchor = GridBagConstraints.WEST;
					gbc_Precio.insets = new Insets(0, 0, 5, 5);
					gbc_Precio.gridx = 1;
					gbc_Precio.gridy = 2;
					datos.add(Precio, gbc_Precio);
					Precio.setColumns(10);
				}
				{
					JLabel lblNewLabel_7 = new JLabel("Estado: ");
					GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
					gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_7.gridx = 2;
					gbc_lblNewLabel_7.gridy = 2;
					datos.add(lblNewLabel_7, gbc_lblNewLabel_7);
				}
				{
					Estado = new JTextField("UNKNOW");
					Estado.setEditable(false);
					GridBagConstraints gbc_Estado = new GridBagConstraints();
					gbc_Estado.anchor = GridBagConstraints.WEST;
					gbc_Estado.insets = new Insets(0, 0, 5, 0);
					gbc_Estado.gridx = 3;
					gbc_Estado.gridy = 2;
					datos.add(Estado, gbc_Estado);
					Estado.setColumns(10);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("Costo: ");
					GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
					gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_3.gridx = 0;
					gbc_lblNewLabel_3.gridy = 3;
					datos.add(lblNewLabel_3, gbc_lblNewLabel_3);
				}
				{
					Costo = new JTextField("$ 0.00");
					Costo.setEditable(false);
					GridBagConstraints gbc_Costo = new GridBagConstraints();
					gbc_Costo.anchor = GridBagConstraints.WEST;
					gbc_Costo.insets = new Insets(0, 0, 5, 5);
					gbc_Costo.gridx = 1;
					gbc_Costo.gridy = 3;
					datos.add(Costo, gbc_Costo);
					Costo.setColumns(10);
				}
				{
					JSeparator separator = new JSeparator();
					GridBagConstraints gbc_separator = new GridBagConstraints();
					gbc_separator.fill = GridBagConstraints.HORIZONTAL;
					gbc_separator.gridwidth = 4;
					gbc_separator.insets = new Insets(0, 0, 5, 0);
					gbc_separator.gridx = 0;
					gbc_separator.gridy = 4;
					datos.add(separator, gbc_separator);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Categoria:");
					GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
					gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_4.gridx = 0;
					gbc_lblNewLabel_4.gridy = 5;
					datos.add(lblNewLabel_4, gbc_lblNewLabel_4);
				}
				{
					Categoria = new JTextField("UNKNOW");
					Categoria.setEditable(false);
					GridBagConstraints gbc_Categoria = new GridBagConstraints();
					gbc_Categoria.anchor = GridBagConstraints.WEST;
					gbc_Categoria.insets = new Insets(0, 0, 5, 5);
					gbc_Categoria.gridx = 1;
					gbc_Categoria.gridy = 5;
					datos.add(Categoria, gbc_Categoria);
					Categoria.setColumns(10);
				}
				{
					JLabel lblNewLabel_5 = new JLabel("SubCategoria:");
					GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
					gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_5.gridx = 2;
					gbc_lblNewLabel_5.gridy = 5;
					datos.add(lblNewLabel_5, gbc_lblNewLabel_5);
				}
				{
					SubCategoria = new JTextField("UNKNOW");
					SubCategoria.setEditable(false);
					GridBagConstraints gbc_SubCategoria = new GridBagConstraints();
					gbc_SubCategoria.insets = new Insets(0, 0, 5, 0);
					gbc_SubCategoria.fill = GridBagConstraints.HORIZONTAL;
					gbc_SubCategoria.gridx = 3;
					gbc_SubCategoria.gridy = 5;
					datos.add(SubCategoria, gbc_SubCategoria);
					SubCategoria.setColumns(10);
				}
				{
					JLabel lblNewLabel = new JLabel("Cantidad");
					GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
					gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel.gridx = 0;
					gbc_lblNewLabel.gridy = 6;
					datos.add(lblNewLabel, gbc_lblNewLabel);
				}
				{
					Cantidad = new JSpinner();
					GridBagConstraints gbc_Cantidad = new GridBagConstraints();
					gbc_Cantidad.fill = GridBagConstraints.HORIZONTAL;
					gbc_Cantidad.insets = new Insets(0, 0, 5, 5);
					gbc_Cantidad.gridx = 1;
					gbc_Cantidad.gridy = 6;
					datos.add(Cantidad, gbc_Cantidad);
				}
				{
					JSeparator separator = new JSeparator();
					GridBagConstraints gbc_separator = new GridBagConstraints();
					gbc_separator.insets = new Insets(0, 0, 5, 0);
					gbc_separator.gridwidth = 4;
					gbc_separator.fill = GridBagConstraints.HORIZONTAL;
					gbc_separator.gridx = 0;
					gbc_separator.gridy = 7;
					datos.add(separator, gbc_separator);
				}
				{
					JLabel lblNewLabel_16 = new JLabel("Descripcion:");
					GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
					gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_16.gridx = 0;
					gbc_lblNewLabel_16.gridy = 8;
					datos.add(lblNewLabel_16, gbc_lblNewLabel_16);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.gridwidth = 3;
					gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 1;
					gbc_scrollPane.gridy = 8;
					datos.add(scrollPane, gbc_scrollPane);
					{
						Descripcion = new JTextArea();
						Descripcion.setEditable(false);
						scrollPane.setViewportView(Descripcion);
					}
				}
				{
					JLabel lblNotas = new JLabel("Notas:");
					GridBagConstraints gbc_lblNotas = new GridBagConstraints();
					gbc_lblNotas.insets = new Insets(0, 0, 5, 5);
					gbc_lblNotas.gridx = 0;
					gbc_lblNotas.gridy = 9;
					datos.add(lblNotas, gbc_lblNotas);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.gridwidth = 3;
					gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 1;
					gbc_scrollPane.gridy = 9;
					datos.add(scrollPane, gbc_scrollPane);
					{
						Notas = new JTextArea();
						Notas.setEditable(false);
						scrollPane.setViewportView(Notas);
					}
				}
			}
			{
				JPanel imagenes = new JPanel();
				splitPane.setRightComponent(imagenes);
				GridBagLayout gbl_imagenes = new GridBagLayout();
				gbl_imagenes.columnWidths = new int[]{150, 0};
				gbl_imagenes.rowHeights = new int[]{0, 150, 0, 75, 0, 0, 0};
				gbl_imagenes.columnWeights = new double[]{1.0, Double.MIN_VALUE};
				gbl_imagenes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				imagenes.setLayout(gbl_imagenes);
				{
					JLabel lblNewLabel_17 = new JLabel("Imagen:");
					GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
					gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 0);
					gbc_lblNewLabel_17.gridx = 0;
					gbc_lblNewLabel_17.gridy = 0;
					imagenes.add(lblNewLabel_17, gbc_lblNewLabel_17);
				}
				{
					String root = "src/Assets/img/imagenop.png";
					
					JLabel Imagen = new JLabel();
					ImageIcon image = new ImageIcon(root);
					Image image2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					Imagen.setIcon(new ImageIcon(image2));
					
					Imagen.setHorizontalAlignment(SwingConstants.CENTER);
					Imagen.setPreferredSize(new Dimension(250,250));
					GridBagConstraints gbc_Imagen = new GridBagConstraints();
					gbc_Imagen.fill = GridBagConstraints.VERTICAL;
					gbc_Imagen.insets = new Insets(0, 0, 5, 0);
					gbc_Imagen.gridx = 0;
					gbc_Imagen.gridy = 1;
					imagenes.add(Imagen, gbc_Imagen);
				}
				{
					JLabel lblNewLabel_19 = new JLabel("Codigo de barras:");
					GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
					gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 0);
					gbc_lblNewLabel_19.gridx = 0;
					gbc_lblNewLabel_19.gridy = 2;
					imagenes.add(lblNewLabel_19, gbc_lblNewLabel_19);
				}
				{
					JLabel CodigoBarra = new JLabel("Codigo");
					CodigoBarra.setHorizontalAlignment(SwingConstants.CENTER);
					CodigoBarra.setPreferredSize(new Dimension(250,150));
					GridBagConstraints gbc_CodigoBarra = new GridBagConstraints();
					gbc_CodigoBarra.insets = new Insets(0, 0, 5, 0);
					gbc_CodigoBarra.gridx = 0;
					gbc_CodigoBarra.gridy = 3;
					imagenes.add(CodigoBarra, gbc_CodigoBarra);
				}
				{
					Codigo = new JTextField();
					Codigo.setEditable(false);
					Codigo.setHorizontalAlignment(SwingConstants.CENTER);
					GridBagConstraints gbc_Codigo = new GridBagConstraints();
					gbc_Codigo.insets = new Insets(0, 0, 5, 0);
					gbc_Codigo.fill = GridBagConstraints.HORIZONTAL;
					gbc_Codigo.gridx = 0;
					gbc_Codigo.gridy = 4;
					imagenes.add(Codigo, gbc_Codigo);
					Codigo.setColumns(10);
				}
				{
					btnActualizarImagen = new JButton("Actualizar img");
					btnActualizarImagen.setEnabled(false);
					GridBagConstraints gbc_btnActualizarImagen = new GridBagConstraints();
					gbc_btnActualizarImagen.anchor = GridBagConstraints.SOUTHEAST;
					gbc_btnActualizarImagen.gridx = 0;
					gbc_btnActualizarImagen.gridy = 5;
					imagenes.add(btnActualizarImagen, gbc_btnActualizarImagen);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				BtnAgregar = new JButton("Agregar");
				BtnAgregar .setActionCommand("OK");
				buttonPane.add(BtnAgregar );
				getRootPane().setDefaultButton(BtnAgregar );
			}
		}
	}

}
