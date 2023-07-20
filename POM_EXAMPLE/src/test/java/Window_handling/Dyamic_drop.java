package Window_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Dyamic_drop {
	
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement frame=driver.findElement(By.xpath("//h3[text()='Drag and Drop']"));
		Actions ac=new Actions(driver);
		
		WebElement from=driver.findElement(By.xpath("//div[@id='column-a\']"));
		WebElement to=driver.findElement(By.xpath("//div[@id=\'column-b\']"));
		
		ac.dragAndDrop(from, to).build().perform();
		}
}
