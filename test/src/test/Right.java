package test;
import java.util.Scanner;
 
public class Right{
    public static void main(String[] arg) {
        int rows, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows of Pattern");
        rows = scanner.nextInt();
         
        
        for (i = 1; i <= rows; i++) {
          
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}