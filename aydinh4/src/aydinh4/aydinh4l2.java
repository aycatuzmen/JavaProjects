package aydinh4;
import java.util.Scanner;

public class aydinh4l2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// create the variables
		double userweight;
		double userheight;
		double BMIresult;
		
		
		//open the scanner
		Scanner input = new Scanner (System.in);
		
		// give instructions to the user
		// get the user input
		System.out.println("please enter your weight in kilograms");
		userweight = input.nextDouble();
		System.out.println("please enter your height in meters");
		userheight = input.nextDouble();		
		
		// do the BMI calculations
		BMIresult = userweight / (userheight * userheight);
		
		System.out.println("BMI = " + BMIresult);
		
		//print the message based upon the calculation
		// Display result
	    if (BMIresult < 18.5)
	      System.out.println("Underweight");
	    else if (BMIresult < 25)
	      System.out.println("Normal");
	    else if (BMIresult < 30)
	      System.out.println("Overweight");
	    else
	      System.out.println("Obese");
	}
}
