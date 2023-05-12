package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import General.genericos;
import Principal.CPrincipal;

public class CLogin implements ActionListener, KeyListener{

	private VLogin login;
	private LoginManager loginManager;
	public CLogin() {
		
		try {
			this.loginManager = new LoginManager();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.login = new VLogin();
		this.login.btnSubmit.addActionListener(this);
		this.login.user.addKeyListener(this);
		this.login.password.addKeyListener(this);
		this.login.setVisible(true);
	}
	
	private void submit() {
		this.login.error.setText("");
		String user = this.login.user.getText();
		char[] pass = this.login.password.getPassword();
		String password = new String(pass);
        try {
        	if(!user.isEmpty() || !password.isEmpty()){
    			if (loginManager.userExists(user)) {
    			    if(loginManager.checkPassword(user, password)) {
    				    this.login.dispose();
    				    CPrincipal principal = new CPrincipal();
    			    }else {
    					this.login.error.setText("Contraseña incorrecta");
    			    }
    			}else {
    				this.login.error.setText("El usuario no existe");
    			}
        	}else {
        		this.login.error.setText("No puede existir campos vacios");
        	}
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.login.btnSubmit) {
			this.submit();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {this.submit();}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
