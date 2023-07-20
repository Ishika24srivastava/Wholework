package test;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[]args)
	{
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of rectangle= ");
		l=sc.nextDouble();
		System.out.print("Enter the breadth of rectangle= ");
		b=sc.nextDouble();
			if(l==b)
			{
				System.out.println(" It's a square");
				
			}
			else
			{
				System.out.println(" It's  not a square");
				
			}
		
		
	}
}
