package Module2;
import javax.swing.JOptionPane;

public class SumOfNOdd {

	public static void main(String[] args) {
		int var = 1;
		int add = 1;
		String text ="1";
		int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value of n"));
	
		for (int i = 1; i<n; i++) {
			add = add + 2;
			var = var + add;
			text+= " + " + add;
		}
		String hold ="Value of N:" + n + "\n" + text + " = " + var;
		JOptionPane.showMessageDialog(null, hold,"Created by Hosae James Zacarias",JOptionPane.INFORMATION_MESSAGE);
		
	}
}	