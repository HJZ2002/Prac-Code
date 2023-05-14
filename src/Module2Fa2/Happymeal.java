package Module2Fa2;
import javax.swing.JOptionPane;
public class Happymeal {

	public static void main(String[] args) {
		
		String choice = "PICK YOUR ORDER SIR/MAAM:\n"
				+ "[1] B1 - (1 Rice, 2 pc of chicken joy, 1 drink for 75.00 PHP)\n"
				+ "[2] B2 - (1 Rice, and, 2 pc of burger steak 50.00 PHP)\n"
				+ "[3] B3 - (1 Rice, and, 1 pc chicken 30.00 PHP)\n"
				+ "[4] B4 - (1 piece burger steak, (2 pc of rice + 2 pc jumbo hot dog, 80.00 PHP)\n"
				+ "[5] B5 - (1 pc champ jr solo with fires and, 1 drink  100.00 PHP )\n"
				+ "[6] B6 - (2pc hotdog with 1 slice of pizza with, 1 drink 150.00 php\n"
				+ "[7] Mineral water 15.00 php\n"
				+ "[8] extra Rice 7.00 php\n"
				+ "[9] Buko Juice 10.00 php\n"
				+ "[0] Exit";
		
		String receipt = "====================OFFICIAL RECIEPT!==========\n";
		int option = Integer.parseInt(JOptionPane.showInputDialog(null,choice));
		if (option == 0) {
		}

		float overall = 0;
		
		while (option != 0) {
			
			if (option == 1) {
				overall += 75;
				receipt += "B1 - (1 Rice, 2 pc of chicken joy, 1 drink) for 75.00 PHP\n";
			}else if (option == 2){
				overall += 50;
				receipt += "B2 - (1 Rice, and, 2 pc of burger steak) for 50.00 PHP\n";
			}else if (option == 3){
				overall += 30;
				receipt += "B3 - (1 Rice, and, 1 pc chicken for 30.00 PHP\n";
			}else if (option == 4){
				overall += 80;
				receipt += "B4 - (1 piece burger steak, (2 pc of rice + 2 pc jumbo hot dog) for 80.00 PHP\n";
			}else if (option == 5){
				overall += 100;
				receipt += "B5 - (1 pc champ jr solo with fires and, 1 drink) for 100.00 PHP\n";
			}else if (option == 6){
				overall += 150;
				receipt += "B6 - (2pc hotdog with 1 slice of pizza with, 1 drink ) for 150.00 PHP\n";
			}else if (option == 7){
				overall += 15;
				receipt += "Mineral water for 15.00 PHP\n";
			}else if (option == 8){
				overall += 7;
				receipt += "extra Rice for 7.00 PHP\n";
			}else if (option == 9){
				overall += 10;
				receipt += "Buko Juice for 10.00 PHP\n";
			}
			option = Integer.parseInt(JOptionPane.showInputDialog(null, choice));
		}
		String Message = String.format("Your total bill is: %.2f PHP\nHow Much would you like to pay maam/sir ", overall);
		double change = Double.parseDouble(JOptionPane.showInputDialog(null, Message));
		
		while (change < overall) {
			change = Double.parseDouble(JOptionPane.showInputDialog(null, "Wrong amount of payment sir/maam : Please pay the total amount :)  "));
		}
		
		double result = change - overall;
		receipt += "=============================="
				+ String.format("\nTotal: %.2f PHP", overall)
				+ String.format("\nPayment: %.2f PHP", change)
				+ String.format("\nChange: %.2f PHP", result);
		String Message2 = String.format("You pay\n: %.2f PHP", change);
		JOptionPane.showMessageDialog(null, Message2);
		JOptionPane.showMessageDialog(null, receipt, "Created by Hosea James Zacarias", JOptionPane.INFORMATION_MESSAGE);
  }

}
