package assignment4;
import java.util.*;

public class key {
	public static void main(String[]args)
	{
		TreeMap<Integer,String> key=new TreeMap<Integer,String>();
		key.put(1,"anil");
		key.put(4,"anu");
		key.put(6,"akirti");
		key.put(2,"mahima");
		key.put(3,"mohan");
		key.put(5,"abc");
		System.out.println(" Treemap content= "+key);
		System.out.println(" keys  greater than or equal to 4=  "+key.ceilingKey(5));
		System.out.println("keys  greater than or equal to 3=  "+key.ceilingKey(7));
		
	}

}
