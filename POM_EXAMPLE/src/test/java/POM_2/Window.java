package POM_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[]args) {
	
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	

		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");

		Set <String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size());

		for(String winHandle : driver.getWindowHandles()){

			driver.switchTo().window(winHandle);
	
		driver.navigate().to("http://www.google.com");

	}
}
}



