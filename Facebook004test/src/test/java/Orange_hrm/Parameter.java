package Orange_hrm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Parameter {

	WebDriver driver;
		
		@Test
		@Parameters({"username", " password"})
		public void TestLogin(String user,String pass) throws InterruptedException 
		{
			WebDriverManager.chromedriver().setup();
			//Driver object
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			WebDriver  driver=new ChromeDriver(chromeOptions);
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			driver.quit();
		}
	}



