package Bootcamp.Facebook003;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class f2Css {


	public static void main(String []args)
		{
			
			// Initializing browser driver
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			//Driver object
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			
			WebDriver driver=new ChromeDriver(chromeOptions);
			
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			// FORGOTT PASSWORD
			try
			{	WebDriverWait  w=new WebDriverWait(driver,Duration.ofSeconds(3));
				w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Forgotten account?")));
				
				System.out.println("Fogotten account is visible at the login page");
				WebElement w1=driver.findElement(By.cssSelector("a._97w4"));
				w1.click();
				WebElement w2=driver.findElement(By.cssSelector("input#identify_email"));
				w2.sendKeys("srivastavaishika2@gmail.com");
				WebElement w3=driver.findElement(By.cssSelector("button#did_submit"));
				w3.click();
			}
			catch(Exception e)
			{
				System.out.println("Elements not visible");
			}
		
			//driver.close();
			//driver.quit();
			
		}
}


