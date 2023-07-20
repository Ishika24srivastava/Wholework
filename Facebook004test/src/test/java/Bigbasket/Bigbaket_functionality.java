package Bigbasket;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbaket_functionality {

		WebDriver driver;
		
		
		@Test
		public void Login1() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver=new ChromeDriver(chromeOptions);
			driver.get("https://www.bigbasket.com/basket/?ver=1");
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='mobile'  and @name='mobile']")).sendKeys("8533904286");
			
			//w1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("//button[@type='submit']")));
			driver.findElement(By.xpath("//button[@class='btn btn-default signup-btn']")).click();
			Thread.sleep(200);
			
			//w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ id='otp']")));
			driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("266399");
			Thread.sleep(1000);
			
			
			//w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='login-main-content']")));
			driver.findElement(By.xpath("//div[@class='login-main-content']")).click();
			driver.close();
			
		}
		
		
		
		
		
		
		
}
