package test;
import java.util.Scanner;

public class sAttendence {
	
			public static void main(String[]args) {
				Scanner sc=new Scanner(System.in);
				System.out.print("Number of classes held= ");
				int x=sc.nextInt();
				System.out.print("Number of classes attended= ");
				int y=sc.nextInt();
				float per=(y/x)*100;
				if(per>=75)
				{
					System.out.println("Student can elgible to sit in exam");
				}
				else
				{
					System.out.println("Student is not elgible to sit in exam");
				}
				
			
		
	}
}
