package test;

import java.util.Scanner;

public class Occurence {

		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the no=");
			int n=sc.nextInt();
			int[] digitArr=new int[10];
			int r=0;
			while(n>0)
			{
				r=n%10;
				digitArr[r]++;
				n=n/10;
			}
			System.out.println("-----------------------");
			System.out.println("Number \t Frequeny");
			System.out.println("----------------------");
			for(int i=0;i<digitArr.length;i++)
			{
				int dcount=digitArr[i];
				if(dcount!=0)
				{
					System.out.println(i+ "\t" +dcount);
					
				}
			}
			
		}
		
}
