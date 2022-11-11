import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4,5,5,5,4,6,6,9,4

        int a[] ={ 4,5,5,5,4,6,6,7,9,5,4};
        int sum =0;
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!num.contains(a[i]))
			{
				num.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					  
					}
					
				}
				 sum=a[i]*k;
			
			System.out.print(a[i]+"-"); 
			System.out.print(k);
			System.out.print("sum"+sum);
			System.out.print("\t");
			System.out.print(" ");
		}
		}
		

	}

}
