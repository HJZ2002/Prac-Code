package Module1_week3;
import javax.swing.JOptionPane;
public class DevelopmentTask {

	public static void main(String[] args) {
		
		int years = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your year/age", " year mommint", JOptionPane.QUESTION_MESSAGE));

		if(years > 60) {
			JOptionPane.showMessageDialog(null, "Later Maturity\nmade by Hosea James Zacarias", "Later Maturity", JOptionPane.INFORMATION_MESSAGE);
		}else if(years > 35 && years <= 60) {
			JOptionPane.showMessageDialog(null, "Middle Age\nmade  by Hosea James Zacarias", "Middle Age", JOptionPane.INFORMATION_MESSAGE);
		}else if(years >= 18 && years <= 35) {
			JOptionPane.showMessageDialog(null, "Early Adulthood\nmade  by Hosea James Zacarias", "Early Adulthood", JOptionPane.INFORMATION_MESSAGE);
		}else if(years >= 13 && years <= 17) {
			JOptionPane.showMessageDialog(null, "Adoloscence\nmade  by Hosea James Zacarias", "Adoloscence", JOptionPane.INFORMATION_MESSAGE);
		}else if(years >= 6 && years <= 12){
			JOptionPane.showMessageDialog(null, "Middle Childhood\nmade  by Hosea James Zacarias", "Middle Childhood", JOptionPane.INFORMATION_MESSAGE);
		}else if(years <= 5) {
			JOptionPane.showMessageDialog(null, "Early Childhood\nmade  by Hosea James Zacarias", "Early Childhood", JOptionPane.INFORMATION_MESSAGE);
		}

		
	}

}

