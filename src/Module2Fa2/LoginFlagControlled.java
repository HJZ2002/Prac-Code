package Module2Fa2;

import javax.swing.JOptionPane;
public class LoginFlagControlled {

	public static void main(String[] args) {
		String Username,Password;
		boolean login = false;
		int attemps =0;
		
		while(!login && attemps<3) {
			Username =JOptionPane.showInputDialog(null,"Enter Your Username");
			Password = JOptionPane.showInputDialog(null," Enter The Password");
			if(Username.equals("admin") && Password.equals("pwd123"));
			login = true;
			JOptionPane.showMessageDialog(null, "Log in successful Brader");
			attemps++;
			
		}
		if(!login) {
			JOptionPane.showMessageDialog(null, " You Run out of attemps my brader Program is now terminating.");
		}
	}

}
