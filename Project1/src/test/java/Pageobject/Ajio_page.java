package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Aji_base;

public class Ajio_page extends Aji_base{
	@FindBy(xpath="//*[@id='appContainer']/div[1]/div/header/div[2]/a/img")
	WebElement logo;
	
	@FindBy(xpath="//div[@data-key='0']")
	WebElement image;
	
	@FindBy(xpath="//input[@placeholder='Search AJIO']")
	WebElement Search_box;
	
	@FindBy(xpath="//span[@class='ic-search']")
	WebElement Search_button;
	
	@FindBy(xpath="//h1[text()='Vacum Lace-Up Running Shoes\']")
	WebElement Shoes;
	
	@FindBy(xpath="//*[@id='appContainer']/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[5]/div")
	WebElement Size;
	
	@FindBy(xpath="//a[@title='MEN']")
	WebElement men;
	
	@FindBy(xpath="//a[@title='WOMEN']")
	WebElement women;
	
	@FindBy(xpath="//a[@title='KIDS']")
	WebElement kids;
	
	@FindBy(xpath="//a[@title='INDIE']")
	WebElement indie;
	
	@FindBy(xpath="//a[@title='HOME AND KITCHEN']")
	WebElement home;
	
	@FindBy(xpath="//span[text()='Sign In / Join AJIO']")
	WebElement sign;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continu;
	
	@FindBy(xpath="//input[@placeholder='Enter OTP']")
	WebElement otp;
	
	@FindBy(xpath="//input[@value='START SHOPPING']")
	WebElement start;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signout;
	
	@FindBy(xpath="//li[@class='visit-ajio']")
	WebElement Visit;
	
	@FindBy(xpath="//input[@placeholder='Search Luxe Store']")
	WebElement  Search_visit;
	
	@FindBy(xpath="//span[@class='ic-search']")
	WebElement Search_butt;
	
	@FindBy(xpath="//a[@title='MEN']")
	WebElement men_v;
	
	@FindBy(xpath="//a[@title='WOMEN']")
	WebElement women_v;
	
	@FindBy(xpath="//a[@title='HOME']")
	WebElement home_v;
	
	@FindBy(xpath="//a[@title='BEAUTY']")
	WebElement beauty_v;
	
	@FindBy(xpath="//a[@title='BRANDS']")
	WebElement brand_v;
	
	@FindBy(xpath="//div[@id='appContainer']/div/div/header/div/ul/li[4]/a")
	WebElement customer;
	
	@FindBy(xpath="//span[text()='Delivered']")
	WebElement delivered;
	
	@FindBy(xpath="//div[text()='Bell Sleeves Top with Tassels']")
	WebElement top;
	
	@FindBy(xpath="//img[@alt=\"Bell Sleeves Top with Tassels\"]")
	WebElement topc;
	
	@FindBy(xpath="//div[@class='prod-sp']")
	WebElement tt;
	
	@FindBy(xpath="//div[@class='btn-gray']")
	WebElement save;
	
	@FindBy(xpath="//div[text()='Floral Print Top with 3/4th Sleeves ']")
	WebElement news;
	
	@FindBy(xpath="//span[text()='M'] ")
	WebElement size;
	
	@FindBy(xpath="//span[text()='ADD TO BAG'] ")
	WebElement add;
	
	@FindBy(xpath="//h3[text()='Product Details']")
	WebElement details;
	
	@FindBy(xpath="//div/h1[text()='Round-Neck Top with Button Fastening']")
	WebElement top1;
	
	@FindBy(xpath="//span[text()='M']")
	WebElement size1;
	
	@FindBy(xpath="//span[text()='ADD TO BAG']")
	WebElement add1;
	
	@FindBy(xpath="//div/a[@href='/cart']")
	WebElement cart_view;
	
	
	@FindBy(xpath="//span[text()='Bag total']")
	WebElement bag_total;
	
	@FindBy(xpath="//span[text()='Bag discount']")
	WebElement bag_discount;
	
	@FindBy(xpath="//div//button[text()='Proceed to shipping']")
	WebElement proceed;
	
	public Ajio_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Logo()
	{
		return logo;
	}
	
	public WebElement Image()
	{
		return image;
	}
	public WebElement SearchBox()
	{
		return Search_box;
	}
	
	public WebElement SearchButton()
	{
		return Search_button;
	}
	
	public WebElement Shoes()
	{
		return  Shoes;
	}
	
	
	public WebElement Cart()
	{
		return Size;
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
	
	public WebElement Home()
	{
		return home;
	}
	
	public WebElement Sign()
	{
		return sign;
	}
	
	
	public WebElement Mobile()
	{
		return mobile;
	}
	
	public WebElement Con()
	{
		return continu;
	}
	public WebElement Otp()
	{
		return otp;
	}
	
	public WebElement Start()
	{
		return start;
	}
	
	public WebElement SignOut()
	{
		return signout;
	}
	
	public WebElement Save()
	{
		return save;
	}
	
	public WebElement Visitaji()
	{
		return Visit;
	}
	
	public WebElement Search()
	{
		return  Search_visit;
	}
	
	public WebElement Search_bb() {
		return Search_butt;
	}
	public WebElement Men_v()
	{
		return men_v;
	}
	public WebElement Women_v()
	{
		return women_v;
	}
	public WebElement Home_v()
	{
		return home_v;
	}
	public WebElement Beauty_v()
	{
		return beauty_v;
	}
	public WebElement Brands_v()
	{
		return brand_v;
	}
	public WebElement Cusomer() {
		return customer;
	}
	
	public WebElement Deli()
	{
		return delivered;
	}
	
	public WebElement Tt()
	{
		return top;
	}
	
	public WebElement ss()
	{
		return topc;
	}
	
	public WebElement text()
	{
		return tt;
	}
	
	public WebElement Top()
	{
		return news;
	}
	
	public WebElement Size()
	{
		return size;
		
	}
	public WebElement Add()
	{
		return add;
	}
	public WebElement Details()
	{
		return details;
	}
	public WebElement top1()
	{
		return top1;
	}
	public WebElement size1()
	{
		return size1;
	}
	public WebElement Add1()
	{
		return add1;
	}
	public WebElement CartView()
	{
		return cart_view;
	}
	
	public WebElement cartOrder()
	{
		return bag_total;
	}
	public WebElement carttotal() {
		return bag_discount;
	}
	
	public WebElement Procced()
	{
		return proceed;
	}
}
