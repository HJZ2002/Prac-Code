package Module1_week3;
import javax.swing.JOptionPane;

public class TopNotcher {

	public static void main(String[] args) {
		
		int thebestgrade = 0;
		
		int grade1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade1 > thebestgrade) {
			thebestgrade = grade1;
		}
		
		int grade2   = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade2 > thebestgrade) {
			thebestgrade = grade2;
		}
		
		int grade3  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade3 > thebestgrade) {
			thebestgrade = grade3;
		}
		
		int grade4  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade4 > thebestgrade) {
			thebestgrade = grade4;
		}
		
		int grade5  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade5 > thebestgrade) {
			thebestgrade = grade5;
		}
		
		int grade6  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade6 > thebestgrade) {
			thebestgrade = grade6;
		}
		
		int grade7  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade7 > thebestgrade) {
			thebestgrade = grade7;
		}
		
		int grade8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade8 > thebestgrade) {
			thebestgrade = grade8;
		}
		
		int grade9  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade9 > thebestgrade) {
			thebestgrade = grade9;
		}
		
		int grade10 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number provided","Ello",JOptionPane.QUESTION_MESSAGE));
		if(grade10 > thebestgrade) {
			thebestgrade = grade10;
		}
		String display =("The Highest score of all time " + thebestgrade + "\nMade by me Hosea James Zacarias ");
		
		JOptionPane.showMessageDialog(null, display," Here is the result",JOptionPane.PLAIN_MESSAGE);
	}
}