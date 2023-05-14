package Module2Fa2;
import javax.swing.JOptionPane;

public class Whileconstruct2 {

	public static void main(String[] args) {
		
		int input = 0 , odd = 0 , even = 0;
		String odds = " \nOdd numbers\n:";
		String evens = " \nEven numbers\n: ";
		String number = " Numbers\n:";
		
		while(input!=-2) {
			input = Integer.parseInt(JOptionPane.showInputDialog(null,"Input a integer (-2 to exit:)"));
			if (input !=-2) {
				number+= input +"";
				
				if(input %2 ==0) {
					evens += input + "";
					even++;
				} else {
					odds += input + "";
					odd++;
				}
			}
		}
		String message = number + odds + evens + " \nOdd \t" + odd + " \nEven \t" + even;
		JOptionPane.showMessageDialog(null,message,"Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}

}