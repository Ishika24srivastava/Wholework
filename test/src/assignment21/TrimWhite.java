package assignment21;

public class TrimWhite {
	 
	    public static void main(String[] args) {  
	          
	        String str1="My name   is ishika";  
	          
	        
	        str1 = str1.replaceAll("\\s+", "");  
	          
	        System.out.println("String after removing all the white spaces : " + str1);  
	    }  
	}  


