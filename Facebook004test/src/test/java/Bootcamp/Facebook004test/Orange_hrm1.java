package Bootcamp.Facebook004test;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Orange_hrm1 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
	//Driver object
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	driver=new ChromeDriver(chromeOptions);
	}
		
	

	
		

			@Test(dataProvider="logintestData")
			public void TestLogin(String username,String password) throws InterruptedException
			{
				
				 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				
				Thread.sleep(8000);
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
				Thread.sleep(1000);
				driver.quit();
			}
			@DataProvider(name="logintestData")
			public Object[][] loginData()
			{
				return new Object[][] {
					{"Admin","admin123"},{"Admin","123"}
				};
			}
			
			@AfterSuite
			public void Toclose()
			{
				driver.close();
			}

}
