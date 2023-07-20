package POPUPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Iframe {
	WebDriver driver;
	@BeforeSuite
	public void start()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
	}
	
	@Test
	public void set()
	{
		driver.switchTo().frame("mce_0_ifr");
		System.out.println("frame is viewed");
		driver.switchTo().defaultContent();
		
		
	}
	
	@AfterSuite
	public void close()
	{
		driver.quit();
	}
	

}
