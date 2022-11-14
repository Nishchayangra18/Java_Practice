import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Cgpa;
		float total;
		float avg;
		float eng,phy,chem,maths,cs;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the marks in English: ");
		System.out.print("Enter the marks in Physics: ");
		System.out.print("Enter the marks in Chemistry: ");
		System.out.print("Enter the marks in Mathematics: ");
		System.out.print("Enter the marks in Computer Science: ");
		
		eng=n.nextFloat();
		phy=n.nextFloat();
		chem=n.nextFloat();
		maths=n.nextFloat();
		cs=n.nextFloat();
		
		total=(eng+phy+chem+maths+cs);
		avg=total/5;
		Cgpa=(avg*9.5)/100;
		
		System.out.println("CGPA of the student="+Cgpa);
		
		

	}

}
