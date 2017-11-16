import java.util.Scanner;
public class MB_Q3 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double distance_km = 14;
		double time_m  = 45.5;
		
		double converted_dist = ((distance_km * 1) / 1.6);
		
		double speed_miles = converted_dist / time_m;
		
		System.out.println("speed = "+speed_miles);
		
		
	}
}