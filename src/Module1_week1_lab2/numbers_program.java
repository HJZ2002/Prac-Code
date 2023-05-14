package Module1_week1_lab2;

import javax.swing.JOptionPane;


public class numbers_program {

	public static void main(String[] args) {
		
		//variables
		int Numberone,Numbertwo;
		
		
		Numberone = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first number",JOptionPane.QUESTION_MESSAGE));
		
		Numbertwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your second number",JOptionPane.QUESTION_MESSAGE));
		
		//Methods
		
		int addition,subtraction,Multiply;
		double divided;
		
		 addition = Numberone+Numbertwo;
		 subtraction = Numberone-Numbertwo;
		 Multiply = Numberone*Numbertwo;
		 divided = ((double)Numberone/Numbertwo);
		   String result =  (Numberone + " + " + Numbertwo + " = " + addition + 
                   "\n" + Numberone + " - " + Numbertwo + " = " + subtraction + 
                   "\n" + Numberone + " * " + Numbertwo + " = " + Multiply +
                   "\n" + Numberone + " / " + Numbertwo + " = " + divided +
			       "\nmade By Hosea James Zacarias");
                   
  JOptionPane.showMessageDialog(null, result, "Total", JOptionPane.PLAIN_MESSAGE);
	}

}
