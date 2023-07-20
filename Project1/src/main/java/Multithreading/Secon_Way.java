package Multithreading;

public class Secon_Way implements Runnable {
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		Secon_Way m1=new Secon_Way();  
		Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		 }  

}
