package Bootcamp.Facebook003;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class f1 {
	
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
				WebElement w1=driver.findElement(By.linkText("Forgotten account?"));
				w1.click();
				WebElement w2=driver.findElement(By.xpath("//input[@id='identify_email']"));
				w2.sendKeys("908276353");
				w2.click();
				WebElement w3=driver.findElement(By.xpath("//button[@id='did_submit']"));
				w3.click();
			}
			catch(Exception e)
			{
				System.out.println("Elements not visible");
			}
		}
}
