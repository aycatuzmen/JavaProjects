package aydinh4;
import java.util.Scanner;

public class aydinh4l5 {

	public static void main(String[] args) {
		// create variables
		int systemnumber;
		int userinput;
		
		systemnumber = (int) (Math.random() * 101);
		System.out.println("the number generated by the system is " + systemnumber);
		
		//ask user to enter a number
		Scanner myscanner = new Scanner (System.in);
		
		userinput = -1;
		System.out.println("please enter a number between 0 and 100");
		
		while (true){
			//get the user input
			System.out.println("please enter a number between 0 and 100");
			userinput = myscanner.nextInt();
			if (userinput == systemnumber){
				System.out.print("Correct guess, good job");
				break;
			} else if (userinput < systemnumber){
				System.out.println("Guess higher number");
			} else if (userinput > systemnumber){
				System.out.println("Guess lower number");
			}
		}
		/*
		System.out.println("please enter a number between 0 and 100");
		userinput = myscanner.nextInt();
		while (userinput != systemnumber){
			if (userinput == systemnumber){
				System.out.print("Correct guess, good job");
			} else if (userinput < systemnumber){
				System.out.println("Guess higher number");
				System.out.println("please enter a number between 0 and 100");
				userinput = myscanner.nextInt();
			} else if (userinput > systemnumber){
				System.out.println("Guess lower number");
				System.out.println("please enter a number between 0 and 100");
				userinput = myscanner.nextInt();
			}
		}
		
		do{
			System.out.println("please enter a number between 0 and 100");
			userinput = myscanner.nextInt();
			if (userinput == systemnumber){
				System.out.print("Correct guess, good job");
			} else if (userinput < systemnumber){
				System.out.println("Guess higher number");
			} else if (userinput > systemnumber){
				System.out.println("Guess lower number");
			}
			
		}while (userinput != systemnumber);
		*/
		/*
		for (; ;);{
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
			break;
		}
		*/
		
	}
}