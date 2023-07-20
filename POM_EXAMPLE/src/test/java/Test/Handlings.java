package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlings {

	@Test
	public void iframe()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame("mce_0_ifr").getTitle();
		System.out.println("frame is viewed");
		driver.switchTo().defaultContent();
		//driver.switchTo().
	}
}
