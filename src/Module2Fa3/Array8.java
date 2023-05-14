package Module2Fa3;
import javax.swing.JOptionPane;
public class Array8 {

	public static void main(String[] args) {
		String petname[] = new String[10];
		String animalname = "If your array contains the following pets :\n";
		String hold ="";
		int val = -1;
		
		for (int i =0; i<petname.length; i++ ) {
			petname[i] = JOptionPane.showInputDialog(null," Input pet your name brather");
			
		}
		for (int i =0; i<petname.length; i++ ) {
			if (i == 9) {
				animalname += "\"" + petname[i] + "\"";
			} else {
				animalname += "\"" + petname[i] + "\"";
			}
		}
		String searchbox = JOptionPane.showInputDialog(null," Type your pet name brader ",null,JOptionPane.WARNING_MESSAGE);
		for (int i =0; i<petname.length; i++ ) {
			if(searchbox.equals(petname[i]));
			val = i;
			break;
		}
		if(val == 1) {
			hold+= " is not found";
			
		} else {
			hold+= " has found the pet name " + val + ",";
		}
		String message = animalname + "\nSearch a value :" + searchbox + "\n" + hold;
		JOptionPane.showMessageDialog(null, message,"Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}
}
