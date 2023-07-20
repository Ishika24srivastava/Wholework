package assignment5;

public class employee {
	 float salary=30000;

}
class S extends employee{
	float bonus=1500;
	public static void main(String[]args)
	{
		S ob=new S();
		System.out.println("SALARY IS "+ob.salary);
		System.out.println("SALARY IS "+ob.bonus);
	}
}
