package test;
import java.util.Scanner;
public class fibaconni { 
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3=1,n;
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter the number= ");
	 n=sc.nextInt();
	 System.out.println("Fibacconi series= ");
	    
	 for(int i=1;i<=n;++i)    
	 {    
		 n1=n2;
		 n2=n3;
		 n3=n1+n2;    
	  System.out.println(n1+" ");    
	  
	 }    
	  
	}

}
