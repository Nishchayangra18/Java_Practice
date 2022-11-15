import java.util.Scanner;

public class Palindrome_Nishchay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,sum=0,r;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= n.nextInt();
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("It is a palindrome number");
			
		}
		else
			System.out.println("It is not a palindrome number");

	}

}
