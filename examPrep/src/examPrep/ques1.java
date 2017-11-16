package examPrep;

public class ques1 {
	public static void main(String[] args) {
		int x = 85;
	    for (int i = 2; i < x; i++) {
	      if (x % i == 0) {
	        System.out.print(i + " ");
	        continue;
	      }
	    }
	    x = 85;
	    for (int i = 2; i < x; i++) {
	      if (x % i == 0) {
	        System.out.print(i);
	        break;
	      }
	    }
	}
}
