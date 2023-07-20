package fblogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_login {
	public static void main(String[]args) 
	{
		//setup to browser driver
		WebDriverManager.chromedriver().setup();
		//Driver object
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		//  browser
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//wait method for visibility check 
		WebDriverWait  w13=new WebDriverWait(driver,Duration.ofSeconds(3));
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@alt='Facebook']")));
		System.out.println("Facebook logo is visible");
		
		
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='email']")));
		System.out.println("Email textbox is visible");
		
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input#pass")));
		System.out.println("Password textbox is visible ");
		
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button#loginbutton")));
		System.out.println("Login button is visible ");
		
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Forgotten account?")));
		System.out.println("Forgot  account  is visible at the facebook login page ");
		
		w13.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Sign up for Facebook")));
		System.out.println("Sign up text  is visible at the facebook login page ");
		
		//input to the email and password
		WebElement w1=driver.findElement(By.xpath("//input[@id='email']"));
		w1.sendKeys("Ts123@gmail.com");
		
		WebElement w2=driver.findElement(By.cssSelector("input#pass"));
		w2.sendKeys("Ts@123");
		//button
		WebElement w3=driver.findElement(By.cssSelector("button#loginbutton"));
		w3.click();
		driver.close();
		
		
		
		
		
		
		
		
		
	
	}

}
