package POMEXAMPLE.POM_EXAMPLE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sample_1 {
	public static WebDriver driver;
	@Test
	public void start()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://demoqa.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Actions act=new Actions(driver);
		WebElement sl=driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary\']"));
		act.moveToElement(sl,80,0).perform();
		sl.click();
		System.out.println("slider moves in horizontal directions");
		
	}

}
