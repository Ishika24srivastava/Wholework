package Bootcamp.Facebook003;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PCKA {
	public static void main(String []args)
	{
		
	// Initializing browser driver
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		//Driver object
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver drive=new ChromeDriver(chromeOptions);
		drive.get("https://www.amazon.com");
		//drive.findElement(By.xpath(//*[@id="glow-ingress-line2"]));
		//drive.findElement(By.CssSelector("in"))
		
		
	}

}
