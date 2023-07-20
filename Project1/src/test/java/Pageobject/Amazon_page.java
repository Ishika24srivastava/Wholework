package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Amazon_base;

public class Amazon_page  extends Amazon_base{
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
	
	@FindBy(xpath="//a[@data-csa-c-slot-id=\"nav_cs_6\"]")
	WebElement electronics;
	
	@FindBy(xpath="//span[text()='Accessories']")
	WebElement accessories;
	
	@FindBy(xpath="//*[@id='anonCarousel1']/ol/li[1]/div/div/a/span/span[2]")
	WebElement item2;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add1;
	
	@FindBy(xpath="//span[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']")
	WebElement cartm;
	
	
	@FindBy(xpath="//span[@data-csa-c-slot-id='desktop-ptc-button-slot-id']")
	WebElement proceed;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchbox;
	
	
	
	@FindBy(xpath="//*[@id=\"icp-save-button\"]/span/input")
	WebElement cl;
	
	@FindBy(xpath="//a[@data-csa-c-content-id='nav_avod_desktop_topnav']")
	WebElement mini;
	
	@FindBy(xpath="//h1[@data-testid='appnavbar_menuitem_webseries']")
	WebElement Webs;
	
	
	
	public Amazon_page()
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
	
	public  WebElement  Search()
	{
		return search;
	}
	
	public void Elect()
	{
		electronics.click();
	}
	
	public WebElement  Acc()
	{
		return accessories;
	}
	
	public WebElement Mobileacc()
	{
		return  item2;
	}
	
	public WebElement blue()
	{
		return add1;
	}
	
	public WebElement cart1()
	{
		return cartm;
	}
	
	public WebElement quan()
	{
		return proceed;
	}
	
	public WebElement Searchbox()
	{
		return searchbox;
	}
	public WebElement lang()
	{
		return cl;
	}
	
	public WebElement Minitv()
	{
		return mini;
	}
	
	public WebElement Series()
	{
		return Webs;
	}

	
}

