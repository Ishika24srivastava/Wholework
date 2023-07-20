package javaprogram;

public class Pyramid {

	public static void main(String[] args) {
		
			int i,j,r=5;
			for(i=0;i<r;i++)
			{
				for(j=2*(r-i);j>1;j--)
				{
					System.out.print(" ");
				}
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
}
}
