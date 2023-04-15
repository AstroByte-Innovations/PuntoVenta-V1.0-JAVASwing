package Principal;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class Usuario extends JPanel {

	private JLabel img;
	private JLabel Lusuario = new JLabel("Usuario:");
	private JLabel usuario;
	
	public Usuario(String user) {
		this.setBounds(0, 0, 350, 50);
		
		ImageIcon icon = new ImageIcon("src/Assets/img/usuario.png");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{67, 60, 0, 102, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		this.img = new JLabel();
		this.img.setIcon(icon);
		
		
		GridBagConstraints gbc_img = new GridBagConstraints();
		gbc_img.insets = new Insets(0, 0, 0, 5);
		gbc_img.gridx = 1;
		gbc_img.gridy = 0;
		gbc_img.gridheight = 2;
		this.add(img, gbc_img);
		Lusuario.setHorizontalAlignment(SwingConstants.LEFT);
		
		Lusuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_Lusuario = new GridBagConstraints();
		gbc_Lusuario.insets = new Insets(0, 0, 0, 5);
		gbc_Lusuario.gridx = 2;
		gbc_Lusuario.gridy = 0;
		this.add(Lusuario, gbc_Lusuario);
		
		this.usuario = new JLabel(user);
		usuario.setHorizontalAlignment(SwingConstants.LEFT);
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		GridBagConstraints gbc_usuario = new GridBagConstraints();
		gbc_usuario.gridx = 2;
		gbc_usuario.gridy = 1;
		this.add(usuario, gbc_usuario);

	}

}
