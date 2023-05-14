package Module2Fa3;
import javax.swing.JOptionPane;
public class Array {

	public static void main(String[] args) {
		
		//Program by Hosea James Zacarias
		int num[]=new int[10];
		int first=0, last=0, atIndex=0;
		String all="";
		//a. Loop to store 10 numbers to array
		for (int i = 0; i <num.length; i++) {
		 //Your codes here...
			num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));
		}
		//b. Loop to display values from Array - use 'all.'
		for (int i = 0; i <num.length; i++) {
		 //Your codes here...
			all += num[i] + " ";
		}
		JOptionPane.showMessageDialog(null,"Array Elements are\t: "+all);
		//Codes here to determine the first value
		first = num[0];
		JOptionPane.showMessageDialog(null,"The first value is \t: "+first);
		//Codes here to determine the last value
		last = num[9];
		JOptionPane.showMessageDialog(null,"The last value is\t: "+last);
		//Codes here to determine the search value through the index
		atIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a value to search the index using the value: "));
		JOptionPane.showMessageDialog(null,"The value at index "+atIndex+" is\t:"+num[atIndex]);
		//Codes here to change a value of array elements through the index
		num[atIndex] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number to change the value at the specified index: "));
		JOptionPane.showMessageDialog(null,"The value at index "+atIndex+" is\t:"+num[atIndex]);
	}

}