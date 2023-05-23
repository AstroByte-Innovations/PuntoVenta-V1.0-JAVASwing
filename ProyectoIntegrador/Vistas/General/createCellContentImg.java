package General;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class createCellContentImg extends JPanel {

	private JLabel img;
	public createCellContentImg(String url) {
		ImageIcon img = new ImageIcon(url);
		Image icono = img.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		this.img = new JLabel(new ImageIcon(icono));
        this.add(this.img);
	}

}
