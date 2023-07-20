package assignment19;
import java.util.Scanner;

public class oddNumber {
	
		 
		public static void main(String[] args) 
		{
			int number, num,i;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter First Number : ");
			num = sc.nextInt();	
			System.out.print(" Please Enter  second Number : ");
			number= sc.nextInt();	
			
			for(i = num; i <= number; i++)
			{
				if(i % 2 != 0)
				{
					System.out.print(i +"\t"); 
				}
			}	
		}
	}

