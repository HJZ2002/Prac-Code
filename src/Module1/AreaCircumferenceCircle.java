package Module1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCircumferenceCircle {
	private static final DecimalFormat twoDeciPlaces = new DecimalFormat("0.00");
	public static void main(String[] args) {
		 
		//code by Hosea James Zacarias 
		float radius;
		double area,pi,circum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle ");
		radius = input.nextFloat();
		input.close();
		
		pi = 3.14;
		area = pi * radius* radius;
		circum = 2 * pi * radius;
		System.out.println("\n\nArea of the Circle is "+area);
		System.out.println("\n\nCircumference: " + twoDeciPlaces.format(circum));
	}
   
}
	