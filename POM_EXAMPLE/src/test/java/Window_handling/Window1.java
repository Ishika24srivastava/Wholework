package Window_handling;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window1 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//Extracting window handles
		Set<String> ids=driver.getWindowHandles();
		//System.out.println(ids);
		
		//Defining iterator
		Iterator<String>  it= ids.iterator();
		
		//By using for each loop
		for(String li:ids)
		
		{
			System.out.println(li);
		}
		//without using for each loop
		String parent_id=it.next();
		String Child_id=it.next();
		driver.switchTo().window(Child_id);
		System.out.println(driver.getTitle());
		
		}

}
