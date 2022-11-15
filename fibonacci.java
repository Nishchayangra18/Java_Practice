package demmm;

import java.util.Scanner;

public class fibonacci
{
public static void main(String[] args){
int number,l=0,m=0,n=1;
Scanner A= new Scanner(System.in);
System.out.println("Enter the number of times you want series");
number= A.nextInt();
System.out.println("Fibonacci series is:");
for(int i=0;i<number;i++)
{
 l=m;
 m=n;
 n=l+m;
 System.out.println(l+ "");
}
}
}