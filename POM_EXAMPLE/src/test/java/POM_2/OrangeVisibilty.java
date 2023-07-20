package POM_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeVisibilty {
	 public WebDriver  driver;
	 
	 public OrangeVisibilty(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 //LOCATORS
	 
	 By logo_orange=By.xpath("//img[@alt='company-branding\']");
	 By username_text=By.xpath("//input[@name='username']");
	 By password_text=By.xpath("//input[@name='password']");
	 By login_button=By.xpath("//button[@type='submit']");
	 
	//Actions performed
	 
	 public void username(String name)
	 {
		 driver.findElement(username_text).sendKeys("Admin");
	 }
	 
	 public void  password(String password)
	 {
		 driver.findElement(password_text).sendKeys("admin123");
		 
	 }
	
	public void  button()
	{
		driver.findElement(login_button).click();
	}
	
	public  boolean logo()
	{
		boolean visible=driver.findElement(logo_orange).isDisplayed();
		return visible;
	}

}
