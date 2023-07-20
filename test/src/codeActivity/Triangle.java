package codeActivity;
import java.util.*;


public class Triangle {
	public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=0;i<T;i++)
	{
		int N=sc.nextInt();
		int l=1,h=N;
		int mh=0;
		while(l<=h)
		{
			int mi=(l+h)/2;
			long cr=(long) mi*(mi+1)/2;
			if(cr<=N)
			{
				mh=mi;
				l=mi+1;
			}
			else
			{
				h=mi-1;
			}
		}
		System.out.println(mh);
	}
	}
}