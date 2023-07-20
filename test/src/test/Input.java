package test;
import java.util.Scanner;

public class Input {
	public static void main(String[]args)
	{
		int i,n,sum=0;
		double avg;
		{
			System.out.println("Enter 5 no from user=");
		}
		for( i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			sum+=n;
			
		}
		avg=sum/5;
		System.out.println("The sum of number= "+sum+"Average of number= "+avg);
	}

}
