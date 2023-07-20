package assignment21;
import java.util.Scanner;
public class Removeocc {
	
		public static void main(String[] args) {
			String delFirstCharStr;
			char del_ch;
			
			 Scanner sc= new Scanner(System.in);

			System.out.print("\nPlease Enter String to Delete First Character =  ");
			delFirstCharStr = sc.nextLine();
			
			System.out.print("\nEnter the Character to Delete =  ");
			del_ch = sc.next().charAt(0);
			
			StringBuilder sb = new StringBuilder(delFirstCharStr);
			int i = delFirstCharStr.indexOf(del_ch);
			sb.deleteCharAt(i);
			
			System.out.println("\nThe Final String after Deleting " + del_ch + " = " + sb);
		}
	}


