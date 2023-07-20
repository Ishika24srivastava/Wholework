package assignment19;
import java.util.Scanner;

public class Fibacconi {
	public static void main(String[] args) {
		

		    int n , firstTerm = 0, secondTerm = 1;
		    Scanner sc= new Scanner(System.in);
		    System.out.print("Enter the n number= ");
		    n=sc.nextInt();
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm+" " );

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		}



