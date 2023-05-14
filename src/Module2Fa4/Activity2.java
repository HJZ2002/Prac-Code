package Module2Fa4;
import javax.swing.JOptionPane;
public class Activity2 {

	public static void main(String[] args) {
		
		//Created by Hosea James Zacarias
		int variable = Integer.parseInt(JOptionPane.showInputDialog(null," Enter a Binary Number"));
		String z = num(variable);
		JOptionPane.showMessageDialog(null, variable + " to binary is "+z);
		
	    }
	public static String num(int val) {
		if(val==0) {
			return "0";
		}
		StringBuilder Binary = new StringBuilder();
		while (val>0) {
			int n = val % 2;
			Binary.insert(0, n);
			val /= 2;
		}
		return Binary.toString();
	}
}