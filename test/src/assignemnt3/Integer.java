package assignemnt3;
import java.util.*;
import java.util.Scanner;

public class Integer {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

			try {
				System.out.print("enter x=");
				int x=sc.nextInt();
				System.out.print("enter y=");
				int y=sc.nextInt();
				System.out.println(""+(x/y));
			
				}
			catch(InputMismatchException e)
			{
				System.out.println("java.util.InputMismatchException");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		
	
	}

}
