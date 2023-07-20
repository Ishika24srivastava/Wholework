package Test_method;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Test_base.demobank_base;
import Test_page.Justdial_page;
import Test_page.demobank_page;

public class demobank_homepage extends demobank_base {
	
	demobank_page demobank_homepage;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		demobank_homepage=new demobank_page();
	}
	
	@Test(priority=1)
	public void Logo()
	{
		demobank_homepage.Logo();
	}
	
	
	@Test(priority=2)
	public void View_demo() throws InterruptedException
	{
		demobank_homepage.View_demo();
	}
	
	@Test(priority=3)
	public void Title() throws InterruptedException
	{
		demobank_homepage.Title();
	}
	
	@Test(priority=4)
	public void Title_banking() throws InterruptedException
	{
		demobank_homepage.Title_banking();
	}
	
	@Test(priority=5)
	public void Transactions() throws InterruptedException
	{
		demobank_homepage.Transaction();
	}
	
	@Test(priority=6)
	public void Retail_demo() throws InterruptedException
	{
		demobank_homepage.Retail_demo();
	}
	
	@Test(priority=7)
	public void corporate_demo() throws InterruptedException
	{
		demobank_homepage.corporate_demo();
	}
	
	@Test(priority=8)
	public void Transaction_password() throws InterruptedException
	{
		demobank_homepage.Transaction_password();
	}
	
	@Test(priority=9)
	public void Online_internet() throws InterruptedException
	{
		demobank_homepage.Online_internet();
	}
	
	
	@Test(priority=10)
	public void Aboutus() throws InterruptedException
	{
		demobank_homepage.Aboutus();
	}
	
	@Test(priority=11)
	public void Personal() throws InterruptedException
	{
		demobank_homepage.Personal();
	}
	
	@Test(priority=12)
	public void Business() throws InterruptedException
	{
		demobank_homepage.Business();
	}
	
	@Test(priority=13)
	public void Invest() throws InterruptedException
	{
		demobank_homepage.Invest();
	}
	
	@Test(priority=14)
	public void NRI() throws InterruptedException
	{
		demobank_homepage.NRI();
	}
	@Test(priority=15)
	public void Agri() throws InterruptedException
	{
		demobank_homepage.Agri();
	}
	
	

//	
//	@Test(priority=5)
//	public void Corporatewebsite() throws InterruptedException
//	{
//		demobank_homepage.Corporatewebsite();
//	}
//	
//	@Test(priority=6)
//	public void Forex() throws InterruptedException
//	{
//		demobank_homepage.Forex();
//	}
//	
//	@Test(priority=7)
//	public void Key_services() throws InterruptedException
//	{
//		demobank_homepage.Key_services();
//	}
//	
//
//	@Test(priority=8)
//	public void Loan_services() throws InterruptedException
//	{
//		demobank_homepage.Loan_services();
//	}
//	
//
//	@Test(priority=9)
//	public void Online_services() throws InterruptedException
//	{
//		demobank_homepage.Online_services();
//	}
//	
//	@Test(priority=10)
//	public void payment_services() throws InterruptedException
//	{
//		demobank_homepage.payment_services();
//	}
	
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
