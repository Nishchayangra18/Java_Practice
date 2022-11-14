package demmm;
import java.util.Scanner;

public class cgpa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		     Scanner op=new Scanner(System.in);

		     System.out.println("Enter number of subject");
		     int n=op.nextInt();
		     	     
		     double[] marks=new double[n];
		     System.out.println("Enter marks");
		     for(int i=0;i<n;i++)
	     {
		        marks[i]=op.nextInt();
		     }

		     double grade[]=new double[n];
		     double cgpa = 0,sum = 0,avg=0;

		     for(int i=0;i<n;i++)
		     {
		        grade[i]=(marks[i]/10) ;
		     }

		     for(int i=0;i<n;i++)
		     {
		       sum+=grade[i];
		     }

		     avg=sum/n; 
		     System.out.println("percentage is: "+ avg*10);
		      cgpa= (avg*9.5)/10;
		     System.out.println("cgpa="+cgpa);
		   }
		}
