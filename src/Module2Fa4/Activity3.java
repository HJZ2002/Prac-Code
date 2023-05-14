package Module2Fa4;
import javax.swing.JOptionPane;
public class Activity3 {

	public static void main(String[] args) {
		
		String hold = JOptionPane.showInputDialog(null," Enter a String");
		String reversed = reverse(hold);
		String a = isPalindrome(reversed,hold);
		
		JOptionPane.showMessageDialog(null,"If the str=\""+hold+a,"Created by: Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	  }
	 public static String reverse(String str) {
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }
	        return reversed;
	 }
	 public static String isPalindrome(String reversed,String str) {
		 if(reversed.equals(str)) {
			 return "\", When the reverse is still \""+str+"\". It is a palindrome.";
		 } else {
			 return "\", When the reverse is still \""+reversed+"\". It is not a  palindrome.";
		 }
	 }
}