package Test_method;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page_object.Swag_page;
import Test_base.Test1_base;

public class Test_Swag  extends Test1_base{
	Swag_page pg;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pg=new Swag_page();
	}
	
	
	
	
	//Valid Credentials
	@Test(priority=1)
	public void Valid_Credentials() throws InterruptedException 
	{
		
		boolean status=pg.lo().isDisplayed();
		System.out.println("Logo is visible: "+status);
		
		pg.enter_user().sendKeys(prop.getProperty("username1"));
		pg.enter_password().sendKeys(prop.getProperty("password1"));
		pg.click();
		Thread.sleep(1000);
		System.out.println("Successfully  login");
		pg.menu();
		Thread.sleep(1000);
		pg.log();
		Thread.sleep(1000);
		System.out.println("Successfully logged out");
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}
	
	
	//Blank Password
	@Test(priority=2)
	public void Blank_pass() throws InterruptedException
	{
		
		pg.enter_user().sendKeys(prop.getProperty("username2"));
		pg.click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText(),"Epic sadface: Password is required");
		
	}
	
	
	//Blank UserName and password
	@Test(priority=3)
	public void Blank_uname() throws InterruptedException
	{
		
		pg.click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(), "Epic sadface: Password is required");
		driver.navigate().refresh();
	}
	
	//Invalid UserName and password
	@Test(priority=4)
	public void Invalid_pass() throws InterruptedException 
	{
		pg.enter_user().sendKeys(prop.getProperty("username1"));
		pg.enter_password().sendKeys(prop.getProperty("password2"));
		pg.click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
		}
	
	//Invalid UserName and Valid password
	@Test(priority=5)
	public void Invalid_user() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		pg.enter_user().sendKeys(prop.getProperty("username2"));
		pg.enter_password().sendKeys(prop.getProperty("password1"));
		pg.click();
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
		
	}
	
	//Invalid Credentials
	@Test(priority=6)
	public void Invalid_Credentials() throws InterruptedException 
	{
		
		pg.enter_user().sendKeys(prop.getProperty("username2"));
		pg.enter_password().sendKeys(prop.getProperty("password2"));
		pg.click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
	}
	
	
	
	@Test(enabled=false)
	public void Blank_Credenetials()
	{
		
		pg.enter_password().sendKeys(prop.getProperty("password3"));
		pg.click();
	}
	
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
	
}
