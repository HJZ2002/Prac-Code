package Module2;
import javax.swing.JOptionPane;
public class ForSquared {
	
	public static void main(String[] args) {
		int var;
		int odd;
		int add =0;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Value of n"));
		
		String hold = "Value of N: " + a + "\n";
		for (var = 1; var <=a; var++) {
			odd = var *var;
			hold+= odd + "+";
			
			add+= odd;
		}
		hold = hold.substring(0,hold.length()-3);
		hold += "=" +add;
		JOptionPane.showMessageDialog(null, hold,"Program by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}

}
