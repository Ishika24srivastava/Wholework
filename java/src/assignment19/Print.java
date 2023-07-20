package assignment19;

public class Print {
	

	
	    void Printn(int n , char c){  

	        System.out.println("Integer is: "+n+ "\t Char is: "+c);

	    }    

	     void Printn(char c,int n){

	        

	        System.out.println("Char is: "+c+ "\tInteger is: "+n);

	    }   
	     public static void main(String[] args) {

		        
				Print obj = new Print();

		        obj.Printn(10, 'A');

		        obj.Printn('B', 5);

		    }


	}

