package Module2Fa3;
import javax.swing.JOptionPane;
public class Array4 {

	public static void main(String[] args) {
		
		//Created by Hosea James Zacarias
		 int[] num = {34, 67, 45, 45, 12, 1, 5, 18, 8, 8, 34, 67, 5, 34, 12, 18, 45, 5, 8, 1};
	        
	        JOptionPane.showMessageDialog(null, "The array values are:\n" + arrayToString(num));
	        String message = "";
	        for (int i = 0; i < num.length - 1; i++) {
	            int count = 1;
	            for (int j = i + 1; j < num.length; j++) {
	                if (num[i] == num[j]) {
	                    count++;
	                    num[j] = -1; 
	                }
	            }
	            if (count > 1) {
	                message += num[i] + " -> " + count + " times\n";
	            }
	        }
	        
	        
	        if (!message.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "The duplicated integers and how many times they appear in the array are:\n" + message);
	        } else {
	            JOptionPane.showMessageDialog(null, "There are no duplicated integers in the array.");
	        }
	    }
	    public static String arrayToString(int[] arr) {
	        String result = "";
	        for (int i = 0; i < arr.length; i++) {
	            result += arr[i];
	            if (i < arr.length - 1) {
	                result += ", ";
	            }
	        }
	        return result;
	    }
	}
