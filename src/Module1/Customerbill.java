package Module1;
import java.util.Scanner;
public class Customerbill {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        //User input
	        System.out.print("Enter phone brand: ");
	        String brand = input.nextLine();
	        
	        System.out.print("Enter phone color: ");
	        String color = input.nextLine();
	        
	        System.out.print("Enter the Price: ");
	        double price = input.nextDouble();
	        
	        System.out.print("Enter quantity: ");
	        int quantity = input.nextInt();
	        
	        double grossTotal = price * quantity;
	        double vatValue = 0.038 * grossTotal;
	        double netTotal = grossTotal + vatValue;
	        
	        //Bill Printing
	        System.out.println("------------------------------------------");
	        System.out.println("Brand        : " + brand);
	        System.out.println("Color        : " + color);
	        System.out.println("Price        : $" + String.format("%,.2f", price));
	        System.out.println("Quantity     : " + quantity);
	        System.out.println("Gross Total  : $" + String.format("%,.2f", grossTotal));
	        System.out.println("Vat(3.8%)    : $" + String.format("%,.2f", vatValue));
	        System.out.println("Net Total    : $" + String.format("%,.2f", netTotal));
	        System.out.println("------------------------------------------");
	        
	        System.out.print("\nEnter amount tendered: ");
	        double amountTendered = input.nextDouble();
	        
	        double change = amountTendered - netTotal;
	        System.out.printf("Change: %.2f\n", change);
	        System.out.println("Made by Hosea James Zacarias");
	        input.close();
	    }
	}