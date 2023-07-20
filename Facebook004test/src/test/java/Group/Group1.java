package Group;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups= {"SmokeTest"})  
	 public void WebLoginPersonalLoan()  
	 {  
	     System.out.println("Web Login Personal Loan");  
	 }  
	 @Test(groups= {"T1"})
	 public void MobileLoginPersonalLoan()  
	 {  
	     System.out.println("Mobile Login Personal Loan");  
	 }  
	 @Test  
	 public void APILoginPersonalLoan()  
	 {  
	     System.out.println("API Login Personal Loan");  
	 }  
	}  
	