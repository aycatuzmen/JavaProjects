import java.util.Scanner;

public class h4saniyeDak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// veri yarat
		int kullveri, dakhesap, sanhesap ;
		
		
		// san degeri oku
		System.out.println("saniye giriniz");
		Scanner input = new Scanner (System.in);
		kullveri = input.nextInt();
		
		// dak ve saniye hseapla
		dakhesap = kullveri / 60;
		sanhesap = kullveri % 60;
		
		// goster
		System.out.println("girilen saniye " + kullveri);
		System.out.println("cevirisi " + dakhesap + " dak ve " + sanhesap + " saniye ");
		//System.out.println("cevirisi " + kullveri/60 + " dak ve " + kullveri%60 + " saniye ");
	}

}
