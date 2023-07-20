package Bootcamp.Facebook003;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Case1 {

	public static void main(String []args) throws InterruptedException
	{
		
	// Initializing browser driver
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		//Driver object
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		//Maximize or set size of browser
		
		//page title and print it
		String s=driver.getTitle();
		System.out.println(s);
		String ext=s;
		//link for amazon pay
		WebElement w1=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
		w1.click();
		Thread.sleep(100);
		//Navigate to home page
		driver.navigate().back();
		Thread.sleep(100);
		// string validation
		if(s.equalsIgnoreCase(ext))
			System.out.println("Title matched");
		else
			System.out.println("Title didn't matched");
		driver.close();
		driver.quit();
		
	}

}



