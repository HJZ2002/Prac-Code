package Module1_week1_lab2;
import javax.swing.JOptionPane;
public class flash_drive {

	public static void main(String[] args) {
		
		  int flash_drive = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The flash drive u have", "Universal Serial Bus", JOptionPane.QUESTION_MESSAGE));
		int gross,dozen,leftovers;
		
		gross =flash_drive/144;
		dozen = (flash_drive%144)/12;
		leftovers =(flash_drive%12);
		
		String Answer =(" Hi Mr.Lee you have " + gross + " gross " + dozen + " dozen " + leftovers + " leftovers ");
		
		JOptionPane.showMessageDialog(null, Answer, "Results", JOptionPane.INFORMATION_MESSAGE);
		
				
	}

}
