package Javaproject;

import java.util.Scanner;

public class Conditions {
	public static void main(String[]args)
	{
		System.out.println("Enter the number= ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The number is "+num);
		
		//Number is even
			if(num%2==0) {
				System.out.println(" Congratulations ");
				
			}
			else if(num >=1 && num<=20)
			{
				System.out.println("Well done");
			}
			else if(num>=21 && num<=27)
			{
				System.out.println("Congrulations");
			}
			else
			{
				System.out.println("Completed");
			}
				
	}

}
