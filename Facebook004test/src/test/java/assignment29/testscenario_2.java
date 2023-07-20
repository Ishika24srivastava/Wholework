package assignment29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testscenario_2 {
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void linkCount()
	{
		List<WebElement> Link=driver.findElements(By.tagName("a"));
		System.out.println("Numbers of a link page:: "+Link.size());
	}
	
	@Test
	public void getALL()
	{
		List<WebElement> Link=driver.findElements(By.tagName("a"));
		for(WebElement link:Link)
		{
			System.out.println("LinkText :: "+link.getText());
			System.out.println("Link URL :: "+link.getAttribute("href"));
			
		}
	}
	@AfterSuite
	public void Close()
	{
		driver.close();
	}
	
}
