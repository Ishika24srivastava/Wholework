package test;
import java.util.Scanner;

public class Shop {
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the quantity= ");
			float n=sc.nextFloat();
			if(n>1000)
			{     double cost=(n*100)-(0.1*(n*100));
				System.out.println("The total cost= "+cost);
			}
			else
			{
				System.out.println("The total cost= "+n);
			}
		}
}
