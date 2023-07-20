package Access_specifier;
//	Public access modifier can be accessed everywhere it has broader range.
 class Show
{
	public void show1()
	{
	System.out.println("Hello welcome ");
	}
}



public  class publicacess {
	public static void main(String[] args)
	{
		Show s=new Show();
		s.show1();
		System.out.println("Printed the text");
	}

}
