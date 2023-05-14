package Module2Fa2;

import javax.swing.JOptionPane;
public class LoginSentinelControl {

	public static void main(String[] args) {
		
		//Created by Hosea James Zacarias
		 String Username, Password;
	        boolean loggedIn = false;

	        do {
	            Username = JOptionPane.showInputDialog("Enter your username:");
	            Password = JOptionPane.showInputDialog("Enter your password:");

	            if (Username.equals("admin") && Password.equals("pwd123")) {
	                loggedIn = true;
	                JOptionPane.showMessageDialog(null, "Log-in successful");
	            } else {
	                JOptionPane.showMessageDialog(null, "Log-in failed");
	            }
	        } while (!loggedIn && JOptionPane.showConfirmDialog(null, "Try again?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

	        if (!loggedIn) {
	            JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating");
	        }
	    }

	}