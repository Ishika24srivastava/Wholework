package Nestedloop;

import java.util.Scanner;

public class Nested_for {

	public static void main(String[] args) {

	   System.out.println("Enter no of rows=");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
	
	    	// outer loop
			for (int i = 1; i <= rows; ++i) {

			// inner loop to print the numbers
			for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	    }
	      
	      System.out.println("");
	    }
	  }
}
