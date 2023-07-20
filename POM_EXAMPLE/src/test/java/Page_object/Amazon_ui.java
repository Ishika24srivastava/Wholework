package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.Amazon_base;

public class Amazon_ui  extends Amazon_base
{
	
	
	@FindBy(css="a#nav-logo-sprites")
	WebElement logo;
	
	
	
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_2']")
	WebElement BestSellers;
	
	
	@FindBy(xpath="//div[@class=\'p13n-sc-truncate-desktop-type2  p13n-sc-truncated\']")
	WebElement bag;
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement cart;
	@FindBy(xpath="//a[@data-csa-c-content-id=\"nav_cs_mobiles\"]")
	WebElement bag1;
	
	@FindBy(xpath="//div[@id='nav-cart-text-container']")
	WebElement add1;
	
//	@FindBy(xpath="//span[text()='1' and @class='a-dropdown-prompt']")
	//WebElement price;
	
	
	public Amazon_ui()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void Best()
	{
		BestSellers.click();
	}
	
	public void Bag()
	{
		bag.click();
	}
	
	public WebElement Cart()
	{
		return cart;
	}
	
	public  void  Cart_Bag()
	{
		bag1.click();
	}
	
	//public WebElement add()
	//{
		//driver.
	//}
	
	
}
