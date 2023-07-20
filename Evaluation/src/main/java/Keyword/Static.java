package Keyword;


class Student1{  
    int rollno;  
    String name;  
    static String college = "ITS";  //Static variable
      
    static void change()
    {  
    		college = "BBDIT";   //Static method
    }  
    //constructor to initialize the variable  
    Student1(int r, String n)
    {  
    	this.rollno = r;  
    	this.name = n;  
    }  
    //method to display values  
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);  
	}  
}


public class Static {
  
	    public static void main(String args[]){  
	    	Student1.change();//calling change method  
	    //creating objects  
	    Student1 s1 = new Student1(111,"Karan");  
	    Student1 s2 = new Student1(222,"Aryan");  
	    Student1 s3 = new Student1(333,"Sonoo");  
	    
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

