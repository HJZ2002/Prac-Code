package Module2Fa2;
import javax.swing.JOptionPane;
public class LoginClass {

	public static void main(String[] args) {
		
		//Created by Hosea James Zacarias :D
		boolean login = false;
		String Username,Password;
		int attemps = 0;
		
		while(attemps <3 && !login) {
			Username=JOptionPane.showInputDialog(null," Enter UserName");
			Password=JOptionPane.showInputDialog(null," Enter Password");
		if(Username.equals("admin")&& Password.equals("pwd123")) { 
			login=true;
			JOptionPane.showMessageDialog(null, " Log-in Successful");
		} else {
			JOptionPane.showMessageDialog(null, "Log-in Failed");
			attemps++;
		}
	} if(!login) {
		JOptionPane.showMessageDialog(null,"You ran out of attempts");
	}
		
	}
}
