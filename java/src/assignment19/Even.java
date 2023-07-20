package assignment19;
import java.util.Scanner;
public class Even {
	public static void main (String []args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		for(i=1;i<number;i++)
		{
			if(i%2==0)
				System.out.print("\t"+i);
		}
		
	}

}
