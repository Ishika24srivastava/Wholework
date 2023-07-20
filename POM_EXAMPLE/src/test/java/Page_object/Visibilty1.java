package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.Testbase1;

public   class Visibilty1 extends Testbase1 {

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	WebElement Forgotpassword;
	
	@FindBy(xpath="//img[@alt='company-branding\\']")
	By logo;
	
	
	public Visibilty1()
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement user_name()
	{
		return uname;
	}
	
	public WebElement pass_word()
	{
		return password;
	}
	
	public WebElement Sub_mit()
	{
		return submit;
	}
	
	public void For_got()
	{
		Forgotpassword.click();
	}
	public  boolean logo()
	{
		boolean visible=driver.findElement(logo).isDisplayed();
		return visible;
	}
}
