package Principal;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Logo extends JPanel {

	private JButton grid;
	private JLabel logo;
	
	public Logo() {
		this.setBounds(0, 0, 200, 50);
		this.grid = new JButton();
		ImageIcon imagenCuadricula = new ImageIcon("src/Assets/img/menu.png");
		this.grid.setIcon(imagenCuadricula);
		
		this.logo = new JLabel("Imagen");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon("src/Assets/img/imagen.png");
		this.logo.setIcon(icon);
		
		this.add(grid);
		this.add(logo);
	}

}
