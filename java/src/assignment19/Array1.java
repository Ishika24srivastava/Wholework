package assignment19;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter the number of elements:");
			n=sc.nextInt();
			int [] arr=new int[n];
			System.out.println("Enter the elements of array: ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.printf("Sorted  []arr: %s",Arrays.toString(arr));
			
			
		}

}
