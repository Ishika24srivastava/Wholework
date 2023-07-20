package POM_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Upload {
	public static void main(String[]args)
	{
		
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_IN_PMax_2022-GDN---both----CPC-6372019543&utm_campaign=IN_Acq_SEM-Google-IP_IN_PMax_2022-GDN--&utm_medium=SEM&utm_source=Google-GDN-CPC&utm_term=SEM_&gclid=EAIaIQobChMI-oTBr-eP_gIVV6mWCh0k3g5YEAAYASAAEgIVBvD_BwE");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
	WebElement brwose=driver.findElement(By.xpath("//input[@type='file']"));
	brwose.sendKeys("C:\\Users\\isrivastava\\Documents\\week2\\DBASSIGNMENT4.pdf");
	System.out.println("file successgfully ");
	//driver.close();
	
	}
}
