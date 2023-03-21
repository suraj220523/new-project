package important;

import java.util.Scanner;

public class Getmax
{

	public void getmax(int a[])
	{
		
		int max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		
	}
	
	public static void main(String[] args) 
	{
		Getmax ob = new Getmax();
		int a[]=new int[5];
		System.out.println("Please enter the 5 inputs");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		ob.getmax(a);
	}
}
