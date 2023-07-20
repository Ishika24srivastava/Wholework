package POM_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
	public static void main(String[]args) {
	WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame("mce_0_ifr");
		System.out.println("frame is viewed");
		System.out.println(driver.findElement(By.xpath("//body[@data-id='mce_0\']")).getText());
		driver.switchTo().defaultContent();
		
	
	}
}
