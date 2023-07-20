package Dependency;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assertion1 {
	
	WebDriver driver;
	String url="https://www.flipkart.com";
	
	@Test
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		Assert.assertEquals("https://www.flipkart.com", url,"site not reached");
		driver.close();
	}
	
	
	
	
}
