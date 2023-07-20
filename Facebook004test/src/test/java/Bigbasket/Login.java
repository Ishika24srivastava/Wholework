package Bigbasket;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	
	@BeforeSuite
	public void set()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		
	}
	
	@Test
	public void  Enter() 
	{
		driver.get("https://www.bigbasket.com/?nc=close");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login/Sign Up'  and  @qa='loginLink']")));
		driver.findElement(By.xpath("//a[text()='Login/Sign Up'  and  @qa='loginLink'] ]")).click();
		
		
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}

}
