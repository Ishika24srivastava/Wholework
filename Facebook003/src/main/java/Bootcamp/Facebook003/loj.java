package Bootcamp.Facebook003;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class loj {
	
		public static void main(String[]args) {

			//Initialize the browser driver
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			//Driver object
			ChromeOptions chromeoptions=new ChromeOptions();
			chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			WebDriver driver=new RemoteWebDriver(chromeoptions);
			// URL 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			//WebElement w1=driver.findElement(By.xpath("//input[@placeholder="Username"]"));
			//Boolean p=w1.isDisplayed();
			//System.out.println("it is displayed");
			
	}
	}

