package assignment29;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class scenario_1 {
	
		WebDriver driver;
		String fbUrl="http://www.fb.com";
		String facebookUrl="https://www.facebook.com";
		
		@Test
		public void  Setup()
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver=new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(fbUrl);
			String urlBrowser=driver.getCurrentUrl();
			if(urlBrowser.equalsIgnoreCase(facebookUrl))
			{
				System.out.println("fb hase redirected");
			}
			else{
				System.out.println("fb has not  redirected");
			}
			WebDriverWait  w=new WebDriverWait(driver,Duration.ofSeconds(9));
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create new account']")));
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First name']")));
			 driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("tanu");
			 
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']")));
			 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gupta");
			 
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email__']")));
			 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ishikasrivastava24@gmail.com");
			 
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_passwd__']")));
			 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc@12");
			 
			 
			 
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
			 Select sDte=new Select(driver.findElement(By.id("day")));
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
			 Select sMonth=new Select(driver.findElement(By.id("month")));
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
			 Select syear=new Select(driver.findElement(By.id("year")));
			 
			 sDte.selectByVisibleText("24");
			 sMonth.selectByVisibleText("Dec");
			 syear.selectByVisibleText("1999");
			 
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio'  and @value='2']")));
			 driver.findElement(By.xpath("//input[@type='radio'  and @value='2']")).click();
			
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email_confirmation__']")));
			 driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ishikasrivastava24@gmail.com");
			 
			 
			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='websubmit']")));
			 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			 System.out.println("Successfully login ");
			 //driver.close();
			 }
		
		
}


