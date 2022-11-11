
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=456,originalnumber,remainder,result=0;
		originalnumber = number;
				while(originalnumber!=0)
				{
					remainder=originalnumber%10;
					result+= Math.pow(remainder, 3);
					originalnumber/=10;
				}
				if(result==number)
					System.out.println("Armstrong number");
				else
					System.out.println("Not an Armstrong number");

	}

}
