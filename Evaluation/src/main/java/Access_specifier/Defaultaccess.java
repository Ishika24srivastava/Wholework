package Access_specifier;

class Student1 {
    
    int rollNo = 5;
    String name="Ishika";

    void showRollNo(){
         System.out.println("RollNo = " + rollNo);
         System.out.println("Name= "+name);
    }
}
//Default  access specifier cannot be accessible  from outside the package.
//We cannot override the default  super class method in subclass it shows an compile time error.
public class Defaultaccess {
	public static void main(String args[]){
        //creating Student class object
        Student1 obj = new Student1();

        //Printing  the age 
        System.out.println(obj.rollNo);//
        //calling the method 
        obj.showRollNo();

}
}
