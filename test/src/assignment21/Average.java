package assignment21;

import java.util.Scanner;

public class Average {
	
		public static void main(String[] args) {   
		 
		       int[] numbers = new int[6];
		    	 Scanner sc=new Scanner(System.in);
				
				  
			    System.out.println("enter the value from user =");
			    for (int i = 0; i < numbers.length; i++) 
			    {
			      numbers[i]=sc.nextInt();
			    }
			    
			    int sum = 0;
		       for(int i=0; i < numbers.length ; i++)
		        sum = sum + numbers[i];
		     
		        double average = sum / numbers.length;
		        System.out.println("Average value of the array elements is : " + average); 
		   }
		}


