package Module2;
import javax.swing.JOptionPane;
public class Vowel {

	public static void main(String[] args) {
		int vowels = 0, consonant =0, zeros = 0 , odds = 0, even =0, special=0;

		String hold = JOptionPane.showInputDialog(null, "Enter a word: ");
		String noSpaces = hold.replace(" ","");
		
		for (int i = 0; i <hold.length(); i++) {
			char a = hold.charAt(i);
			if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
					a == 'A' || a == 'E' || a == 'I' || a == 'U' || a == 'U') {
				vowels++;
			} else {
				consonant++;
			}
			if(Character.isDigit(a)) {
				int num = a - '0';
				if (num == 0) {
					zeros++;
				}else if(num % 2 ==0) {
					even++;
				}else {
					odds++;
				}
			} else {
				special++;
			}
		}
		String text = "String is : " + hold
				+ "\nVowels               : " + vowels
				+ "\nConsonants      : " + consonant 
				+ "\nZero                    : " + zeros
				+ "\nOdd                     : " + odds
				+ "\nEven                    : " + even
				+ "\nSpecial               : " + special;
		JOptionPane.showMessageDialog(null, text,"Created by Hosea James Zacarias ",JOptionPane.INFORMATION_MESSAGE);
	}

}
