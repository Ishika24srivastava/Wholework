package assignment21;

public class LastString {
	  
	public static void main(String[] args)   
	{  
	 
	LastString rlc = new LastString();  
	String string="ISHIKA SRIVASTAVA";  
	string=rlc.removeLastChar(string);        
	System.out.println(string);  
	}  
	 
	private String removeLastChar(String s)   
	{  
		return s.substring(0, s.length() - 1);  
	}   
	} 

