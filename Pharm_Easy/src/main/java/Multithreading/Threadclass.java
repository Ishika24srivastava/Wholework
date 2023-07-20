package Multithreading;
public class Threadclass extends Thread{

	public void run()
	{  
		System.out.println("thread is running...");  
	}  
	public static void main(String args[])
	{  
		Threadclass t1=new Threadclass();  
		t1.start();  
	 }  
}
