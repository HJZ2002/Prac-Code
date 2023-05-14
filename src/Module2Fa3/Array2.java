package Module2Fa3;

import javax.swing.JOptionPane;

import Module1_week1_lab2.numbers_program;
public class Array2 {

	public static void main(String[] args) {
		
		int var[]= new int[10];
		String odds="\n Allodd numbers such as   :";
		String evens="\n All even numbers such as :";
		String negatives="\n All negative integers such as :";
		String positives="\n Allpostive integers such as  :";
		String other ="";
		
		for (int i = 0; i<var.length; i++ ) {
			var[i]= Integer.parseInt(JOptionPane.showInputDialog(null," Input an integer my brader"));
			
		}
		for (int i = 0; i<var.length; i++ ) {
			if(var[i] %2 ==0) {
				evens+= var[i] + ",";
			} else {
				odds+=var[i] + ",";
				
			}
			
		}
		for (int i = 0; i<var.length; i++ ) {
			if(var[i] == 0) {
				other = " 0 is neither positive nor negative";
			} else if (var[i]>0) {
				positives+=var[i] + ",";
			} else {
				negatives+=var[i]+ ",";
			}
			String hold = odds +"\n" + evens + "\n" + negatives + "\n" + positives +"\n" + other +"\n";
			JOptionPane.showMessageDialog(null, hold,"Program by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
