package Orange_Hrm;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
	public static void main(String[]args) throws InterruptedException  {

					
				// Initializing browser driver
					System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
					//Driver object
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
					
					WebDriver driver=new ChromeDriver(chromeOptions);
					
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					driver.manage().window().maximize();
					// user name
					
							WebDriverWait  w=new WebDriverWait(driver,Duration.ofSeconds(6));
							WebElement w1= w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
							w1.sendKeys("Admin");
							
							//Thread.sleep(800);
							WebElement w2=driver.findElement(By.xpath("//input[@name='password']"));
							w2.sendKeys("admin123");
							WebElement w3=driver.findElement(By.xpath("//button[@type='submit']"));
							w3.click();
							//Thread.sleep(200);
	}
}
					