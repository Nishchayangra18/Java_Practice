package demmm;

public class CGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double Physics,Chemistry,Maths,English,EnggGraphics,Avg,Cgpa;
        Physics = 79;
        Chemistry = 85;
        English = 87;  
        EnggGraphics = 100;  
        Maths = 95;  
        Avg = (79+85+87+100+95)/(5);  
        Cgpa = (float)((9.5)/100 * (Avg));
        System.out.println(" Cgpa is:  "+Cgpa);  
        }  
    }  
	


