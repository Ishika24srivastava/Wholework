package test;
import java.util.Scanner;

public class calculator {
	
	public static void main(String[]args)
	{
		int operator;
		double d1,d2;
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1: Add \n 2: Subtract \n 3: Multiply \n 4: Divide");
		System.out.println("enter the  operator= ");
		operator=sc.nextInt();
		System.out.print("enter the first no ");
		d1=sc.nextDouble();
		System.out.print("enter the  second  no ");
		d2=sc.nextDouble();
		double result=0;
		switch(operator)
		{
			case 1:
					result=d1+d2;
					break;
			case 2:
					result=d1-d2;
					break;
			case 3:
					result=d1*d2;
					break;
			case 4:
					result=d1/d2;
					break;
			default:
					System.out.println("sorry wrong choice enter");
		}
		 System.out.println("Result= "+result);
		
		
	}

}
