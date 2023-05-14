package Module2Fa3;
import javax.swing.JOptionPane;
public class Array5 {

	public static void main(String[] args) {
		int var[]= new int[10];
		int val = var.length-1;
		String message = " if array elements are:\n";
		String hold ="\n The reverse is:\n";
		
		for (int i = 0; i<var.length;i++) {
			var[i] = Integer.parseInt(JOptionPane.showInputDialog(null," Input integer: \n"));
			
		}
		for (int i = 0; i<var.length;i++) {
			if (i == 9) {
				message += var[i];
			} else {
				message+= var[i];
				
			}
		}
		for (int i = 0; i<var.length;i++) {
			if(i ==9) {
				hold+= var[i];
			} else {
				hold+= var[i] + " ,";
			}
			val--;
		}
		JOptionPane.showMessageDialog(null, message + hold, "Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}

}
