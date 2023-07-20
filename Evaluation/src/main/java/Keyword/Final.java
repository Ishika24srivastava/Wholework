package Keyword;

class Final {
	
	final int age=21;//final variable
	final int mobile;//Blank final variable
	
	Final() //Initializing the value to the  blank final variable
	{
		mobile=562526;
	}
	
	final void show()//Final method
	{
		System.out.println("hello");
	}
	
	void play()
	{
		System.out.println("Hy welcome to the world");
	}
	
	
	public static void main(String[]args)
	{
		Final f=new Final();
		
		f.show();
		f.play();
	}

}
