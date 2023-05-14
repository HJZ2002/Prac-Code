package Tps;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame{
	String pin = "1813";
	int attempts = 3;
	public Login(){
		//constructor setup for the ATM
		super("Login Screen");
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		buildApp();
		pack();
		setSize(250, 120);
		setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args){
		new Login();		
	}
	
	void buildApp(){
		//GUI Setup for the login	
		JLabel pinInstruction = new JLabel("Please enter your pin number");
		final JPasswordField pinText = new JPasswordField(4);
		JButton enterPin = new JButton("Enter");
		JButton quit = new JButton("Quit");
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(quit);
		buttonPanel.add(enterPin);
		pinText.setBackground(Color.white);
		add(pinInstruction, BorderLayout.NORTH);
		add(pinText, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		
		//Action Listener Setup 
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}	
		});
		//success + opening of account
		pinText.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				char[] pinGuess = pinText.getPassword();
				String pinString = new String(pinGuess);
				if(pinString.equals(pin)){
					JOptionPane.showMessageDialog(null, "The pin is correct Opening Account");
					dispose();
					new ATM();
				} else{
					if(attempts != 1){
						attempts--;
						JOptionPane.showMessageDialog(null, "The pin is incorrect \n" + attempts 
						+ " attempts remaining!");
					} else {
						JOptionPane.showMessageDialog(null, "No Attempts left \n Closing Program");
						System.exit(0);
					}
				}
			}	
		});
		//entering pin another if else statement 
		enterPin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				char[] pinGuess = pinText.getPassword();
				String pinString = new String(pinGuess);
				if(pinString.equals(pin)){
					JOptionPane.showMessageDialog(null, "The pin is correct Opening Account");
					dispose();
					new ATM();
				} else{
					if(attempts != 1){
						attempts--;
						JOptionPane.showMessageDialog(null, "The pin is incorrect \n" + attempts 
						+ " attempts remaining!");
					} else {
						JOptionPane.showMessageDialog(null, "No Attempts left \n Closing Program");
						System.exit(0);
					}
				}
			}	
		});
	}
}
