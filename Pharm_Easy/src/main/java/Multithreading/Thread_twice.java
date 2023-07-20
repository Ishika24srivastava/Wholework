package Multithreading;

public class Thread_twice extends Thread
{
	public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
		  Thread_twice t1=new Thread_twice();  
		  t1.start();  
		  t1.start();  
		 }  

}
