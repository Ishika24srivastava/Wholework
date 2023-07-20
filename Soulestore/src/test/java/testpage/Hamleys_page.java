package testpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.Hamleys_base;

public class Hamleys_page  extends Hamleys_base{
	
	
	public Hamleys_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//img[@alt='logo'])[1]")
	WebElement Logo;
	
	@FindBy(xpath="//a[text()='Deals & Promotions']")
	WebElement Deals_promotion;
	
	@FindBy(xpath="//a[text()='Category']")
	WebElement Category;
	
	@FindBy(xpath="//a[text()='Age']")
	WebElement Age;
	
	@FindBy(xpath="//a[text()='Brand']")
	WebElement Brand;
	
	@FindBy(xpath="//a[text()='Characters']")
	WebElement Charcaters;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement Search;
	
	public void Logo()
	{
		boolean status=Logo.isDisplayed();
		System.out.println("The logo is present at the top  left site of the application = "+status);
		Assert.assertEquals(status,true);
	}
	
	public void Deals_promotion() throws InterruptedException
	{
		boolean status=Deals_promotion.isDisplayed();
		System.out.println("The Deals and promotion  option is available at the home page of the application = "+status);
		Deals_promotion.click();
		Thread.sleep(1000);
		Assert.assertEquals(status,true);
	}
	
	public void Category() throws InterruptedException
	{
		boolean status=Category.isDisplayed();
		System.out.println("The Category option is available at the home page of the application = "+status);
		Category.click();
		Thread.sleep(1000);
		Assert.assertEquals(status,true);
	}

	public void Age() throws InterruptedException
	{
		boolean status=Age.isDisplayed();
		System.out.println("The Age option is available at the home page of the application = "+status);
		Age.click();
		Thread.sleep(1000);
		Assert.assertEquals(status,true);
	}
	
	public void Brand() throws InterruptedException
	{
		boolean status=Brand.isDisplayed();
		System.out.println("The Age option is available at the home page of the application = "+status);
		Brand.click();
		Thread.sleep(1000);
		Assert.assertEquals(status,true);
	}
	
	public void Charcaters() throws InterruptedException
	{
		boolean status=Charcaters.isDisplayed();
		System.out.println("The Age option is available at the home page of the application = "+status);
		Charcaters.click();
		Thread.sleep(1000);
		Assert.assertEquals(status,true);
	}
	
	public void Search() throws InterruptedException
	{
		Search.sendKeys("toy");
		Thread.sleep(1000);
		Search.sendKeys(Keys.ENTER);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
