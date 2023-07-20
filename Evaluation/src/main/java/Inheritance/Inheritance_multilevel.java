package Inheritance;


class A
{
	public void A()
	{
		System.out.println("A is called");
	}
}

class B extends A
{
	public void B()
	{
		System.out.println("B is called");
	}
}

class C extends B
{
	public void C()
	{
		System.out.println("C is called");
	}
}
public class Inheritance_multilevel {
	public static void main(String[]args)
	{
		C cc=new C();
		cc.C();
		cc.B();
		cc.A();
	}
	
}
