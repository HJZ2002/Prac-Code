package Module1_week3;
import javax.swing.JOptionPane;

public class PointGradeValidation {

	public static void main(String[] args) {
		
		 int Student  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Student ID:", "Student ID is waving", JOptionPane.QUESTION_MESSAGE));
		 String name =JOptionPane.showInputDialog(null,"Enter your name","Name",JOptionPane.PLAIN_MESSAGE);
		 String department =JOptionPane.showInputDialog(null,"Enter your department","department",JOptionPane.PLAIN_MESSAGE);
		 String course =JOptionPane.showInputDialog(null,"Enter your course","course",JOptionPane.PLAIN_MESSAGE);
		 String subject =JOptionPane.showInputDialog(null,"Enter your subject","subject",JOptionPane.PLAIN_MESSAGE);
		 
		 int score = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your first examination score my friend","Examination",JOptionPane.PLAIN_MESSAGE));
		 int score2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your second examination score my friend","Examination",JOptionPane.PLAIN_MESSAGE));
		 int score3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your third examination score my friend","Examination",JOptionPane.PLAIN_MESSAGE));
		 int score4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your fourth examination score my friend","Examination",JOptionPane.PLAIN_MESSAGE));
		 
		 int average =(score + score2 + score3 + score4)/4;
		 float pointGrade = ((float)(110-average))/10;
		 
		 //comments
		 String comments ="";
		 
		 if (average == 100) {
			 comments = "Passed - Excellent";
		 } else if(average <90) {
			 comments = "Passed - Very Good";
		 } else if(average <85) {
			 comments = "Passed - Average";
		 } else if(average <80) {
			 comments = "Passed - Satisfactory";
		 } else if(average <75) {
			 comments = "Failed";
		 } else if(average <50) {
			 comments =" Better luck next time";
		 } else if(average <0) {
			 comments ="0";	 
	}
		 String display = ("********Student Details********" + 
	                "\nStudent ID         : " + Student + 
	                "\nName               : " + name + 
	                "\nDepartment         : " + department +
	                "\nCourse             : " + course +
	                "\nSubject            : " + subject +
	                "\n********Grade Details**********" +
	                "\nFirst    Second    Third    Forth" + "\n" +
	                score + "    " + score2 + "    " + score3 + "    " + score4 +
	                "\nAverage            : " + average +
	                "\nPoint Grade        : " + pointGrade +
	                "\nRemarks            : " + comments + 
	                "\nmade by Hosea James Zacarias ");
	 JOptionPane.showMessageDialog(null, display, "Results", JOptionPane.INFORMATION_MESSAGE);
  }
}
