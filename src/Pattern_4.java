
public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==5||i==4&&j>1&&j<3||i==4&&j>7&&j<9||i==3&&j>2&&j<4||i==3&&j>6&&j<8||i==2&&j>3&&j<5||i==2&&j>5&&j<7||i==1&&j>4&&j<6)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
