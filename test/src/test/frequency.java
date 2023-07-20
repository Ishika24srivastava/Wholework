package test;

public class frequency {
	
	public static void main(String[]args) {
		int[]n=new int[] {1,3,2,1,3,4,5,2,4};
		int[]frequency=new int[n.length];
		int counted=-1;
		for(int i=0;i<n.length;i++)
		{
			int count=1;
		for(int j=i+1;j<n.length;j++)
		{
			if(n[i]==n[j])
			{
				count++;
				frequency[j]=counted;
			}
		}
			if(frequency[i]!=counted)
				frequency[i]=count;
			
		}
		for(int i=0;i<frequency.length;i++)
		{
			if(frequency[i]!=counted)
				System.out.println("Element: "+n[i]+"Frequency: "+frequency[i]);
			
		}
		
		
	}
}

