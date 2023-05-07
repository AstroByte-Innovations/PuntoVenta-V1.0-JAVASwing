package Productos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VerProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField Tipo;
	private JTextField Estado;
	private JTextField Precio;
	private JTextField Costo;
	private JTextField Categoria;
	private JTextField SubCategoria;
	private JTextField ID;
	private JTextField WEB;
	private JTextField Telefono;
	private JTextField Correo;
	private JTextField NombreProveedor;
	private JTextField ApellidoProveedor;
	private JTextField NombreComercial;
	private JTextField GiroComercial;


	public VerProducto(Producto producto) {
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
				gbl_datos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_datos.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
				gbl_datos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
				datos.setLayout(gbl_datos);
				{
					JLabel lblNewLabel = new JLabel("ID: ");
					GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
					gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel.gridx = 0;
					gbc_lblNewLabel.gridy = 0;
					datos.add(lblNewLabel, gbc_lblNewLabel);
				}
				{
					ID = new JTextField();
					ID.setEditable(false);
					GridBagConstraints gbc_ID = new GridBagConstraints();
					gbc_ID.insets = new Insets(0, 0, 5, 5);
					gbc_ID.fill = GridBagConstraints.HORIZONTAL;
					gbc_ID.gridx = 1;
					gbc_ID.gridy = 0;
					datos.add(ID, gbc_ID);
					ID.setColumns(10);
				}
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
					JTextArea NombreProducto = new JTextArea();
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
					Tipo = new JTextField();
					Tipo.setEditable(false);
					GridBagConstraints gbc_Tipo = new GridBagConstraints();
					gbc_Tipo.anchor = GridBagConstraints.WEST;
					gbc_Tipo.insets = new Insets(0, 0, 5, 0);
					gbc_Tipo.gridx = 3;
					gbc_Tipo.gridy = 1;
					datos.add(Tipo, gbc_Tipo);
					Tipo.setColumns(10);
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
					Precio = new JTextField();
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
					Estado = new JTextField();
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
					Costo = new JTextField();
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
					Categoria = new JTextField();
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
					SubCategoria = new JTextField();
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
					JSeparator separator = new JSeparator();
					GridBagConstraints gbc_separator = new GridBagConstraints();
					gbc_separator.gridwidth = 4;
					gbc_separator.fill = GridBagConstraints.HORIZONTAL;
					gbc_separator.insets = new Insets(0, 0, 5, 0);
					gbc_separator.gridx = 0;
					gbc_separator.gridy = 6;
					datos.add(separator, gbc_separator);
				}
				{
					JLabel lblNewLabel_8 = new JLabel("Proveedor");
					lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
					gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
					gbc_lblNewLabel_8.gridwidth = 2;
					gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_8.gridx = 0;
					gbc_lblNewLabel_8.gridy = 7;
					datos.add(lblNewLabel_8, gbc_lblNewLabel_8);
				}
				{
					JLabel lblNewLabel_9 = new JLabel("Nombre");
					GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
					gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_9.gridx = 0;
					gbc_lblNewLabel_9.gridy = 8;
					datos.add(lblNewLabel_9, gbc_lblNewLabel_9);
				}
				{
					NombreProveedor = new JTextField();
					NombreProveedor.setEditable(false);
					GridBagConstraints gbc_NombreProveedor = new GridBagConstraints();
					gbc_NombreProveedor.insets = new Insets(0, 0, 5, 5);
					gbc_NombreProveedor.fill = GridBagConstraints.HORIZONTAL;
					gbc_NombreProveedor.gridx = 1;
					gbc_NombreProveedor.gridy = 8;
					datos.add(NombreProveedor, gbc_NombreProveedor);
					NombreProveedor.setColumns(10);
				}
				{
					JLabel lblNewLabel_13 = new JLabel("Telefono: ");
					GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
					gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_13.gridx = 2;
					gbc_lblNewLabel_13.gridy = 8;
					datos.add(lblNewLabel_13, gbc_lblNewLabel_13);
				}
				{
					Telefono = new JTextField();
					Telefono.setEditable(false);
					GridBagConstraints gbc_Telefono = new GridBagConstraints();
					gbc_Telefono.insets = new Insets(0, 0, 5, 0);
					gbc_Telefono.fill = GridBagConstraints.HORIZONTAL;
					gbc_Telefono.gridx = 3;
					gbc_Telefono.gridy = 8;
					datos.add(Telefono, gbc_Telefono);
					Telefono.setColumns(10);
				}
				{
					JLabel lblNewLabel_10 = new JLabel("Apellido: ");
					GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
					gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_10.gridx = 0;
					gbc_lblNewLabel_10.gridy = 9;
					datos.add(lblNewLabel_10, gbc_lblNewLabel_10);
				}
				{
					ApellidoProveedor = new JTextField();
					ApellidoProveedor.setEditable(false);
					GridBagConstraints gbc_ApellidoProveedor = new GridBagConstraints();
					gbc_ApellidoProveedor.anchor = GridBagConstraints.ABOVE_BASELINE;
					gbc_ApellidoProveedor.insets = new Insets(0, 0, 5, 5);
					gbc_ApellidoProveedor.fill = GridBagConstraints.HORIZONTAL;
					gbc_ApellidoProveedor.gridx = 1;
					gbc_ApellidoProveedor.gridy = 9;
					datos.add(ApellidoProveedor, gbc_ApellidoProveedor);
					ApellidoProveedor.setColumns(10);
				}
				{
					JLabel lblNewLabel_14 = new JLabel("Correo: ");
					GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
					gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_14.gridx = 2;
					gbc_lblNewLabel_14.gridy = 9;
					datos.add(lblNewLabel_14, gbc_lblNewLabel_14);
				}
				{
					Correo = new JTextField();
					Correo.setEditable(false);
					GridBagConstraints gbc_Correo = new GridBagConstraints();
					gbc_Correo.insets = new Insets(0, 0, 5, 0);
					gbc_Correo.fill = GridBagConstraints.HORIZONTAL;
					gbc_Correo.gridx = 3;
					gbc_Correo.gridy = 9;
					datos.add(Correo, gbc_Correo);
					Correo.setColumns(10);
				}
				{
					JLabel lblNewLabel_11 = new JLabel("Nombre Comercial");
					GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
					gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_11.gridx = 0;
					gbc_lblNewLabel_11.gridy = 10;
					datos.add(lblNewLabel_11, gbc_lblNewLabel_11);
				}
				{
					NombreComercial = new JTextField();
					NombreComercial.setEditable(false);
					GridBagConstraints gbc_NombreComercial = new GridBagConstraints();
					gbc_NombreComercial.insets = new Insets(0, 0, 5, 5);
					gbc_NombreComercial.fill = GridBagConstraints.HORIZONTAL;
					gbc_NombreComercial.gridx = 1;
					gbc_NombreComercial.gridy = 10;
					datos.add(NombreComercial, gbc_NombreComercial);
					NombreComercial.setColumns(10);
				}
				{
					JLabel lblNewLabel_15 = new JLabel("Sitio WEB");
					GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
					gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_15.gridx = 2;
					gbc_lblNewLabel_15.gridy = 10;
					datos.add(lblNewLabel_15, gbc_lblNewLabel_15);
				}
				{
					WEB = new JTextField();
					WEB.setEditable(false);
					GridBagConstraints gbc_WEB = new GridBagConstraints();
					gbc_WEB.insets = new Insets(0, 0, 5, 0);
					gbc_WEB.fill = GridBagConstraints.HORIZONTAL;
					gbc_WEB.gridx = 3;
					gbc_WEB.gridy = 10;
					datos.add(WEB, gbc_WEB);
					WEB.setColumns(10);
				}
				{
					JLabel lblNewLabel_12 = new JLabel("Giro Comercial");
					GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
					gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_12.gridx = 0;
					gbc_lblNewLabel_12.gridy = 11;
					datos.add(lblNewLabel_12, gbc_lblNewLabel_12);
				}
				{
					GiroComercial = new JTextField();
					GiroComercial.setEditable(false);
					GridBagConstraints gbc_GiroComercial = new GridBagConstraints();
					gbc_GiroComercial.insets = new Insets(0, 0, 5, 5);
					gbc_GiroComercial.fill = GridBagConstraints.HORIZONTAL;
					gbc_GiroComercial.gridx = 1;
					gbc_GiroComercial.gridy = 11;
					datos.add(GiroComercial, gbc_GiroComercial);
					GiroComercial.setColumns(10);
				}
				{
					JButton btnProveedor = new JButton("Ver Proveedor");
					GridBagConstraints gbc_btnProveedor = new GridBagConstraints();
					gbc_btnProveedor.insets = new Insets(0, 0, 5, 0);
					gbc_btnProveedor.gridx = 3;
					gbc_btnProveedor.gridy = 11;
					datos.add(btnProveedor, gbc_btnProveedor);
				}
				{
					JSeparator separator = new JSeparator();
					GridBagConstraints gbc_separator = new GridBagConstraints();
					gbc_separator.insets = new Insets(0, 0, 5, 0);
					gbc_separator.gridwidth = 4;
					gbc_separator.fill = GridBagConstraints.HORIZONTAL;
					gbc_separator.gridx = 0;
					gbc_separator.gridy = 13;
					datos.add(separator, gbc_separator);
				}
				{
					JLabel lblNewLabel_16 = new JLabel("Descripcion:");
					GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
					gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_16.gridx = 0;
					gbc_lblNewLabel_16.gridy = 14;
					datos.add(lblNewLabel_16, gbc_lblNewLabel_16);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.gridwidth = 3;
					gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 1;
					gbc_scrollPane.gridy = 14;
					datos.add(scrollPane, gbc_scrollPane);
					{
						JTextArea Descripcion = new JTextArea();
						Descripcion.setEditable(false);
						scrollPane.setViewportView(Descripcion);
					}
				}
				{
					JLabel lblNotas = new JLabel("Notas:");
					GridBagConstraints gbc_lblNotas = new GridBagConstraints();
					gbc_lblNotas.insets = new Insets(0, 0, 5, 5);
					gbc_lblNotas.gridx = 0;
					gbc_lblNotas.gridy = 15;
					datos.add(lblNotas, gbc_lblNotas);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.gridwidth = 3;
					gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 1;
					gbc_scrollPane.gridy = 15;
					datos.add(scrollPane, gbc_scrollPane);
					{
						JTextArea Notas = new JTextArea();
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
				gbl_imagenes.rowHeights = new int[]{0, 150, 0, 75, 0, 0};
				gbl_imagenes.columnWeights = new double[]{1.0, Double.MIN_VALUE};
				gbl_imagenes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
					JLabel Imagen = new JLabel("A");
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
					JButton btnActualizarImagen = new JButton("Actualizar img");
					GridBagConstraints gbc_btnActualizarImagen = new GridBagConstraints();
					gbc_btnActualizarImagen.anchor = GridBagConstraints.SOUTHEAST;
					gbc_btnActualizarImagen.gridx = 0;
					gbc_btnActualizarImagen.gridy = 4;
					imagenes.add(btnActualizarImagen, gbc_btnActualizarImagen);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton	BtnGuardar = new JButton("Guardar");
				BtnGuardar .setActionCommand("OK");
				buttonPane.add(BtnGuardar );
				getRootPane().setDefaultButton(BtnGuardar );
			}
			{
				JButton BtnCancelar = new JButton("Cancelar");
				BtnCancelar.setActionCommand("Cancel");
				buttonPane.add(BtnCancelar);
			}
			{
				JButton cancelButton = new JButton("Eliminar");
				cancelButton.setActionCommand("Eliminar");
				buttonPane.add(cancelButton);
			}
		}
	}

}
