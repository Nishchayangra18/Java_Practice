package demmm;

import java.util.Scanner;

public class palindrome
{
public static void main(String[] args){
String Input,Reverse="";
Scanner A= new Scanner(System.in);
System.out.println("Check if the input is palindrome");
Input= A.nextLine();
int length= Input.length();
for(int i= length-1;i>=0;i--)
Reverse= Reverse+ Input.charAt(i);
if(Input.equals(Reverse))
 System.out.println("Input is palindrome");
else
 System.out.println("Input is not palindrome ");
}
}