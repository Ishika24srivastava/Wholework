package test;
import java.util.*;

public class unique {
		public static void main(String[]args)
		{
			int a[]= {2,2,3,5};
			Arrays.sort(a);
			for(int i=1;i<a.length-1;i++) {
				if(a[i]!=a[i+1])
					System.out.println(a[i]+" ");
			}
			System.out.println(a[a.length-1]);
		}
}		
