import java.util.Scanner;

public class DaireAlanHesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// verilerini yarat
		double yaricap, yaricap2 ;
		double alan;
		final double PI = 3.14159;
		
		// kullanican veri al
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin 1-yaricapi gir: ");
		yaricap = input.nextDouble();
		System.out.println("yaricap = " + yaricap);
		
		//alani hesapla
		alan = yaricap * yaricap * PI;
		
		// alani goster
		System.out.println("1- dairenin alani = " + alan);
		
		System.out.print("Dairenin 2-yaricapi gir: ");
		yaricap2 = input.nextDouble();
		alan = yaricap2 * yaricap2 * PI;
		System.out.println("2- dairenin alani = " + alan);
		
	}

}
