package Test_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_base.Justdial_base;

public class Justdial_page extends Justdial_base {
	
	@FindBy(xpath="//img[@alt='Justdial Logo']")
	WebElement Logo;
	
	
	@FindBy(xpath="//input[@placeholder='Select Location']")
	WebElement Location;
	
	@FindBy(xpath="(//a[@class='location_dropanchor '])[1]")
	WebElement Detect_Location;
	
	@FindBy(xpath="//div[text()='English']")
	WebElement English;
	
	@FindBy(xpath="//div[text()='Restaurants']")
	WebElement Resturants;
	
	@FindBy(xpath="//div[text()='Hotels']")
	WebElement Hotels;
	
	@FindBy(xpath="//div[text()='Real Estate']")
	WebElement Realestate;
	
	@FindBy(xpath="//div[text()='Home Decor']")
	WebElement Homedecor;
	
	@FindBy(xpath="//div[text()='Education']")
	WebElement Education;
	
	@FindBy(xpath="//div[text()='GYM']")
	WebElement Gym;
	
	@FindBy(xpath="//div[text()='Courier Service']")
	WebElement Courierservice;
	
	@FindBy(xpath="//button[@id='popular_categories']")
	WebElement Popularcategories;
	
	@FindBy(xpath="//div[@class='jsx-556e8b2d40044d62 sidemenu_searchbox active']")
	WebElement Popularcategoriessearch;
	
	@FindBy(xpath="//div[text()='Body Massage Centers']")
	WebElement Bodymassage;
	
	
	public Justdial_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Logo()
	{
		boolean display=Logo.isDisplayed();
		System.out.println("The logo is displayed= "+display);
		Assert.assertEquals(display,true);
	}
	
	public void Location() throws InterruptedException
	{
		Location.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	public void Detect_Location() throws InterruptedException
	{
		Detect_Location.click();
		Thread.sleep(10000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	public void Hotels() throws InterruptedException
	{
		Hotels.click();
		Thread.sleep(10000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Logo.click();
		
	}
	
	public void Realestate() throws InterruptedException
	{
		//Realestate.click();
		boolean realestate=Realestate.isDisplayed();
		System.out.println("The real state is visible at the home page= "+realestate);
		Thread.sleep(10000);
		Assert.assertEquals(realestate,true);
		
	}
	
	public void Homedecor() throws InterruptedException
	{
		boolean homedecor=Homedecor.isDisplayed();
		System.out.println("The Home decor is visible at the home page= "+homedecor);
		Thread.sleep(10000);
		Assert.assertEquals(homedecor,true);
		
	}
	
	public void Education() throws InterruptedException
	{
		boolean Educatio=Education.isDisplayed();
		System.out.println("The Education is visible at the home page= "+Educatio);
		Thread.sleep(10000);
		Assert.assertEquals(Educatio,true);
	}
	
	public void  Gym() throws InterruptedException
	{
		boolean gym=Gym.isDisplayed();
		System.out.println("The gym is visible at the home page= "+gym);
		Thread.sleep(10000);
		Assert.assertEquals(gym,true);
	}
	
	public void Courierservice() throws InterruptedException
	{
		boolean Courierservic=Courierservice.isDisplayed();
		System.out.println("The Courierservice is visible at the home page= "+Courierservic);
		Thread.sleep(10000);
		Assert.assertEquals(Courierservic,true);
	}
	
	public void Popularcategories() throws InterruptedException
	{
		Popularcategories.click();
		Thread.sleep(10000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	public void Popularcategoriessearch() throws InterruptedException
	{
		Popularcategories.sendKeys("Body massage");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
	}

	public void Bodymassage() throws InterruptedException
	{
		Bodymassage.click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Logo.click();
	}

}
