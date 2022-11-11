
public class Reverse_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=2;l>=i-1;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
