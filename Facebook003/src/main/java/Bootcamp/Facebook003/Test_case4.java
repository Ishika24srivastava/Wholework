package Bootcamp.Facebook003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;


public class Test_case4 {
	
		
		public static void main(String []args) throws InterruptedException
			{
				
				// Initializing browser driver
				System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
				//Driver object
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
				
				WebDriver driver=new ChromeDriver(chromeOptions);
			
				//URL login
				driver.get("https://www.amazon.in");
				//. Maximize or set size of browser window
				driver.manage().window().maximize();
				//header count
				WebElement header= driver.findElement(By.id("navbar-main"));
				List<WebElement> links = header.findElements(By.tagName("a"));
				int count=links.size();
			      System.out.println("The count of header is " +count );
			      //Footer count
			      WebElement footerlink= driver.findElement(By.id("navFooter"));
			      List<WebElement> link=footerlink.findElements(By.tagName("a"));
			      int fcount= link.size();
			      System.out.println("The count of footer  is " +fcount);
			     Thread.sleep(300);
			     driver.close();
			      
			}
}
