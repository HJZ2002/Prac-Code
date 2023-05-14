package Module1_week2;
import javax.swing.JOptionPane;

public class String_manager {

	public static void main(String[] args) {
		String str1 = "God is real";
		String str2 = "UNLeSs";
		
		char task = str1.charAt(7);
		int  task1 = str2.indexOf('S');
		String task2=str1.toUpperCase();
		String task3= str2.toLowerCase();
		String task4 =str1.replace("[aeiou", " x ");
		int str1len= str1.length();
		int str2len= str2.length();
		
		String equals = ("The 8 character of str1 is " + task +
				"\nThe index of 's' in str2 is " + task1 +
		          "\nstr1 in uppercase: " + task2 +
		          "\nstr2 in lowercase: " + task3 +
		          "\nstr1 with vowels replaced: " + task4 + 
		          "\nLength of str1: " + str1len +
		          "\nLength of str2: " + str2len);
		JOptionPane.showMessageDialog(null, equals,"The results are in ",JOptionPane.PLAIN_MESSAGE);
		
		String equals2 = JOptionPane.showInputDialog(null, "Enter your statement", "Statement?", JOptionPane.QUESTION_MESSAGE);
		String sentence = (str1 + "" + str2+ "" + equals2);
		
		int number2 = sentence.length();
		
		String number3 = "";
		if (sentence .contains("an interger")) {
			number3 ="The word \nAninterger\"is present in sentence.";
		} else {
			number3 = "The word \"an integer\" is not present in the sentence.";
		}
		
		String number4 ="";
		boolean isEqual=sentence.substring(16,18).equals(str1.substring(5,7));
	if(isEqual) {
		number4 = ("The word \"is\" is present in str1.");
	}else {
		number4 = ("The word \"is\" is not present in str1.");
		
	}
	StringBuilder sb = new StringBuilder(str2);
	String number5 =sb.reverse().toString();
	String result2 = (sentence + 
	          "\nThe length of the sentence is " + number2 +
	          "\n" + number3 + 
	          "\n" + number4 + 
	          "\n" + number5 +
			"\nmade by me Hosea James Zacarias");
	JOptionPane.showMessageDialog(null, result2, "RESULTS ARE IN", JOptionPane.PLAIN_MESSAGE);            
	
			
	}

}
