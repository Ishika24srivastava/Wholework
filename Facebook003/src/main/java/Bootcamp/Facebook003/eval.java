package Bootcamp.Facebook003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class eval {
	public static void main(String[]args)
	{
					// Initializing browser driver
					System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
					//Driver object
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
					
					WebDriver driver=new ChromeDriver(chromeOptions);
					driver.get("https://www.amazon.in/");
					driver.manage().window().maximize();
					WebElement w1=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
					w1.click();
					WebElement w2=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
					w2.click();
					WebElement w3=driver.findElement(By.xpath("//input[@id='ap_email']"));
					w3.sendKeys("srivastavaishika2@gmail.com");
					driver.close();
					
		}
	
}
