package Module2Fa3;

import javax.swing.JOptionPane;
public class Array3 {

	public static void main(String[] args) {
		
		//Created by Hosea James Zacarias
		int max = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Max Capacity"));
		int var1[] = new int[max];
		String max1 ="";
		
		for (int i = 0; i< var1.length; i ++) {
			var1[i] = Integer.parseInt(JOptionPane.showInputDialog(null," Input Integer brader"));
			
		}
		int lowest = var1[0];
		int highest = var1[0];
		
		for (int i = 0; i< var1.length; i ++) {
			
			if(var1[i]<lowest) {
				lowest = var1[i];
			}
			
		}
		for (int i = 0; i< var1.length; i ++) {
			if(var1[i]>highest) {
				highest = var1[i];
			}
				
		}
		for (int i = 0; i< var1.length; i ++) {
			max1+= var1[i] + " ";
		}
		String message = "\nThe lowest is " + lowest + "\nThe highest is " + highest;
		JOptionPane.showMessageDialog(null, max1 + message);

	}

}
