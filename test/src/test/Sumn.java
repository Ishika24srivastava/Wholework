package test;
import java.util.Scanner;

public class Sumn {
	public static void main(String[]args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n= ");
		int n=sc.nextInt();
		System.out.println("The n natural number are: "+n);
		for(int i=0;i<=n;i++) {
			System.out.println(i);
			sum=sum+i;;
		}
		System.out.println("The sum of n natural no : "+sum);
		
	}

}
