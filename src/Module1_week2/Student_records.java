package Module1_week2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class Student_records {
    public static void main(String[] args) {
    	//input
        String name = JOptionPane.showInputDialog(null,"Enter Student name","Information",
        		JOptionPane.INFORMATION_MESSAGE);
        String course = JOptionPane.showInputDialog(null,"Enter Course","Course?",
        		JOptionPane.INFORMATION_MESSAGE);
        String subject = JOptionPane.showInputDialog(null," What Subject ?","Subject my friend",
        		JOptionPane.INFORMATION_MESSAGE);
        
        String grade = "Input your grade for following examination.\n";
        //grade average
        float first = Float.parseFloat(JOptionPane.showInputDialog(null, grade + "First Exam:", "Grade", 
				JOptionPane.INFORMATION_MESSAGE));
        float second = Float.parseFloat(JOptionPane.showInputDialog(null, grade + "Second Exam", "Grade", 
				JOptionPane.INFORMATION_MESSAGE));
        float third = Float.parseFloat(JOptionPane.showInputDialog(null, grade + "Third Exam:", "Grade", 
				JOptionPane.INFORMATION_MESSAGE));
        float forth = Float.parseFloat(JOptionPane.showInputDialog(null, grade + "Forth Exam:", "Grade", 
				JOptionPane.INFORMATION_MESSAGE));
		
		float average = (first + second + third + forth) / 4;
		
		String remarks;
		if (average >= 75) {
			remarks = "Passed";
		} else {
			remarks = "Failed";
		}
		
		String display = String.format("%-32s : " + name + "\n", "Student's Name")
				+ String.format("%-38s : " + course + "\n", "Program")
				+ String.format("%-40s : " + subject + "\n\n\n", "Course")
				+ String.format("%-10s %-10s %-10s %-10s %n", " 1st", " 2nd", " 3rd", " 4th")
				+ String.format("%-10.2f %-10.2f %-10.2f %-10.2f %n%n", first, second, third, forth)
				+ String.format("%-40s : %.2f %n", "Average", average)
				+ String.format("%-40s : " + remarks + "\n", "Average");
		
		JOptionPane.showMessageDialog(null, display,"Student Information :)",JOptionPane.PLAIN_MESSAGE);
		String[] splitprog = course.split(" ");
		String prog = splitprog[0] + splitprog[1];
		
		String fileInfo = "-------------------------Student Information-------------------------\n"
				+ String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Name", "Program", 
						"Course", "First", "Second", "Third", "Fourth", "Average", "Remarks")
				+ String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s",prog, 
						subject, first, second, third, forth, average, remarks);
		
		System.out.println(fileInfo);
		
		 try (PrintWriter out = new PrintWriter(new FileWriter("Student.txt", true))) {
	            out.println(name + "\t" + course + "\t" + subject + "\t" + average + "\t");
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
	        }
	    }
    }

