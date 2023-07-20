package assignment24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testcase_4 {
	public static void main(String[]args) {
		 //Initializing browser driver
				System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		//Driver object
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
				WebDriver driver=new ChromeDriver(chromeOptions);

		//URL login
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				String p=driver.getPageSource();
				System.out.println("The page source is "+p);
				driver.close();
}
}
