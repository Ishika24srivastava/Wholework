package test;
import java.util.Scanner;


public class swap {
	public static void main(String[]args)
	{
		int n,tmp,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		n=sc.nextInt();
		tmp=n;
		int ldigit=n%10;
		System.out.println("Last digit= "+ldigit);
		while(n>10)
		{
			count++;
			n=n/10;
		}
		int fdigit=n;
		n=tmp;
			System.out.println("n="+n);
			n=n/10;
			System.out.println("n="+n);
			System.out.println("count="+count);
			int r=(int)Math.pow(10, count-1);
			int mid=n%r;
			System.out.println("MID= "+mid);
			int x=fdigit+mid*10+ldigit*(int)Math.pow(10, count);
			System.out.println("After swapping="+x);
	}
}

			
		
			
	