package assignment4;
import java.util.*;

public class sort {
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(23);
		list.add(12);
		list.add(32);
		list.add(13);
		System.out.println("before sorted list ="+list);
		Collections.sort(list);
		System.out.println("after sorted list: "+list);
	
		
		
	}
}
