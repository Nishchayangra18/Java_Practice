package demmm;

public class StringCount
{
public static void main(String[] args){
String str = "weattach";
int count=0;

for(int i=0;i<str.length();i++)
{
if(str.charAt(i) !=' ')
count++;
}

System.out.println("Number of charecter in the given string are: " +count);
}
}