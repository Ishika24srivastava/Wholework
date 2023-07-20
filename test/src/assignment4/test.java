package assignment4;
import java.util.*;

public class test {
	public static void main(String[]args) {
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		hash.put("red", 1);
		hash.put("green", 2);
		hash.put("purple", 3);
		hash.put("pink", 4);
		hash.put("blue", 5);
		System.out.println("the map= "+hash);
		System.out.println("Is desired key exits? ");
		if(hash.containsKey("purple"))
		{
			System.out.println("yes !  "+hash.get("purple"));
		}
		else
		{
			System.out.println("not exist");
		}
	}

}
