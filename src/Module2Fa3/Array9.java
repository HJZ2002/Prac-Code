package Module2Fa3;
import javax.swing.JOptionPane;
public class Array9 {

	public static void main(String[] args) {
		String[]petname = {" Carl "," Rick "," Edith "," Daryl "," Carol "};
		String searchbox = JOptionPane.showInputDialog(null," Enter a pet name brader");
		boolean name = false;
		
		for (int i = 0; i<petname.length; i++){
			if (petname[i].equalsIgnoreCase(searchbox));
			String hold = JOptionPane.showInputDialog(null," Enter a new name for "+ searchbox + ":");
			petname[i]=hold;
			name = true;
			break;
			
		}
		if(!name) {
			JOptionPane.showMessageDialog(null, " Not found");
		}
		searchbox= JOptionPane.showInputDialog(null," Enter a pet name to remove");
		name = false;
		
		String text = " Current pets:\n";
		for(String pet : petname) {
			if(pet !=null) {
				text+= pet+ "n";
			}
		}
		JOptionPane.showMessageDialog(null, text," Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}
}
	
