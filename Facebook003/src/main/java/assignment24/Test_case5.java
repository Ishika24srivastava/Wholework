package assignment24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_case5 {
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
			// Title of a page and validate
				String s=driver.getTitle();
				String a=s;
				System.out.println(s);
				if(a.contains("Online Shopping"))
				{
					System.out.println("Title is validate");
					
				}
				else
				{
					System.out.println("Title is not verified");
				}
			// Current URL
				String S=driver.getCurrentUrl();
				String B=S;
				if(B.equalsIgnoreCase(S))
				{
					System.out.println("Current url is validate");
				}
				else
				{
					System.out.println("Current url is  not validate");
				}
				// Page source
				//String p=driver.getPageSource();
				//System.out.println("The page source is "+p);
				//
				driver.close();
}
}
