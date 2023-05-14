package Module1_week3;
import javax.swing.JOptionPane;

public class MenuCalculatorIf {

	public static void main(String[] args) {
		
		int number1= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first Number","Number",JOptionPane.QUESTION_MESSAGE));
		int number2= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second Number","Number",JOptionPane.QUESTION_MESSAGE));
		
		String mainmenu = " Addition Subtraction Divided Multiply Quit ";
		
		String operator  = JOptionPane.showInputDialog(null, mainmenu, "Choose the Above Operation", JOptionPane.QUESTION_MESSAGE);
		char hg = operator.charAt(0);
		
		if(hg == 'A' || hg == 'a') {
			String output = (number1 + " + " + number2 + " = " + plus(number1,number2) + "\nmade by Hosea James Zacarias");
			JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
		}else if(hg == 'S' || hg == 's'){
			String output = (number1 + " - " + number2 + " = " + less(number1,number2) + "\nmade by Hosea James Zacarias");
			JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
		}else if(hg == 'M' || hg == 'm'){
			String output = (number1 + " * " + number2 + " = " + power(number1,number2) + "\nmade by Hosea James Zacarias");
			JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
		}else if(hg == 'D' || hg == 'd'){
			String output = (number1 + " / " + number2 + " = " + remainder(number1,number2) + "\nmade by Hosea James Zacarias");
			JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
		}else if(hg == 'Q' || hg == 'q'){
			//goodbye
		}
		
	}
	//functions 
	public static int plus(int variable1, int varibale2) {
		int plus = variable1 + varibale2;
		return plus;
	}
	public static int less(int variable1, int varibale2) {
		int product = variable1 - varibale2;
		return product;
    }
	public static int power(int variable1, int varibale2) {
		int power = variable1 * varibale2;
		return power;
  }
	public static float remainder(int variable1, int varibale2) {
		float divided = variable1 / varibale2;
		return divided;
  }
}
	

