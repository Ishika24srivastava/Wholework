package multiple;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class browser {
	

		
		@Test
		public void browser1()
		{
			WebDriverManager.chromedriver().setup();
//			ChromeOptions chromeOptions = new ChromeOptions();
//			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1=new FirefoxDriver();
			driver1.get("https://www.flipkart.com/");
			driver1.manage().window().maximize();
			
		}
		
	}


