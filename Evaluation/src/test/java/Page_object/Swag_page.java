package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_base.Test1_base;

public class Swag_page  extends Test1_base{
	
	@FindBy(xpath="//div[@class='login_logo']")
	WebElement logo;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement list;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	
	
	public Swag_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement lo()
	{
		return logo;
	}
	
	public WebElement enter_user()
	{
		return username;
	}
	
	public WebElement enter_password()
	{
		return password;
	}
	
	public void click()
	{
		login.click();
	}
	
	public void menu()
	{
		list.click();
	}
	
	public void log()
	{
		logout.click();
	}
	

}
