package assignment24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_case2 {
		public static void main(String[]args) {
	 //Initializing browser driver
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	//Driver object
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	
			WebDriver driver=new ChromeDriver(chromeOptions);

	//URL login
			driver.get("https://www.flipkart.com/");
	//. Maximize or set size of browser window
			driver.manage().window().maximize();
	//Title of the page
			System.out.println(driver.getTitle());
			driver.close();
}
}
