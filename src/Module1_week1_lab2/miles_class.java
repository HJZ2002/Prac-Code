package Module1_week1_lab2;
import javax.swing.JOptionPane;
public class miles_class {

	public static void main(String[] args) {
		//hair of strands
		
		int hairofstrands=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The number of hair strands","Hair of strands",JOptionPane.QUESTION_MESSAGE));
		
		double lengthCM=0;
		
		for (int i = 1;i<= hairofstrands;i++) {
			 double cmLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length of the strand(in length)", "Centimeter", JOptionPane.QUESTION_MESSAGE));
	         lengthCM += cmLength;
	         
	         double hairLenAverage = lengthCM / hairofstrands;
	         
	         //1km = 100000cm = 0.62 miles
	         
	         double lengthKM = lengthCM/100000;
	         double lengthmile = lengthCM / 160934.4;
	         

	         String results = ("Cory Khong's has " + hairofstrands + " hair strands with an average length of " + hairLenAverage + " cm." + 
	                           "\nThe length of her hair is " + lengthKM + " km or " + lengthmile + " miles." + 
	                           "\nmade By Hosea James Zacarias ");

	         JOptionPane.showMessageDialog(null, results, "Hair", JOptionPane.INFORMATION_MESSAGE);

	         
		}
	}

}
