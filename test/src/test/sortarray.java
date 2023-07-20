package test;

public class sortarray {

	public static void main(String[]args)
	{
		int[] arr= new int[] {4,2,5,6};
		int tmp=0;
		System.out.println("elements of  original array");
		for(int i=0;i<arr.length;i++)
		{	System.out.println(arr[i]+"");
		
		}
		for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j])
			{
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				
			}
			
			
		}
			
		}
		System.out.println();
		System.out.println("enter  the ordered array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
}
