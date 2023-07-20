package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Super {
WebDriver driver;
	
	@BeforeSuite
	public void SetUp()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void Login() 
	{

		//input to the email and password with valid credentials
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ts123@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Ts@123");
		driver.findElement(By.cssSelector("button#loginbutton")).click();
		driver.close();

	}


}
