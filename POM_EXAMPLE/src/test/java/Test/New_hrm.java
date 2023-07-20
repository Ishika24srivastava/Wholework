package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page_object.Hrm_ui;
import test_Base.Testbase_orange;

public class New_hrm  extends Testbase_orange{

	Hrm_ui h1;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 h1=new Hrm_ui();
		 
	}
	@Test
	public void display() throws InterruptedException
	{
		String s=h1.logo().getText();
		System.out.println("Logo=" +s);
		Thread.sleep(1000);
		//h1.platform_cl().sendKeys(prop.values());
		h1.resources();
		Thread.sleep(1000);
		h1.organs();
		Thread.sleep(1000);
		h1.platform_cl();
		h1.email().sendKeys(prop.getProperty("email")); 
		Thread.sleep(1000);
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
