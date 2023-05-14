package Module1_week1_lab2;

import javax.swing.JOptionPane;

public class employee {

	public static void main(String[] args) {
		
		double SSS = 175.69;
		double Philhealth = 300;
		int gross, rateperhour,hourswork,absences,late;
		double totaldeduction,net;
		
		
		//info
		rateperhour = Integer.parseInt(JOptionPane.showInputDialog(null, "Rate per Hour?", "Hour", JOptionPane.QUESTION_MESSAGE));
		hourswork = Integer.parseInt(JOptionPane.showInputDialog(null, "Hours of work?", "Work", JOptionPane.QUESTION_MESSAGE));
		absences = Integer.parseInt(JOptionPane.showInputDialog(null, "Days of Absences ?", "Absences", JOptionPane.QUESTION_MESSAGE));
		late = Integer.parseInt(JOptionPane.showInputDialog(null, "Days of late ?", "late", JOptionPane.QUESTION_MESSAGE));
		
		
		//total
		gross = rateperhour*hourswork;
		totaldeduction = (absences*5.75) + (late*3.25) + SSS + Philhealth;
		net = gross - totaldeduction;
		
		String output = ("You've worked for more than " + hourswork + " with the rate of hours " + rateperhour + " per hour with " + 
                absences + " times absent and " + late + " hours late." + "\nYour Final Payment is  $" + String.format("%.2f", net));
		
		JOptionPane.showMessageDialog(null, output,"Here is your payment for today ",JOptionPane.INFORMATION_MESSAGE);
	}

}
