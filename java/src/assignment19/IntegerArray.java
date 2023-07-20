package assignment19;

public class IntegerArray {
		private int[] data;
		public void read(int []input)
		{
			data=input;
		}
		public void display()
		{
			for(int i=0;i<data.length;i++)
			{
				System.out.println(data[i]+" ");
			}
			System.out.println();
		}
		public int findLargest()
		{
			int largest=data[0];
			for(int i=1;i<data.length;i++)
			{
				if(data[i]>largest)
				{
					largest=data[i];
				}
			}
			return largest;
		}
		public int findSmallest()
		{
			int smallest=data[0];
			for(int i=1;i<data.length;i++)
			{
				if(data[i]<smallest)
				{
					smallest=data[i];
				}
			}
			return smallest;
		}
		public int sum()
		{
			int total=0;
			for(int i=0;i<data.length;i++)
			{
				total+=data[i];
				
			}
			return total;
		}
		public double  findMean()
		{
			double mean=0;
			if(data.length>0)
			{
				mean=(double)sum()/data.length;
			}
			return mean;
		}
		public static void main(String []args)
		{
			IntegerArray arr=new IntegerArray();
			int [] input= {1,2,3,5,6};
			arr.read(input);
			arr.display();
			System.out.println("Largest: "+arr.findLargest());
			System.out.println("Largest: "+arr.findSmallest());
			System.out.println("Largest: "+arr.findMean());
			
		}
}
