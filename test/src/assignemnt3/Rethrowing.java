package assignemnt3;

public class Rethrowing {
	public static void divide()
	{
		int x=6;
		int y=0;
		int z;
		try
		{
			z=x/y;
			System.out.println(x+"/"+y+"="+z);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught in divide");
			System.out.println("cannot divide by zero");
			throw e;
			
		}
	}
		public static void main(String []args)
		{
			System.out.println("start main ");
			try
			{
				divide();
			}
			catch(ArithmeticException e)
			{
				System.out.println("rethrown exception ");
				System.out.println(e);
			}
		}
}
	
	
