package fblogin;

//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fb_login1 {

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

	}

	@Test
	public void Login1() 
	{

		//input to the email and password with valid credentials
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//input[@id='email']"));
		w1.sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input#pass"));
		//button
		driver.findElement(By.cssSelector("button#loginbutton")).	click();;
	
	}

	@Test
	public void Login11() 
	{

		//input to the email and password with valid credentials
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//input[@id='email']"));
		w1.sendKeys("abc@gmail.com");

		driver.findElement(By.cssSelector("input#pass"));
		//button
		WebElement w3=driver.findElement(By.cssSelector("button#loginbutton"));
		w3.click();
	}
	@Test
	public void Login12() 
	{

		//input to the email and password with valid credentials
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']"));

		WebElement w2=driver.findElement(By.cssSelector("input#pass"));
		w2.sendKeys("abc12");
		//button
		WebElement w3=driver.findElement(By.cssSelector("button#loginbutton"));
		w3.click();
	}


	@AfterSuite
	public void quit()
	{

		driver.close();

	}
}

