package POMEXAMPLE.POM_EXAMPLE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Music {
	
	 public static WebDriver driver;
	 
	 @Test
	 public void start()
	 {
		 System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			WebDriver driver=new ChromeDriver(chromeOptions);
			driver.get("https://demoqa.com/menu/#");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			Actions act=new Actions(driver);
			WebElement w1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
			act.moveToElement(w1).perform();
			
			WebElement w2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a"));
			act.moveToElement(w2).click();
			driver.close();
	 }
}
