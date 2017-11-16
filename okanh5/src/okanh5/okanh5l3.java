package okanh5;
import java.util.Scanner;

public class okanh5l3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int girilen;
		Scanner input = new Scanner(System.in);
		System.out.println("bir int sayi giriniz");
		girilen = input.nextInt();
		if (girilen % 5 == 0){
			System.out.println("HIFive");
		}
		if(girilen %2 == 0);{
			System.out.println("Hieven");
		}
		
	}

}
