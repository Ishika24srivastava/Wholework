package test;
import java.util.Scanner;

public class passFail {
	public static void main(String[]args)
	{
		float s1,s2,s3;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First subjct marks= ");
		s1=sc.nextFloat();
		System.out.print("Enter second  subjct marks= ");
		s2=sc.nextFloat();
		System.out.print("Enter third subjct marks= ");
		s3=sc.nextFloat();
		float sum=s1+s2+s3;
		float percentage=(sum/300)*100;
		System.out.println("Totals mark obtained= "+sum+"Percentage obtained= "+percentage);
		if(percentage>=40 && s1>=33 && s2>=33 && s3>=33)
		{
			System.out.println("You are pass");
		}
		else
		{
			System.out.println("You are fail");
		}
			
	
		
	}
}
