package important;

import java.util.Scanner;

public class Reversestringsame
{
	public void getdata(String input)
	{
	String []s=input.split(" ");
	String out="";
	
	for(int i=0;i<=s.length-1;i++)
	{
	String value=s[i];	
	
	char c[]=value.toCharArray();
	for(int k=c.length-1;k<=0;k--)
	{
	out=out+c[k];	
	}
	out=out+" ";
	}
	System.out.println(out);
	}
public static void main(String[] args) {
Reversestringsame ob=new Reversestringsame();
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the input");
String input=sc.nextLine();
ob.getdata(input);
}
}
