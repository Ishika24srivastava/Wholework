package assignment21;
import java.util.Arrays; 
public class Copy {

	
	 public static void main(String[] args) {
	   int[] my_array = {1,4,5,6,9,12,34};
	   int[] new_array = new int[7];     
	 
	   System.out.println("Source Array : "+Arrays.toString(my_array));     
	   
	   for(int i=0; i < my_array.length; i++) {
	    new_array[i] = my_array[i];
	}
	   System.out.println("New Array: "+Arrays.toString(new_array));
	 }
	 }
	 


