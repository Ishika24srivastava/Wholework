package assignemnt3;
import java.util.*;
//Unchecked exception  are the exception that occurs during runtime i.e these exception  cannot be thrown.

public class Except {
	public static void main(String[]args)
	{
		try
		
		{
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Exception occurs ");
		}
		finally
		{
			System.out.println("Exceptation end ");
		}
	}

}

