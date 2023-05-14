package Module2Fa3;

import javax.swing.JOptionPane;
public class Array7 {

	public static void main(String[] args) {
		
		int var[] = new int[10];
		int val = -1;
		String message = "If array elements are : ";
		String hold = "";
		
		for (int i = 0; i<var.length; i++) {
			var[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input integer\t: "));
		}
		for (int i = 0; i<var.length; i++) {
			if (i == 9) {
				message += var[i] + ".";
			}else {
				message += var[i] + ", ";
			}
		}
		int searchbox = Integer.parseInt(JOptionPane.showInputDialog(null, "Search a value: "));
		for (int i = 0; i<var.length; i++) {
			if (var[i] == searchbox) {
				val = i;
				break;
			}
		}
		if (val == -1) {
			hold += searchbox + " is NOT Found.";
		}else {
			hold += searchbox + " has found the value  " + val + ".";
		}
		String text = message + "\nSearch a value: " + searchbox + "\n" + hold;
		JOptionPane.showMessageDialog(null, hold, "Created by Hosea James Zacarias", JOptionPane.INFORMATION_MESSAGE);
	}

}
