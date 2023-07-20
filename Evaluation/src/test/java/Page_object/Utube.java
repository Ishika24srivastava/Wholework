package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Utube {
	
	@Test()
	public void start()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement w1=driver.findElement(By.xpath("//input[@id='search\']"));
		w1.sendKeys("songs");
		w1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='contents']/ytd-video-renderer[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		//driver.findElement(By.id("expand")).click();
		//System.out.println(driver.findElement(By.id("description-inline-expander")).getText());
		//System.out.println(driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Hindi New Song 2023💖💚Latest Bollywood Songs💖💚Arijit Aingh,Jubin Nautiyal,Neha Kakkar,Atif Aslam💛💝 by Hindi Hits Songs 87,282 views']")).getText());
		//Actions ac=new Actions(driver);
	//	WebElement w11=driver.findElement(By.xpath("//h3[@title=\"Haal Munde Nu Official Video\"]"));
	//	ac.click(w11).perform();
		
		driver.findElement(By.xpath("//a[@class=\"ytp-next-button ytp-button\"]")).click();
		System.out.println("Successfully moved");
		driver.findElement(By.xpath("//button[@title='Mute (m)\']")).click();
		System.out.println("Successfully muted");
		driver.findElement(By.xpath("//button[@title='Full screen (f)\']")).click();
		System.out.println("Full screen viewed");
	}
	
	

}
