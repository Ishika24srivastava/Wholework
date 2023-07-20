// Loop through array
package Arrayjava;
import java.util.*;
import java.util.Scanner;
public class Loop {
	

	  public static void main(String[] args) {
		  
	    //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		  Scanner sc=new Scanner(System.in);
		  String []cars=new String[5];
		  
	    System.out.println("enter the value from user =");
	    for (int i = 0; i < cars.length; i++) // length is the property of array
	    {
	      cars[i]=sc.next();
	    }
	    
	    for(int i=0;i< cars.length;i++)
	    {
	    	System.out.println(" element of array="+cars[i]);
	    }
	  }
	  
	}


