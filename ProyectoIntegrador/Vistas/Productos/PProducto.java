package Productos;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.awt.Color;
import java.awt.Font;

public class PProducto extends JPanel {

	public JButton btnVer;
	
	public PProducto(Producto producto) {
		String root = "src/Assets/img/imagenop.png", codigo = "0000000", nombre = "UNKNOW";
		double precio = 0.00;
		if(producto != null) {
			File imagen = new File("src/Assets/imgProductos/" + producto.getImagen());
			if(imagen.exists()){
				root = "src/Assets/imgProductos/" + producto.getImagen();
			}
			codigo = producto.getCodigo();
			nombre = producto.getNombre();
			precio = producto.getPrecio();
		}
		
		this.setBounds(0, 0, 250, 250);
		this.setBorder(new LineBorder(new Color(0,0,0)));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{85, 0};
		gridBagLayout.rowHeights = new int[]{0, 13, 13, 13, 21, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel imagen = new JLabel("");
		ImageIcon image = new ImageIcon(root);
		Image image2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		
		imagen.setIcon(new ImageIcon(image2));
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		gbc_imagen.insets = new Insets(0, 0, 5, 0);
		gbc_imagen.gridx = 0;
		gbc_imagen.gridy = 0;
		add(imagen, gbc_imagen);
		
		JLabel Codigo = new JLabel(codigo);
		GridBagConstraints gbc_Codigo = new GridBagConstraints();
		gbc_Codigo.insets = new Insets(0, 0, 5, 0);
		gbc_Codigo.gridx = 0;
		gbc_Codigo.gridy = 1;
		add(Codigo, gbc_Codigo);
		
		JLabel Nombre = new JLabel(nombre);
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_Nombre = new GridBagConstraints();
		gbc_Nombre.insets = new Insets(0, 0, 5, 0);
		gbc_Nombre.gridx = 0;
		gbc_Nombre.gridy = 2;
		add(Nombre, gbc_Nombre);
		
		JLabel Precio = new JLabel("$ " + precio);
		Precio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_Precio = new GridBagConstraints();
		gbc_Precio.insets = new Insets(0, 0, 5, 0);
		gbc_Precio.gridx = 0;
		gbc_Precio.gridy = 3;
		add(Precio, gbc_Precio);
		
		btnVer = new JButton(new ImageIcon("src/Assets/img/eye.png"));
		GridBagConstraints gbc_btnVer = new GridBagConstraints();
		gbc_btnVer.gridx = 0;
		gbc_btnVer.gridy = 4;
		add(btnVer, gbc_btnVer);
	}

}
