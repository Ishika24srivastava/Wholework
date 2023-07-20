package test;

public class Minmax {

		public static void main(String[]args) {
			
			int arr[]= {10,4,56,78};
			int min=arr[0];
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<min)
				{
					min=arr[i];
				}
			if(arr[i]>max)
			{
			
			
				max=arr[i];
			}
			}
			System.out.println("Max value= "+max);
			System.out.println("Min value= "+min);
			
		}
}
