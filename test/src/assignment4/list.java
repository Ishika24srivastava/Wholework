package assignment4;
import java.util.*;

public class list {
	public static void main(String[]args) {
		List<String> l1=new ArrayList<String>();
		l1.add("rahul");
		l1.add("ram");
		l1.add("shyam");
		l1.add("sohan");
		System.out.println("list formed= "+l1);
		l1.add(1,"soan");
		System.out.println("after inserted at first position= "+l1);
	}

}
