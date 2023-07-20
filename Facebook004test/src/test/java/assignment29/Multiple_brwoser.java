package assignment29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_brwoser {

	WebDriver driver;
	
	
	@Test
	public void browser1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	WebDriver driver1;
	
	@Test
	public void browser2()
	{
		WebDriverManager.firefoxdriver().setup();
		driver1=new FirefoxDriver();
		driver1.get("https://www.amazon.in/");
		driver1.manage().window().maximize();
		
	}
}
