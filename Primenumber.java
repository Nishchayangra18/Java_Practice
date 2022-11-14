package demmm;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=7;
		int count=0;
		
		if(n<=1) {
			System.out.println("It is not prime");
             return;		
		}
		
		for (int i=1;i<=n/2;i++) {
		      if (n % i == 0) {
		        count++;
		      }
		    }
		
		if (count>1) {
			  System.out.println("The number is not prime");
	    }
	    else {
	      System.out.println("The number is prime");
	    		}
	}
}
