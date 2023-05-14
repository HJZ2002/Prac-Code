package Module2;
import javax.swing.JOptionPane;
public class PalindromeOrNotPalindrome {

	public static void main(String[] args) {
		String text = JOptionPane.showInputDialog(null," Enter your message my brader");
		
		String hold = "", message;
		for (int i =(text.length()-1); i>=0; i--) {
			hold+= text.charAt(i);
		}
		if (text.equalsIgnoreCase(hold)) {
			message = text + " is a palindrome";
			
		} else {
			message = text + " is not a palindrome";
			
		} JOptionPane.showMessageDialog(null, message," Program by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}

}
