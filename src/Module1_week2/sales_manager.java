package Module1_week2;
import java.io.FileWriter;
import java.io.IOException;

public class sales_manager {

	public static void main(String[] args) {
		
		String header = "****************** Zacarias Corp - We provided the best advices of all of time. ******************\n";
		String year = String.format("%-10s : %10s", "Year", "2023\n");
		String line = "-----------------------------------------------------------------------------------------------------\n";
		String labels = String.format("%-20s %-20s %20s %24s%n", "Months", "Gross Income", "Total Expenses", "Net Income");
		String January = String.format("%-20s %-26s %-28s %-14s %1s%n", "January", "89,000", "10,000", "79,000", "");
		String Febuary = String.format("%-20s %-26s %-28s %-14s %1s%n", "February", "200,000", "10,000", "100,000", "");
		String March = String.format("%-20s %-26s %-28s %-14s %1s%n", "March", "80,000", "8,000", "72,000", "");
		String April = String.format("%-20s %-26s %-28s %-14s %1s%n", "April", "150,000", "50,000", "130,000", "");
		String May = String.format("%-20s %-26s %-28s %-14s %1s%n", "May", "140,000", "20,000", "30,000", "");
		String June = String.format("%-20s %-26s %-28s %-14s %1s%n", "June", "160,000", "15,000", "50,000", "");
		String July = String.format("%-20s %-26s %-28s %-14s %1s%n", "July", "200,000", "60,000", "180,000", "");
		String August = String.format("%-20s %-26s %-28s %-14s %1s%n", "August", "600,000", "80,000", "300,000", "");
		String September = String.format("%-20s %-26s %-28s %-14s %1s%n", "September", "700,000", "80,000", "150,000", "");
		String October = String.format("%-20s %-26s %-28s %-14s %1s%n", "October", "165,000", "15,000", "150,000", "");
		String November = String.format("%-20s %-26s %-28s %-14s %1s%n", "November", "140,000", "5,000", "135,000", "");
		String December = String.format("%-20s %-26s %-28s %-14s %1s%n", "December", "1,500,000", "8,000", "2,000,000", "");
		String total = String.format("%-20s %-26s %-28s %-14s %1s%n%n", "TOTAL", "4,824,000", "361,000", "2,335,000", "");
		
		String months = January + Febuary + March + April + May + June + July + August + September + October + November + December;
		String content = header + year + line + labels + months + total + line;
		
		try {
			FileWriter docu = new FileWriter("Sales.txt");
			docu.write(content);
			docu.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
