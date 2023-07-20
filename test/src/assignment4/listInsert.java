package assignment4;
import java.util.*;

public class listInsert {
	public static void main(String[]args) {
		List<String> l1=new ArrayList<String>();
		l1.add("hy");
		l1.add("how");
		l1.add("r");
		l1.add("you");
		System.out.println("list will be "+l1);
		l1.add(2,"hy");
		System.out.println("list after inserted= "+l1);
	}

}
