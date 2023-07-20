package Demomethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Demobase.Demoamazon_base;
import Demopage.Demomethod;


public class Demoui  extends Demoamazon_base{
	
	Demomethod m1;
	public ExtentTest test;
	public ExtentReports extent;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 m1=new Demomethod();
		 
	}
	
	@BeforeTest
	public void x() 
	{
		
		extent=new ExtentReports("./Report//careReport.html",true);	
	}
	
	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=1)
	public void Women() throws InterruptedException
	{
		m1.Women().click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url, "https://www.ajio.com/shop/women");
		
	}
	
	@Test(priority=2)
	public void Kids() throws InterruptedException
	{
		m1.Kids().click();
		Thread.sleep(500);
		String title=driver.getTitle();
		System.out.println("The current title = "+title);
		Assert.assertEquals(title,"Online Kids fashion shopping site in India - AJIO");
	}
	
	@Test(priority=3)
	public void Indie() throws InterruptedException
	{
		m1.Indie().click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url,"https://www.ajio.com/shop/indie");
	}

}
