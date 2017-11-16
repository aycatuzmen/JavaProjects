package okanh5;
import java.util.Scanner;

public class okanh5l2 {
	public static void main(String[] args) {
		// veri yarat
		int num1, num2;
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);
		int cevap;
		int sorgusonucu;

		System.out.println("num1 = " + num1 + " num2= " + num2 );
		
		// kullanican cevabi sor
		Scanner input = new Scanner(System.in);
		System.out.println("iki sayinin toplamini giriniz");
		cevap = input.nextInt();
		// cevabi bagli olarak mesaj goster
		//System.out.println("cevap dogrumu = " + (cevap == num1+num2));
		
		sorgusonucu = num1+num2;
		while (sorgusonucu != cevap){
			System.out.println("dogru cevap degil bir daha gir"+ "num1 = " + num1 + " num2= " + num2 );
			cevap = input.nextInt();
			
		}
		System.out.println("dogru cevap");
		
	}

}
