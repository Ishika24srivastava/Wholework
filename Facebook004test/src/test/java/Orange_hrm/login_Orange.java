package Orange_hrm;

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

public class login_Orange {
	WebDriver driver;
	
	@BeforeSuite
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		
	}
	
	@Test()
	public void Login() 
	{
		driver.get("");
		driver.manage().window().maximize();
		
		WebDriverWait  w13=new WebDriverWait(driver,Duration.ofSeconds(3));
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Username']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Password']")));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()=' Login ']")));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	}
	
	
	@AfterSuite
	public void aftersuit()
	{
		driver.close();
	}

}
