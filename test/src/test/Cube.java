package test;

import java.util.Scanner;

public class Cube {
	
		public static void main(String[]args)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the value of n= ");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println("The number= "+i+ "The cube of a number= "+(i*i*i));
			}
			
	}


}
