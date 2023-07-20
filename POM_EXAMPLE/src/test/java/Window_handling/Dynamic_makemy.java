package Window_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dynamic_makemy {
	
	WebDriver driver;
	
	
	@Test
	public void action() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
	
		//Actions act=new Actions(driver);
		//WebElement w1=driver.findElement(By.xpath("//div[@data-cy='superOfferLobLabel2\']"));
		//act.click(w1);
		driver.findElement(By.xpath("//input[@id='username\']")).sendKeys("8533904286");
		driver.findElements(By.xpath("//button[@class='capText font16']"));
		WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
		
		from.click();
		WebElement fr=driver.findElement(By.xpath("//input[@placeholder='From\']"));
		fr.sendKeys("Mumbai");
		fr.sendKeys(Keys.ARROW_DOWN);
		fr.sendKeys(Keys.ENTER);
	
	
	
	
}
}
