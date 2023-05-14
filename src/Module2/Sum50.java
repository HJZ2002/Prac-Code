package Module2;
import javax.swing.JOptionPane;
public class Sum50 {
	public static void main(String[] args) {
		
		
		int num = 0;
		for (int i = 1; i<=50; i++) {
			num+=i;
			
		}
		String hold ="The sum of numbers from 1 to 50 is "+ num;
		JOptionPane.showMessageDialog(null, hold,"Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}
}
