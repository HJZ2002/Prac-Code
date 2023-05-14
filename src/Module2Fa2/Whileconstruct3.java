package Module2Fa2;
import javax.swing.JOptionPane;

public class Whileconstruct3 {

	public static void main(String[] args) {
		
		boolean vowel = true;
		
		String input = JOptionPane.showInputDialog(null,"Enter A Character");
		
		char letters =input.charAt(0);
		
		while(vowel) {
			
			JOptionPane.showMessageDialog(null,"Not that i am expecting brother try again");
			
			input = JOptionPane.showInputDialog(null,"Enter a chracter again");
			
			letters = input.charAt(0);
			
			if (letters == 'a'|| letters == 'e'|| letters == 'i'|| letters == 'o'|| letters == 'u') {
				vowel=false;
			}
		}
		JOptionPane.showMessageDialog(null, "Found a vowel brader. Program terminating", 
				"Created by Hosea James Zacrias", JOptionPane.INFORMATION_MESSAGE);
	}

}
