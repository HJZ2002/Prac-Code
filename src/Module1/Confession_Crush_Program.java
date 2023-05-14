package Module1;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;
public class Confession_Crush_Program {

	public static void main(String[] args) {
		int [] array = {45,23,89,90,12,50};
		int val = array[0];
		
		for (int i  =1; i<array.length; i ++) {
			if (val<array[i]) val = array[i];
		}
		System.out.println(val);
  }
}