package important;

import java.util.Scanner;

public class Reverse_string
{
	public void getdata(String input)
	{
	char c[]=input.toCharArray();
	String out="";
	for(int i=c.length-1;i>=0;i--)
	{
	out=out+c[i];	
	}
	System.out.println(out);
	}
	public static void main(String[] args) {
	Reverse_string ob=new Reverse_string();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter input");
	String input=sc.next();
	ob.getdata(input);
	}
}