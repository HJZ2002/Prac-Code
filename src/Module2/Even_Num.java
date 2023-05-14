package Module2;
import javax.swing.JOptionPane;
public class Even_Num {

	public static void main(String[] args) {
		//even
        String hold = "---Using for loop:---";
        for (int i = 2; i <= 50; i += 2) {
            hold += i + " ";
        }
        hold += "\n\n";
        hold += "---Using while loop---";
        int even = 2;
        while (even <= 50) {
            hold += even + " ";
            even += 2;
        }
        hold += "\n\n";
        hold += "---Using do-while loop---";
        int num = 2;
        do {
            hold += num + " ";
            num += 2;
        } while (num <= 50);

        JOptionPane.showMessageDialog(null, hold,"Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
    }
}