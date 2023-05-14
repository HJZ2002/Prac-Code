package Module2Fa2;
import javax.swing.JOptionPane;

public class oddnumbers_evennumbers {

	public static void main(String[] args) {
		
		int inputs;
		int sum = 0;
		double avg = 0;
		int firstvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first integer ",JOptionPane.QUESTION_MESSAGE));
		int secondvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second integer",JOptionPane.QUESTION_MESSAGE));
		int numOfInputs = (secondvalue - firstvalue) + 1;
		
		while (secondvalue < firstvalue) {
			JOptionPane.showMessageDialog(null, "Try again brother it must be greater than " + firstvalue, "Try again", JOptionPane.WARNING_MESSAGE);
			secondvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second integer again: "));
		}
		
		
		while (firstvalue <= secondvalue) {
			inputs = Integer.parseInt(JOptionPane.showInputDialog(null, "Input integer again "));
			sum += inputs;
			firstvalue++;
		}
		
		avg = (double)sum / (double)numOfInputs; 
		String hold = "Total sum: " + sum + String.format("\nAverage: %.2f", avg);
		JOptionPane.showMessageDialog(null, hold, "Created by Hosea James Zacarais", JOptionPane.INFORMATION_MESSAGE);
	}

}