package General;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class createCellContentSpinner extends JPanel {

	public JSpinner spinner;
	
	public createCellContentSpinner(int inicial, int max) {
	        spinner = new JSpinner(new SpinnerNumberModel(inicial, 1, max, 1));
	        this.add(spinner);
	}

}
