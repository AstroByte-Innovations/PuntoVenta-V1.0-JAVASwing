package General;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class createCellContentJButton extends JPanel {

	JButton button;
	
	public createCellContentJButton() {
        button = new JButton("-");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Se presionó el botón");
            }
        });
        this.add(button);
	}

}
