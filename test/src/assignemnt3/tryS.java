package assignemnt3;


public class tryS {
	
	 public static void main(String []args)
	 {
		try {
				int []a= {10,3,4,5};
				System.out.println(a[8]);
		 }
		 catch(Exception e)
		 {
			 System.out.println("exception throw i.e Araayindex out of bound");
		 }
			System.out.println("Code  ends");
			
		 }
	 }