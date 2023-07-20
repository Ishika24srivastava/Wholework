package Access1;

import Access_specifier.Protectedaccess;
//Protected access modifier is accessible within the package and outside the package through inheritance.
public class Protectedmain extends Protectedaccess {
	
	public static void main(String[]args)
	{
		Protectedmain ac=new Protectedmain();
		ac.show();
	}

}
