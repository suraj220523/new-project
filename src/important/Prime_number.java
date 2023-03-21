package important;
import java.util.Scanner;
public class Prime_number {
	
	public void getdata(int input)	
	{
		
		if(input==0|input==1)
		{
			System.out.println(input+ " is not prime number");
		}
		else 
		{
			boolean flag=false;
			for (int j=2;j<input;j++)
				
			{
				if(input%j==0)
				{
					flag= true;
					System.out.println(input+" is not prime number");
				break;
			}
			}
				if (flag==false)
				{
					System.out.println(input+" is prime number");
				}
	}}
	public static void main(String[] args) {
		Prime_number ob=new Prime_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		int input=sc.nextInt();
		ob.getdata(input);
	}

}
