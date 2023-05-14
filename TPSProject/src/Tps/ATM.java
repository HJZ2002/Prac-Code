package Tps;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ATM extends JFrame {
	//filehandling method where it creates automatic transaction list
	private void writeTransactionHistoryToFile() {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("transaction_history.txt"))) {
	    	JOptionPane.showMessageDialog(null,"transaction_history.txt has been updated.");
	        for (int i = 0; i < transactionIndex; i++) {
	            writer.write(transactionHist[i]);
	            writer.newLine();
	        }
	    } catch (IOException e) {
	        JOptionPane.showMessageDialog(null,"An error occurred while writing the transaction history to the file.");
	        e.printStackTrace();
	    }
	}
	//Variables for balance, the input from the user for deposits,
		//and for checking that they have clicked Deposit before clicking Enter
		String name;
		int balance = 10000;
		String[] inputSequence = new String[4];
		String[] transactionHist = new String[100];
		int inputSequenceIndex = 0;
		int transactionIndex = 0;
		boolean readyToEnter = false;
		boolean readyToWithdraw = false;
		//Basic Constructor Setup - Setting the input array as empty
		//Other basic setup options - Setting size,
		public ATM(){
			super("ATM");
			for(int i =0; i <= 3; i++){
				inputSequence[i] = "";
			}
			setResizable(false);
			setLocationRelativeTo(null);
			buildApp();
			pack();
			setSize(600,600);
			setVisible(true);
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		 
		protected void buildApp(){
			//GUI Setup (VIEW)
			//Basic Panel layout setup
			JLabel displayArea = new JLabel("Please select a function from the buttons below\n "
					+ " Current Balance : " + balance + "");
			
			displayArea.setOpaque(true);
			displayArea.setBackground(Color.ORANGE);
			displayArea.setPreferredSize(new Dimension(100, 100));
			JPanel bottomArea = new JPanel();
			bottomArea.setLayout(new BorderLayout(0,0));
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BorderLayout(0,0));
			JLabel inputDisplay = new JLabel("Input Area:");
			inputDisplay.setBorder(BorderFactory.createLineBorder(Color.black));
			bottomArea.add(inputDisplay, BorderLayout.NORTH);
			
			//Grid layout setup for buttons
			GridBagLayout buttonGrid = new GridBagLayout();
			buttonPanel.setLayout(buttonGrid);
			GridBagConstraints bPConstrain = new GridBagConstraints();
		
			//Buttons SETUP for the ATM
			bPConstrain.weightx= 0.1;
			bPConstrain.weighty= 0.1;
			//option1	
			JButton withDraw1 = new JButton(" 100 ");
			bPConstrain.gridx = 0;
			bPConstrain.gridy = 0;	
			bPConstrain.insets = new Insets(0, 0, 50, 5);
			withDraw1.setSize(new Dimension(200, 30));
			buttonPanel.add(withDraw1, bPConstrain);
			//option2
			JButton withDraw2 = new JButton(" 500 ");
			bPConstrain.gridx = 0;
			bPConstrain.gridy = 1;
			withDraw2.setSize(new Dimension(200, 30));
			bPConstrain.insets = new Insets(0, 0, 50, 5);
			buttonPanel.add(withDraw2, bPConstrain);
			//option3
			JButton withDraw3 = new JButton(" 1000");
			bPConstrain.gridx = 0;
			bPConstrain.gridy = 2;
			bPConstrain.insets = new Insets(0, 0, 50, 5);
			//end
			
			//deposit area
			withDraw3.setSize(new Dimension(200, 30));
			buttonPanel.add(withDraw3, bPConstrain);
			JButton deposit = new JButton("Deposit");
			bPConstrain.gridx = 0;
			bPConstrain.gridy = 3;
			bPConstrain.insets = new Insets(0, 0, 40, 5);
			deposit.setSize(new Dimension(200,30));
			buttonPanel.add(deposit,bPConstrain);
			
			//setting quit
			JButton quit = new JButton("Quit");
			bPConstrain.gridx = 4;
			bPConstrain.gridy = 0;
			bPConstrain.insets = new Insets(0, 0, 50, 5);
			bPConstrain.anchor = GridBagConstraints.PAGE_END;
			//quit
			quit.setSize(new Dimension(200,30));
			buttonPanel.add(quit,bPConstrain);
			
			
			JButton withdraw4 = new JButton(" Withdraw ");
			bPConstrain.gridx = 0;
			bPConstrain.gridy = 5;
			//withdraw4
			withdraw4.setSize(new Dimension(200,30));
			buttonPanel.add(withdraw4,bPConstrain);
			//setting numbers for the ATM 
			JButton number = new JButton("1");
			bPConstrain.gridx=1;
			bPConstrain.gridy=0;
			number.setSize(new Dimension(200,300));
			buttonPanel.add(number,bPConstrain);
			
			//number 2
			JButton number2 = new JButton("2");
			bPConstrain.gridx=2;
			bPConstrain.gridy=0;
			number2.setSize(new Dimension(200,300));
			buttonPanel.add(number2,bPConstrain);
			//number 3
			JButton number3 = new JButton("3");
			bPConstrain.gridx = 3;
			bPConstrain.gridy = 0;
			number3.setSize(new Dimension(200, 30));
			buttonPanel.add(number3, bPConstrain);
			
			//number 4
			JButton number4 = new JButton("4");
			bPConstrain.gridx = 1;
			bPConstrain.gridy = 1;
			number4.setSize(new Dimension(200, 30));
			buttonPanel.add(number4, bPConstrain);
			//number 5
			JButton number5 = new JButton("5");
			bPConstrain.gridx = 2;
			bPConstrain.gridy = 1;
			number5.setSize(new Dimension(200, 30));
			buttonPanel.add(number5, bPConstrain);
			//number 6
			JButton number6 = new JButton("6");
			bPConstrain.gridx = 3;
			bPConstrain.gridy = 1;
			number6.setSize(new Dimension(200, 30));
			buttonPanel.add(number6, bPConstrain);
			//number 7
			JButton number7 = new JButton("7");
			bPConstrain.gridx = 1;
			bPConstrain.gridy = 2;
			number7.setSize(new Dimension(200, 30));
			buttonPanel.add(number7, bPConstrain);
			JButton number8 = new JButton("8");
			//number 8
			bPConstrain.gridx = 2;
			bPConstrain.gridy = 2;
			number8.setSize(new Dimension(200, 30));
			buttonPanel.add(number8, bPConstrain);
			//number 9
			JButton number9 = new JButton("9");
			bPConstrain.gridx = 3;
			bPConstrain.gridy = 2;
			number9.setSize(new Dimension(200, 30));
			buttonPanel.add(number9, bPConstrain);
			//number 10
			JButton number0 = new JButton("0");
			bPConstrain.gridx = 1;
			bPConstrain.gridy = 3;
			number0.setSize(new Dimension(200, 30));
			buttonPanel.add(number0, bPConstrain);
			//clear all
			JButton clear = new JButton ("clear");
			bPConstrain.gridx=2;
			bPConstrain.gridy=3;
			clear.setSize(new Dimension(200,300));
			buttonPanel.add(clear,bPConstrain);
			
			//enter the number
			JButton enter = new JButton ("Enter");
			bPConstrain.gridx=3;
			bPConstrain.gridy=3;
			enter.setSize(new Dimension(200,300));
			//displaying
			buttonPanel.add(enter,bPConstrain);
			JButton enter2 = new JButton ("Enter Withdraw");
			bPConstrain.gridx=4;
			bPConstrain.gridy=3;
			enter2.setSize(new Dimension(200,300));
			//displaying
			buttonPanel.add(enter2,bPConstrain);
			//center
			bottomArea.add(buttonPanel,BorderLayout.CENTER);
			//north
			add(displayArea,BorderLayout.NORTH);
			//center
			add(bottomArea,BorderLayout.CENTER);
			//end
			
			//setting Action Listener
			withDraw1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					if(balance >= 1000){
						balance = balance -100;
						displayArea.setText(" Transaction Complete \n Current left :" + balance );
						readyToEnter = false;
						updateTransaction(" User has Withdrawn:"+ balance);
						
					} else {
						displayArea.setText("Your balance is too low Unable to withdraw "
								+ "Current balance" + balance);
					}
				}
			});
			withDraw2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					if(balance >= 1000){
						balance = balance -500;
						displayArea.setText(" Transaction Complete \n Current left: " + balance);
						readyToEnter = false;
						updateTransaction(" User has Withdrawn:"+ balance);
						
					} else {
						displayArea.setText("Your balance is too low Unable to withdraw "
								+ "Current balance" + balance);
					}
				}
			});
			withDraw3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					if(balance >= 1000){
						balance = balance -1000;
						displayArea.setText(" Transaction Complete \n Current left: " + balance);
						readyToEnter = false;
						updateTransaction(" User has Withdrawn:"+ balance);
						
					} else {
						displayArea.setText("Your balance is too low Unable to withdraw "
								+ "Current balance" + balance);
					}
				}
			});
			//setting quit button
		quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Your reciept maam/sir:\n"+printReceipt());
				JOptionPane.showMessageDialog(null, "Logging out thank your for banking with us");
				dispose();
				writeTransactionHistoryToFile();
				new Login();
			}
		});
		
		//setting the clear button listener
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display");
				displayArea.setText("Input Area has been cleared"+ finishedTransaction() +"");
				clearInput();
				readyToEnter = false;
				
			}
			
		});
		// setting up the number listener
		number.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("1"));
				
			}
			
		});
		number2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("2"));
				
			}
			
		});
		number3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("3"));
				
			}
			
		});
		number4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("4"));
				
			}
			
		});
		number5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("5"));
				
			}
			
		});
		number6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("6"));
				
			}
			
		});
		number7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("7"));
				
			}
			
		});
		number8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("8"));
				
			}
			
		});
		number9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("9"));
				
			}
			
		});
		number0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("Input Display" + update("0"));
				
			}
			
		});
		
		//withdraw custom button system for the user
		
		withdraw4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				displayArea.setText("Please input an amout and click enter! "); 
						readyToWithdraw=true;
						
			}
			
		});
		//deposit button system
		deposit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				displayArea.setText("Please input an amout below or equal and click enter! "); 
						readyToEnter=true;
						
			}
			
		});
		//deposit button
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(readyToEnter ==true) {
					//nestedloop
					if(Integer.parseInt(getInputSequence())<500){
						displayArea.setText("That input is less than 500");
						clearInput();
						inputDisplay.setText("Input display ");
						readyToEnter=false;
						
					} else if(Integer.parseInt(getInputSequence()) == 0 || getInputSequence().equals("0000")){
						displayArea.setText("Invalid Value");
						clearInput();
						inputDisplay.setText("Input display again");
						readyToEnter=false;
						
					} else {
						updateBalance(Integer.parseInt(getInputSequence()));
						displayArea.setText(" Transaction Complete \n Current left: " + balance);
						updateTransaction(" User has Deposit:"+getInputSequence());
					}
					clearInput();
					inputDisplay.setText("Input display again:");
					readyToEnter = false;
					
				} else {
					displayArea.setText(" You have not yet choosen an action user: " + finishedTransaction()+"");
					clearInput();
					inputDisplay.setText(" Input display again: ");
					
				}
				
				}	
			});	
		//withdraw 2 fungtions
		enter2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(readyToWithdraw ==true) {
					//nestedloop
					if(Integer.parseInt(getInputSequence())<500){
						displayArea.setText(" Sucess ");
						clearInput();
						inputDisplay.setText("Input display ");
						readyToWithdraw=false;
						
					} else if(Integer.parseInt(getInputSequence()) == 0 || getInputSequence().equals("0000")){
						displayArea.setText("Invalid Value");
						clearInput();
						inputDisplay.setText("Input display again");
						readyToWithdraw=false;
						
					} else {
						updateBalance(-1*(Integer.parseInt(getInputSequence())));
						displayArea.setText(" Transaction Complete \n Current left: " + balance);
						updateTransaction(" User has Withdraw:"+getInputSequence());
					}
					clearInput();
					inputDisplay.setText("Input display again:");
					readyToWithdraw = false;
					
				} else {
					displayArea.setText(" Sucess " + finishedTransaction()+"");
					clearInput();
					inputDisplay.setText(" Input display again: ");
					
				}
				
				}	
			});	
		}
			
		//final method for the calculations
		void clearInput() {
			for (int i =0; i<=3; i++) {
				inputSequence[i]="";
			}
			inputSequenceIndex=0;
		}
		String update(String n){
			if(inputSequenceIndex <= 3){
				inputSequence[inputSequenceIndex] = n;
				inputSequenceIndex++;
			
				StringBuilder strBuilder = new StringBuilder();
				for (int i = 0; i < inputSequence.length; i++) {
					strBuilder.append(inputSequence[i]);
				}
				String newString = strBuilder.toString();
				return newString;
			} else{
				StringBuilder strBuilder = new StringBuilder();
				for (int i = 0; i <= 3; i++) {
					strBuilder.append(inputSequence[i]);
				}
				String newString = strBuilder.toString();
				return newString;
			}
		}
		//get inputSequence
		String getInputSequence() {
			StringBuilder strBuilder = new StringBuilder();
			if(inputSequence[0]=="") {
				return"0000";
			} else {
				for(int i =0;i<inputSequence.length;i++) {
					strBuilder.append(inputSequence[i]);
				}
				String msg = strBuilder.toString();
				return msg;
			}
		}
		//reseting the transaction from the start
		String finishedTransaction() {
			return "\nPlease Select other options within your Current Balance"+ balance;
		}
		//update the balance from deposit
		void updateBalance(int i) {
			balance+=i;
		}
		//update transaction for the receipt
		void updateTransaction(String t) {
			transactionHist[transactionIndex]=t;
			transactionIndex++;
		}
		//print receipt
		String printReceipt() {
			if(inputSequence[0].equals(null)) {
				return "No transactions Made";
			} else {
				StringBuilder strBuilder = new StringBuilder();
				for(int i =0; i<transactionIndex;i++) {
					strBuilder.append(transactionHist[i]+"\n");
				}
				String text = strBuilder.toString();
				return text;
			}
		}
		//main method at last
		public static void main(String[]args) {
			new Login();
		}
	}					