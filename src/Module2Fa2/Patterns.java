package Module2Fa2;
import javax.swing.JOptionPane;
public class Patterns {

	public static void main(String[] args) {
		
		String message ="";
		//Created by Hosea James Zacarias
		String pattern = "",pattern2 ="",pattern3="";
		
		//Pattern1
		StringBuilder pattern1 = new StringBuilder(" Pattern 1\n");
	    for (int i = 1; i <= 6; i++) {
	      for (int j = 1; j <= i; j++) {
	        pattern1.append("*");
	      }
	      pattern1.append("\n");
	    }
	    JOptionPane.showMessageDialog(null, pattern1);
	    
	    
	    //Pattern 2
	    for (int i = 1; i <= 5; i++) {
	      for (int j = 1; j <= 2*i-1; j++) {
	    	  pattern2=("*");
	      }
	      pattern2=("\n");
	    }
	    for (int r = 0; r < 5; r++) {
		    for (int i = r; i < 4; i++) {
		        pattern2 += " ";
		    }
		    for (int j = 0; j < 2 * r + 1; j++) {
		        pattern2 += "*";
		    }
		    pattern2 += "\n";
		}
		JOptionPane.showMessageDialog(null, pattern2);
	    
	    //pattern 3
	    for (int r=6; r>0; r--) {
			pattern3 += "\n";
			for(int i=6; i>=r;i--) {
				pattern3 += "*";
			}
		}
		JOptionPane.showMessageDialog(null, pattern3);
	}

}
