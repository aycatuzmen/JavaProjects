package aydinh4;

import java.util.Scanner;

public class aydinh4l3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// create the variables
		int userYear;
		
		
		//open the scanner
		Scanner input = new Scanner (System.in);
		
		// give instructions to the user
		// get the user input
		System.out.println("please enter a year");
		userYear = input.nextInt();
		boolean result = (userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0);
		System.out.println("the user year is " + result);
	}	
}
	
