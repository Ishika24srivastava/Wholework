package test;
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args) {
		int r,sum=0,tmp,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number= ");
		n=sc.nextInt();
		tmp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum *10)+r;
			n=n/10;
		}
		if(tmp==sum)
		{
			System.out.println("No is palindrome");
		}
		else
		{
			System.out.println("No is  not palindrome");
		}
		}
	}


