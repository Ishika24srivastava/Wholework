package assignemnt3;
import java.util.*;

public class multipleC {
	public static void main(String[]args)
	{
		try {
			int a[]= {1,8,9};
			System.out.println(a[10]);
			
			
			}
		catch(ArithmeticException e)
		{
			System.out.println("Aritmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of exceptation occurs ");
		}
		catch(Exception e)
		{
			System.out.println("rest of the code");
		}
		System.out.println("code ends");
		
	}

}
