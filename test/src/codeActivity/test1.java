package codeActivity;

import java.util.*;


public class test1 {
 public static void main(String[]args)
 {
	Scanner sc=new Scanner(System.in);
			int test=sc.nextInt();
			while(test-->0)
			{
				int n=sc.nextInt();
				int x=sc.nextInt();
				int y=sc.nextInt();
				String s=sc.next();
				int one=0;
				int zero=0;
				for(char ch: s.toCharArray())
				{
					if(ch=='1')
						one++;
					else
						zero ++;
				}
				if(one==0|| zero==0)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(x>y? y: x);
				}
			}
	
	
 }
}
