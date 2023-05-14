package Tps;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class ATM_GUI extends JFrame implements ActionListener {

    //define components
    JLabel label1, label2, label3, label4;
    JTextField tf1, tf2;
    JButton btn1, btn2, btn3;

    //constructor
    ATM_GUI() {
        //set frame properties
        setTitle("ATM Machine");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //add components
        label1 = new JLabel("ATM Machine");
        label1.setBounds(150, 10, 100, 30);
        add(label1);

        label2 = new JLabel("Enter Account Number:");
        label2.setBounds(10, 50, 150, 30);
        add(label2);

        tf1 = new JTextField();
        tf1.setBounds(170, 50, 150, 30);
        add(tf1);

        label3 = new JLabel("Enter Pin:");
        label3.setBounds(10, 90, 150, 30);
        add(label3);

        tf2 = new JTextField();
        tf2.setBounds(170, 90, 150, 30);
        add(tf2);

        btn1 = new JButton("Withdraw");
        btn1.setBounds(10, 150, 100, 30);
        add(btn1);

        btn2 = new JButton("Deposit");
        btn2.setBounds(120, 150, 100, 30);
        add(btn2);

        btn3 = new JButton("Balance Inquiry");
        btn3.setBounds(230, 150, 150, 30);
        add(btn3);

        label4 = new JLabel("");
        label4.setBounds(10, 200, 350, 30);
        add(label4);

        //add action listeners to buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        //display the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //establish connection to database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");

            //get account number and pin from text fields
            String acc_num = tf1.getText();
            String pin = tf2.getText();

            //define variables
            int balance = 0;
            int amount = 0;
            String transaction_type = "";
            String transaction = "";

            //check if account number and pin exist in database
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accounts WHERE account_number='" + acc_num + "' AND pin='" + pin + "'");
            if (rs.next()) {
                balance = rs.getInt("balance");

                //withdraw
                if (e.getSource() == btn1) {
                    String input = JOptionPane.showInputDialog(this, "Enter amount to withdraw:");
                    amount = Integer.parseInt(input);

                    if (balance >= amount) {
                        balance -= amount;
                        transaction_type = "Withdrawal";
                        transaction = transaction_type + ": " + amount;
                        stmt.executeUpdate("UPDATE accounts SET balance='" + balance + "' WHERE account_number='" + acc_num + "'");
                        appendToFile(acc_num, transaction);
                        label4.setText("Withdrawal successful. New balance: " + balance);
                    } else {
                        label4.setText("Insufficient balance.");
                    }
                }

                //deposit
                if (e.getSource() == btn2) {
                    String input = JOptionPane.showInputDialog(this, "Enter amount to deposit:");
                    amount = Integer.parseInt(input);
                    balance += amount;
                    transaction_type = "Deposit";
                    transaction = transaction_type + ": " + amount;
                    stmt.executeUpdate("UPDATE accounts SET balance='" + balance + "' WHERE account_number='" + acc_num + "'");
                    appendToFile(acc_num, transaction);
                    label4.setText("Deposit successful. New balance: " + balance);
                }

                //balance inquiry
                if (e.getSource() == btn3) {
                    label4.setText("Your balance is: " + balance);
                }

            } else {
                label4.setText("Invalid account number or pin.");
            }

            //close database connection
            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    //method to append transaction to text file
    public void appendToFile(String acc_num, String transaction) {
        try {
            FileWriter fw = new FileWriter(acc_num + ".txt", true);
            fw.write(transaction + "\n");
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new ATM_GUI();
    }
}