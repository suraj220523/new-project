package important;

import java.util.Scanner;

public class Armstrong 
{
public void getarmstrong(int input)
{
	int temp=input;
	int sum=0;
	for(;input>0;)
{
	int a=input%10;
	input=input/10;
	sum=sum+(a*a*a);
}
if(sum==temp)
{
System.out.println("Input is ArmStrong");	
}
else
{
System.out.println("Input is not Armstrong");
}
}
public static void main(String[]args)
{
	Armstrong ob=new Armstrong();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the input");
	int input=sc.nextInt();
	ob.getarmstrong(input);
}
}
