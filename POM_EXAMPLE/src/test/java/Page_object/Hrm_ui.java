package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.Testbase_orange;

public class Hrm_ui extends Testbase_orange
{

	@FindBy(xpath="//a[@class='navbar-brand nav-logo']")
	WebElement logo;
	
	@FindBy(xpath="//a[@class='nav-link-hed']")
	WebElement platform;
	
	@FindBy(xpath="//a[text()='Why OrangeHRM']")
	WebElement orangehrm;
	
	@FindBy(xpath="//a[text()='Resources']")
	WebElement resouces;
	
	@FindBy(xpath="//input[@id='Form_getForm_Email']")
	WebElement email;
	
	public Hrm_ui()
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement logo()
	{
		return logo;
	}
	
	public void   platform_cl()
	{
		platform.click();
	}
	
	
	public void resources()
	{
		 resouces.click();
	}
	public  void organs()
	{
		orangehrm.click();
	}
	
	public WebElement email()
	{
		return email;
	}
}
