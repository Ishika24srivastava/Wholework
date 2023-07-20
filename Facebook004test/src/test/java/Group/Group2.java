package Group;
import org.testng.annotations.Test;  
public class Group2 {
	 
	
	public class Car_loan   
	{  
	
	@Test(groups= {"T1"})  
	public void MobileLoginCarLoan()  
	{  
	System.out.println("Mobile Login Home Loan");  
	}  
	@Test(groups= {"SmokeTest"})  
	public void APILoginCarLoan()  
	{  
	System.out.println("API Login Home Loan");  
	}  
	}  
}
