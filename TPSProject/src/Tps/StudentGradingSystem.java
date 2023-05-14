package Tps;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentGradingSystem extends JFrame {

    private JLabel nameLabel, scoreLabel;
    private JTextField nameField, scoreField;
    private JButton calculateButton;

    public StudentGradingSystem() {
        initComponents();
    }

    private void initComponents() {
        // Create components
        nameLabel = new JLabel("Student Name:");
        scoreLabel = new JLabel("Score:");

        nameField = new JTextField(20);
        scoreField = new JTextField(20);

        calculateButton = new JButton("Calculate");

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showGradeReport();
            }
        });

        // Set layout and add components
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(scoreLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(scoreField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(calculateButton, gbc);

        // Set JFrame properties
        setTitle("Student Grading System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void showGradeReport() {
        String studentName = nameField.getText();
        int score = Integer.parseInt(scoreField.getText());
        String grade;

        if (score >= 75 && score <= 100) {
            grade = "A";
        } else {
            grade = "F";
        }

        String report = studentName + " has achieved a grade of " + grade + " with a score of " + score + ".";

        JFrame reportFrame = new JFrame("Grade Report");
        JTextArea reportArea = new JTextArea(report);
        reportArea.setEditable(false);

        reportFrame.add(reportArea);
        reportFrame.setSize(400, 200);
        reportFrame.setLocationRelativeTo(null);
        reportFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentGradingSystem().setVisible(true);
            }
        });
    }
}