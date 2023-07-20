package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Child  extends Super{

	@Test
	public void Login1() 
	{

		//input to the email and password with IN valid credentials
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//input[@id='email']"));
		//w1.sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input#pass"));
		//button
		driver.findElement(By.cssSelector("button#loginbutton")).	click();;
		System.out.println("child executed");
	
	}


}
