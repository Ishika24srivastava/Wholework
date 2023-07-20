package Bootcamp.Facebook003;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class ja1 {
	public static void main(String[]args)
	{
		System.setProperty("web.chrome.driver", "D:\\JAR\\chromedriver_win32");
		
		ChromeOptions chromeoption=new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins-","remove-certocation-errors");
		WebDriver drive=new ChromeDriver(chromeoption);
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drive.manage().window().maximize();
		

}
}
