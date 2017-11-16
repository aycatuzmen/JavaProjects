package examPrep;
import java.util.Scanner;
public class kosucuhesaplamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. soru
		//System.out.println((14 / 45.5) * 60 / 1.6);
		//4. soru
		//System.out.println(Math.pow(2, 3.5));
		
		//5.soru
		/*
	    int count = 1;
	    do {
	      count += 3;
	      System.out.println(Math.pow(2, 3.5));
	    } while (count < 5);
		*/
		//6.soru
		/*
	    int veri = 85;
	   for (int say = 2; say < veri; say++ )
	    {
	    		if (veri % say == 0) {
	    			System.out.println(say);
	    			
	    		}
	    }
     // 7.soru 
		int a = 85;
		int b = 2;
		while (b< a) {
			if (a%b == 0) {
				System.out.println(b);
				break;
			}
			b++;
		}
		*/
		/*
		//soru 8. 
		Scanner input = new Scanner (System.in);
		System.out.println("Dakika sayisini girin: " );
		long dak = input.nextLine().;
		
		long sene;
		long gun;
		gun = dak / (24*60);
		sene = gun / 365;
		long kalangun = gun % 365;
		System.out.println(dak + " dakika yaklasik " + sene + " sene " + kalangun + " gundur" );
		*/
	
	
		// 9. soru
		/*
		Scanner input = new Scanner(System.in);
		int x1, x2, y1, y2;
	    System.out.print("lokasyon gir -x1");
	    x1 = input.nextInt();
	    System.out.print("lokasyon gir -x2");
	    x2 = input.nextInt();
	    System.out.print("lokasyon gir -y1");
	    y1 = input.nextInt();
	    System.out.print("lokasyon gir -y2");
	    y2 = input.nextInt();

    
	    int a, b;
	  a = (int) Math.pow(x2-x1, 2);
	  b = (int) Math.pow(y2-y1, 2);
	  int distance2 = (int) Math.pow(a+b, 0.5);
	  // int distance = (int) Math.pow ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
	   System.out.println(distance2);
	
	   //soru 10
		/*
		Scanner input = new Scanner(System.in);
		int girdi;
		while () {
		System.out.print("0 -6 Gun giriniz ");
			girdi = input.nextInt();
		
			switch (girdi) {
			case 0: System.out.println("Pazar"); break;
			case 1: System.out.println("Pazartesi"); break;
			case 2: System.out.println("Sali"); break;
			case 3: System.out.println("Cars"); break;
			case 4: System.out.println("Persembe"); break;
			case 5: System.out.println("Cuma"); break;
			case 6: System.out.println("Cumartesi");
			}
		}
		

	   // soru 11
	
	   
	   int rastgelesayi = (int) (Math.random() * 1000);
	   
	   System.out.println("sayilarin toplamini giriniz " + rastgelesayi);
	   Scanner input = new Scanner(System.in);
	   int kullsayi = input.nextInt(); 
	   
   
	   int yuzluk = rastgelesayi / 100;
	   int  ondalik = (rastgelesayi %100) / 10;
	   int birlik = (rastgelesayi%100) % 10; 
	   int toplam = yuzluk + ondalik + birlik;
	   
	   if (toplam == kullsayi)
		   System.out.println("dogru");
	   else
		   System.out.println("yanlis");
		  
		//soru 12
		
		Scanner input = new Scanner(System.in);
		    
		System.out.print("Uc haneli sayi gir: ");
		int number = input.nextInt();

		if (number / 100 == number % 10)
		    System.out.println(number + " is a palindrome");
		else 
		    System.out.println(number + " is not a palindrome");
		    
	*/
		/*
		//13. soru
		Scanner input = new Scanner(System.in);

    // Enter a point with two double values
    System.out.print("Iki koordinatli bir nokta giriniz: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    // Compute the distance
    double distance = Math.pow(x * x +  y * y, 0.5);
    
    if (distance <= 10)
      System.out.println("Nokta (" + x + ", " + y + 
        ") dairenin icinde");
    else
      System.out.println("Nokta (" + x + ", " + y + 
        ") dairenin icinde degil");
        
		 */
		/*
		//14. soru
	    System.out.println("Miles\t\tKilometers");
	    System.out.println("-------------------------------");

	    // Use while loop
	    int miles = 1; 
	    while (miles <= 10) {
	      System.out.println(miles + "\t\t" + miles * 1.609);
	      miles++;
	    }
	   
	// Alternatively use for loop    
	    for (int miles = 1; miles <= 10; miles++) {
	      System.out.println(miles + "\t\t" + miles * 1.609);
	    }
	*/

		
		/*
		//15 soru
		   Scanner input = new Scanner(System.in);
		    // Prompt the user to enter the number of lines
		    System.out.print("kac satir istiyorsun");
		    int satirsayi = input.nextInt();
		    
		    // Print sira
		    for (int sira = 1; sira <= satirsayi; sira++) {
		      // Boslulari bas
		      //	System.out.print("bosluklari bas");
		      for (int kolon = 1; kolon <= satirsayi - sira; kolon++)
		        System.out.print("  ");

		      // ortadakinden oncekileri bas
		      for (int num = sira; num >= 1; num--) {
		    	  	if (num >= 0)
		    	  		System.out.print(" " + num);
		    	  	//else System.out.print("  " + num);
		        //System.out.print((num >= 10) ? " " + num : "  " + num);
		      }
		 
		      // yaridan sonrakileri bas
		      for (int num = 2; num <= sira; num++)
		    	  if (num >= 0)
		    	  		System.out.print(" " + num);
		    	  	else System.out.print("  " + num);
		        //System.out.print((num >= 10) ? " " + num : "  " + num);

		      //yeni satir
		      System.out.println();
		    }
		   */
	}
		
}
