package Module2Fa4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class manipulation {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter integer: "));
		boolean a = isLessthan(x);
		boolean b = isaddition(x);
		String c = Odds(x);
		String d = Evens(x);
		JTextArea message = new JTextArea("Integer\t: "+x
				+"\nisNegative\t: "+a
				+"\nisPositive\t: "+b
				+"\nOdd\t: "+c
				+"\nEven\t: "+d);
		JOptionPane.showMessageDialog(message, message," Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}
	public static boolean isLessthan(int num) {
		if(num<0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isaddition(int num) {
		if(num>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static String Odds(int num) {
		if(num%2!=0) {
			return "Yes";
		}
		else {
			return "No";
		}
		}
		public static String Evens(int num) {
			if(num%2==0) {
				return "Yes";
			}
			else {
				return "No";
			}
		}
	}
