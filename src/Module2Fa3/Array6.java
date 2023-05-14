package Module2Fa3;

import javax.swing.JOptionPane;
public class Array6 {

	public static void main(String[] args) {
		//variables
		int[]original = new int[15];
		int[]copy = new int[15];
		
		//input
		for (int i = 0; i <15; i++) {
			String input = JOptionPane.showInputDialog(null," Enter an Integer");
			original[i]= Integer.parseInt(input.trim());
			
		} for (int i = 0; i <15; i++) {
			copy[i]= original[i];
		}
		 String message = "Elements of original array:\n";
		 for (int i = 0; i <15; i++) {
			 message+= original[i] + ",";
		 }
		 message = message.substring(0,message.length()-2) + "\n";
		 
		 message+= " Elements of copied in an array";
		 
		 for (int i = 0; i <15; i++) {
			 message+= copy[i] + ",";
		 }
		 message = message.substring(0,message.length()-2);
		 JOptionPane.showMessageDialog(null, message,"Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}
}
