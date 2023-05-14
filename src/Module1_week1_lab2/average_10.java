package Module1_week1_lab2;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class average_10 {
	
	 public static void main(String[] args) {
		 int i = 0;
		 int sum = 0;
		 int enternum;
		 double product;
		
		 List<Integer> numList  = new LinkedList<>();
		 
		 while (i<10) {
			 enternum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number ","Guess",JOptionPane.QUESTION_MESSAGE));
			 numList.add(enternum);
			 sum+=enternum;
			 i++;
			 
		 }
		 product = (float)sum/10;
		 String result = (numList+"\nYour Average is" + product +"\nMade by Hosea James Zacarias ");
		 JOptionPane.showMessageDialog(null, result,"Average result ",JOptionPane.INFORMATION_MESSAGE);
		 
  }
}