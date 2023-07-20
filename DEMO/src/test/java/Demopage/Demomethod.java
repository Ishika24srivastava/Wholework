package Demopage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demobase.Demoamazon_base;

public class Demomethod  extends Demoamazon_base{

	@FindBy(xpath="//a[@title='MEN']")
	WebElement men;
	
	@FindBy(xpath="//a[@title='WOMEN']")
	WebElement women;
	
	@FindBy(xpath="//a[@title='KIDS']")
	WebElement kids;
	
	@FindBy(xpath="//a[@title='INDIE']")
	WebElement indie;
	
	public Demomethod()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Men()
	{
		return men;
	}
	
	public WebElement Women()
	{
		return women;
	}
	
	public WebElement Kids()
	{
		return kids;
	}
	
	public WebElement Indie()
	{
		return indie;
	}
	
}
