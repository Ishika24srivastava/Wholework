package Window_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class Static_dropdown {
	
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//static drop down
		Select select_obj=new Select(driver.findElement(By.xpath("//select[@id='dropdown\']")));
		//select_obj.selectByIndex(2);
		select_obj.selectByVisibleText("Option 1");
		
	}

}
