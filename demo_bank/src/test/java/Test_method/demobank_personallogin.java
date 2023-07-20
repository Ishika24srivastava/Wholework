package Test_method;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Test_base.demobank_base;
import Test_page.demobank_page;

public class demobank_personallogin extends demobank_base{

	demobank_page demobank_personal;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		demobank_personal=new demobank_page();
	}
	
	@Test(priority=1)
	public void Internet_banking() throws InterruptedException
	{
		demobank_personal.Internet_banking();
		
	}
	
	
	@Test(priority=2)
	public void Personal_login() throws InterruptedException
	{
		demobank_personal.Personal_login();
		
	}
	
	@Test(priority=3)
	public void Disclaimer()
	{
		demobank_personal.Disclaimer();
	}
	
	@Test(priority=4)
	public void Modalbody() throws InterruptedException
	{
		demobank_personal.Modalbody();
	}
	
	@Test(priority=5)
	public void Agree() throws InterruptedException
	{
		demobank_personal.Agree();
	}
	
	
}
