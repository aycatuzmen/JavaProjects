package okanh5;
import java.util.Scanner;

public class okanh5l4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// iki veri yarat kilo hemde boy
		double kilogirdipound, boygirdiinch;
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
	    final double METERS_PER_INCH = 0.0254; // Constant 
		
		//bmi hesap sonucu icin veri yarat
		double bmisonucu, kilogirdikg, boygirdimetre;
		
		//kullanican iki deger iste
		Scanner input = new Scanner (System.in);
		System.out.println("Kilonuzu pound olarak giriniz ");
		kilogirdipound = input.nextDouble();
		System.out.println("Boyunuzu inch giriniz ");
		boygirdiinch = input.nextDouble();
		
		kilogirdikg = kilogirdipound * KILOGRAMS_PER_POUND;
		boygirdimetre = boygirdiinch * METERS_PER_INCH;
		
		System.out.println("Kilonuz = " + String.format("%.2f",kilogirdikg) +
				" boyunuz = " + String.format("%.2f",boygirdimetre*100) + " cm");
		
		//bmi hesaplamasini yap
		bmisonucu = kilogirdikg / (boygirdimetre * boygirdimetre);
		
		// bmi sonucuna gore gerekli mesaj goster
		System.out.println("BMI sonucu = " + bmisonucu);
		if (bmisonucu < 18.5)
			System.out.println("underweight");
		else if (bmisonucu < 25)
			System.out.println("Normal");
		else if (bmisonucu < 30)
			System.out.println("overweight");
		else 
			System.out.println("Obese");
		
	}

}
