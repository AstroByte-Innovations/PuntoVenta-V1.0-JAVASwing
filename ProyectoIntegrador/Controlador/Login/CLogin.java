package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CLogin implements ActionListener{

	private VLogin login;
	
	public CLogin() {
		this.login = new VLogin();
		this.login.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
