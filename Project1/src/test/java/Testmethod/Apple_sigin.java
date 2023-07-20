package Testmethod;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Apple_page;
import Testbase.Apple_base;


public class Apple_sigin extends Apple_base{
	
	Apple_page apple1;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 apple1=new Apple_page();
		
	}
	
	@Test(priority=1)
	public void Move_bag()
	{
		apple1.Bag().click();
		String title=driver.getTitle();
		System.out.println("The titile= "+title);
		
	}
	@Test(priority=2)
	public void Sign()
	{
		apple1.Sign_in().click();
		String url=driver.getTitle();
		System.out.println("The current url= "+url);
		
	}
	
	@Test(priority=3)
	public void Create() throws InterruptedException
	{
		driver.switchTo().frame(0);
		System.out.println("frame is viewed");
		apple1.Create().click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("The title= "+title);
		Assert.assertEquals(title,"Sign In — Secure Checkout - Apple (IN)");
		
	}
	
	@Test(priority=4)
	public void Firstname() throws InterruptedException
	{
		Thread.sleep(2000);
		Set<String> ids=driver.getWindowHandles();
		
		
		Iterator<String>  it= ids.iterator();
		while (it.hasNext())
		//By using for each loop
		//for(String li:ids)
		
		{
			String Child=it.next();
			driver.switchTo().window(Child);
			
		}
		//without using for each loop
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		//apple1.First_name().click();
		//apple1.First_name().sendKeys("Ishika");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=5)
	public void display()
	{
		boolean status=driver.findElement(By.xpath("//div[text()='One Apple ID is all you need to access all Apple services.']")).isDisplayed();
		System.out.println(status);
	}
	
	@Test(priority=5,enabled=false)
	public void Lastname() throws InterruptedException
	{
		apple1.Last_name().click();
		apple1.Last_name().sendKeys("Srivastava");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=6,enabled=false)
	public void Date_birth() throws InterruptedException
	{
		apple1.dob().sendKeys("24/12/2001");
		Thread.sleep(1000);
		String title=driver.getCurrentUrl();
		System.out.println(title);
	}
	
	@Test(priority=7,enabled=false)
	public void Email() throws InterruptedException
	{
		apple1.Email().sendKeys("ishikasrivastava2422@gmail.com");
		Thread.sleep(1000);
		String title=driver.getCurrentUrl();
		System.out.println(title);
	}
	
	@Test(priority=8,enabled=false)
	public void Password() throws InterruptedException
	{
		apple1.Password().sendKeys("ishika@12");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=9,enabled=false)
	public void Confirm_pass() throws InterruptedException
	{
		apple1.Confirm_pass().sendKeys("ishika@12");
		Thread.sleep(1000);
		String title=driver.getCurrentUrl();
		System.out.println(title);
	}
	
	@Test(priority=10,enabled=false)
	public void Phone() throws InterruptedException
	{
		apple1.Phone().sendKeys("8533904286");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
	}
	
}
