package test;
import java.util.Scanner;

public class Company {
	public static void main(String[]args)
	{
		double c,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the salary of user= ");
		a=sc.nextInt();
		System.out.print("Year of service= ");
		b=sc.nextInt();
		c=0.05*a;
		if(b>5 || b==5)
		{
			System.out.println("Bonus accessed= "+c);
		}
		else
		{
			System.out.println("Bonus is denied");
		}
		
	}
}
