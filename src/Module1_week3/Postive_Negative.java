package Module1_week3;
import javax.swing.JOptionPane;
public class Postive_Negative {

	public static void main(String[] args) {
		
		double number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number ","Number momment",JOptionPane.PLAIN_MESSAGE));
		
		String Postive = (number + " is a postive number");
		String Negative = (number + " is a negative number");
		String Zero = (number + " is a zero number");
		
		if (number > 0) {
			JOptionPane.showMessageDialog(null, Postive,"Result",JOptionPane.PLAIN_MESSAGE);
		}else if (number<0){
			JOptionPane.showMessageDialog(null, Negative,"Result",JOptionPane.PLAIN_MESSAGE);
		}else if (number<0){
			JOptionPane.showMessageDialog(null, Zero,"Result",JOptionPane.PLAIN_MESSAGE);
		}
	}
		
}