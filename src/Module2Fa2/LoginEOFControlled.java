package Module2Fa2;

import javax.swing.JOptionPane;
public class LoginEOFControlled {

	public static void main(String[] args) {
		String Username,Password;
		boolean login = false;
		
		while(!login) {
			Username = JOptionPane.showInputDialog(null," Enter Your username brader(EOF to Quit)");
			
			if (Username==null) {
				break;
			}
			Password = JOptionPane.showInputDialog(null," Enter Your Password (EOF to Quit)");
			if (Password==null) {
				break;
			} 
			if (Username.equals("admin") && Password.equals("pwd123")) {
				login = true;
				JOptionPane.showMessageDialog(null, "Login Successful");
			} else {
				JOptionPane.showMessageDialog(null, "Login Failed");
			}
			if(!login) {
				JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating");
			}
		}
	}

}