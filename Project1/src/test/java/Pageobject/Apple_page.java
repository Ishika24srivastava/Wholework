package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Apple_base;

public class Apple_page  extends  Apple_base  {
	
	@FindBy(xpath="//a[@data-analytics-title='apple home']")
	WebElement logo;
	
	
	@FindBy(xpath="//a[@data-globalnav-item-name='store']")
	WebElement  store;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='mac']")
	WebElement mac;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='ipad']")
	WebElement ipad;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='iphone']")
	WebElement iphones;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='watch']")
	WebElement watch;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='airpods']")
	WebElement airpods;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='tv-home']")
	WebElement tv;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='entertainment']")
	WebElement entertainment;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='accessories']")
	WebElement accessories;
	
	@FindBy(xpath="//a[@data-globalnav-item-name='support']")
	WebElement support;
	
	@FindBy(xpath="//a[@id='globalnav-menubutton-link-search']")
	WebElement search;
	
	@FindBy(xpath="//input[@placeholder='Search apple.com/in']")
	WebElement search_item;
	
	@FindBy(xpath="//a[@class='unit-link'][@data-analytics-region='learn more'][@href='/in/iphone-14-pro/']")
	WebElement text;
	
	@FindBy(xpath="//div[@data-unit-id='apple-watch-series-8']")
	WebElement banner2;
	
	@FindBy(xpath="//a[@data-analytics-title='Learn more about WWDC23']")
	WebElement banner4;
	
	@FindBy(xpath="//a[@data-analytics-title='Learn more about iPad']")
	WebElement banner5;
	
	@FindBy(xpath="//a[@data-analytics-title='Learn more about MacBook Pro 14 and 16 inch']")
	WebElement banner6;
	
	@FindBy(xpath="//a[@data-analytics-title='Learn more about Apple Watch Ultra']")
	WebElement banner7;
	
	@FindBy(xpath="//a[@data-analytics-title='Learn more about Homepod']")
	WebElement banner8;
	
	@FindBy(xpath="//a[@data-ac-gallery-trigger='tv-plus-gallery-item-1']")
	WebElement scroll1;
	
	@FindBy(xpath="//a[@data-ac-gallery-trigger='tv-plus-gallery-item-4']")
	WebElement scroll4;
	
	@FindBy(xpath="//a[@data-ac-gallery-trigger='tv-plus-gallery-item-6']")
	WebElement scroll6;
	
	@FindBy(xpath="//a[@data-ac-gallery-trigger='tv-plus-gallery-item-12']")
	WebElement scroll12;
	
	
	@FindBy(xpath="//a[@data-globalnav-item-name='bag']")
	WebElement bag;
	
	@FindBy(xpath="//a[@data-autom='sign-in']")
	WebElement signin;
	
	@FindBy(xpath="//a[@id='create-link']")
	WebElement create;
	
	@FindBy(xpath="//a[@id='tv-plus-gallery-item-2-trigger']")
	WebElement Image;
	
	@FindBy(xpath="//div[@aria-label='Stream now, Drops of God']")
	WebElement Stream;
	
	@FindBy(xpath="//input[@name='query']")
	WebElement Stream_search;
	
	@FindBy(xpath="//button[text()='Play Free Episode']")
	WebElement Play;
	
	@FindBy(xpath="//li/button[text()='Try It Free']")
	WebElement Try;
	
	@FindBy(xpath="//span[text()='Add to Up Next']")
	WebElement Add;
	
	@FindBy(xpath="//input[@id=\"input-1682576708976-0\"]")
	WebElement first_name;
	
	@FindBy(xpath="//span[text()='last name']")
	WebElement last_name;
	
	@FindBy(xpath="//span[text()='date of birth']")
	WebElement date_birth;
	
	@FindBy(xpath="//span[text()='//span[text()='name@example.com']")
	WebElement email;
	
	
	@FindBy(xpath="//span[text()='password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='confirm password']")
	WebElement confirm_password;
	
	@FindBy(xpath="//span[text()='phone number']")
	WebElement phone;
	
	@FindBy(xpath="//li[@role='listitem']/a[text()='Store']")
	WebElement store1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='Mac']")
	WebElement mac1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='iPad']")
	WebElement ipad1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='iPhone']")
	WebElement iphone1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='Watch']")
	WebElement watch1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='AirPods']")
	WebElement airpods1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='TV & Home']")
	WebElement tv1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='AirTag']")
	WebElement airtag1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='Accessories']")
	WebElement accessories1;
	
	@FindBy(xpath="//li[@role=\"listitem\"]/a[text()='Gift Cards']")
	WebElement gift1;
	
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='wallet']")
	WebElement wallet;
	
	@FindBy(xpath="//a[@data-analytics-title='manage your apple id']")
	WebElement Manage;
	
	@FindBy(xpath="//a[@data-analytics-title='apple store account']")
	WebElement Apple;
	
	@FindBy(xpath="//a[@data-analytics-title='icloud.com']")
	WebElement icloud;
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='apple one']")
	WebElement Apple_one;
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='apple tv plus']")
	WebElement apple_tv;
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='apple music']")
	WebElement apple_music;
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='apple arcade']")
	WebElement arcade;
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='apple podcasts']")
	WebElement podcasts;
	
	@FindBy(xpath="//li[@role='listitem']/a[@data-analytics-title='app store']")
	WebElement appstore;
	
	@FindBy(xpath="//img[@alt='Fleur Geffrier']")
	WebElement Fleur;
	
	@FindBy(xpath="//a[@data-analytics-title='macbook pro 14 and 16']")
	WebElement MacBook_pro;
	
	@FindBy(xpath="//a[@data-analytics-title='product index']")
	WebElement Pro;
	
	@FindBy(xpath="//span[text()='Watch the announcement']")
	WebElement Watch_announcement;
	
	@FindBy(xpath="//div[@class='button-wrapper']/button[@value='Pause']")
	WebElement Pause;
	
	@FindBy(xpath="//div[@class='main-controls-item controls-volume']")
	WebElement Volume;
	
	@FindBy(xpath="//button[@aria-label='Closed Captions']")
	WebElement Sub_title;
	
	@FindBy(xpath="//li[text()='English']")
	WebElement Sub_titleL;
	
	@FindBy(xpath="//button[@aria-label='Full Screen']")
	WebElement Full_screen;
	
	@FindBy(xpath="//button[@value='Exit Full Screen']")
	WebElement Exit_screen;
	
	@FindBy(xpath="//button[@data-analytics-click='prop3:go inside m2 pro and m2 max']")
	WebElement Goinside_M2pro;
	
	
	public Apple_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Logo()
	{
		return logo;
		
	}
	public WebElement Store1()
	{
		return store1;
		
	}
	
	public WebElement Store()
	{
		return store;
		
	}

	public WebElement Mac()
	{
		return mac;
		
	}

	public WebElement iPad()
	{
		return ipad;
		
	}

	public WebElement iPhone()
	{
		return iphones;
		
	}

	public WebElement Watch()
	{
		return watch;
		
	}

	public WebElement AirPods()
	{
		return airpods;
		
	}

	public WebElement TV_Home()
	{
		return tv;
		
	}

	public WebElement Entertainment()
	{
		return entertainment;
		
	}

	public WebElement Accessories()
	{
		return accessories;
		
	}

	public WebElement Support()
	{
		return support;
		
	}
	
	public WebElement Search()
	{
		return search;
		
	}
	public WebElement Search_item()
	{
		return search_item;
		
	}
	public WebElement Pro_beyond()
	{
		return text;
		
	}
	public WebElement Go_inside()
	{
		return Goinside_M2pro;
		
	}
	
	public WebElement Banner2()
	{
		return banner2;
	}
	
	public WebElement Banner4()
	{
		return banner4;
	}
	public WebElement Banner5()
	{
		return banner5;
	}
	public WebElement Banner6()
	{
		return banner6;
	}
	public WebElement Banner7()
	{
		return banner7;
	}
	public WebElement Banner8()
	{
		return banner8;
	}
	public WebElement Scroll1()
	{
		return scroll1;
	}
	public WebElement Scroll4()
	{
		return scroll4;
	}
	public WebElement Scroll6()
	{
		return scroll6;
	}
	public WebElement Scroll12()
	{
		return scroll12;
	}
	public WebElement Bag()
	{
		return bag;
	}
	public WebElement Sign_in()
	{
		return signin;
	}
	public WebElement Create()
	{
		return create;
	}
	public WebElement Image()
	{
		return Image;
	}
	public WebElement Stream()
	{
		return Stream;
	}
	public WebElement Stream_search()
	{
		return Stream_search;
	}
	public WebElement Play()
	{
		return Play;
	}
	public WebElement Try()
	{
		return Try;
	}
	public WebElement Add()
	{
		return Add;
	}
	public WebElement First_name()
	{
		return first_name;
	}
	public WebElement Last_name()
	{
		return last_name;
	}
	public WebElement dob()
	{
		return date_birth;
	}
	public WebElement Email()
	{
		return email;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement Confirm_pass()
	{
		return confirm_password;
	}
	public WebElement Phone()
	{
		return phone;
	}
	public WebElement Mac1()
	{
		return mac1;
		
	}
	public WebElement Ipad1()
	{
		return ipad1;
		
	}
	public WebElement Iphone1()
	{
		return iphone1;
		
	}
	public WebElement Watch1()
	{
		return watch1;
		
	}
	public WebElement Airpods1()
	{
		return airpods1;
		
	}
	public WebElement Tv1()
	{
		return tv1;
		
	}
	public WebElement Airtag1()
	{
		return airtag1;
		
	}
	
	public WebElement Accessories1()
	{
		return accessories1;
		
	}
	public WebElement Gift_card1()
	{
		return gift1;
		
	}
	public WebElement Wallet()
	{
		return wallet;
		
	}
	public WebElement Manage()
	{
		return Manage;
		
	}
	public WebElement Applestore()
	{
		return Apple;
		
	}
	public WebElement Icloud()
	{
		return icloud;
		
	}
	public WebElement Apple_one()
	{
		return Apple_one;
		
	}
	public WebElement Apple_tv()
	{
		return apple_tv;
		
	}
	public WebElement Apple_music()
	{
		return apple_music;
		
	}
	public WebElement Apple_arcade()
	{
		return arcade;
		
	}
	public WebElement Apple_podcasts()
	{
		return podcasts;
		
	}
	public WebElement App_store()
	{
		return appstore;
		
	}
	public WebElement Mac_pro()
	{
		return MacBook_pro;
		
	}
	public WebElement Pro()
	{
		return Pro;
		
	}
	public WebElement Watch_announce()
	{
		return Watch_announcement;
		
	}
	public WebElement Pause()
	{
		return Pause;
		
	}
	public WebElement Volume()
	{
		return store;
		
	}
	public WebElement Subtitle()
	{
		return Sub_title;
		
	}
	public WebElement Subtitle_langauage()
	{
		return Sub_titleL;
		
	}
	public WebElement FullScreen()
	{
		return Full_screen;
		
	}
	public WebElement ExitScreen()
	{
		return Exit_screen;
		
	}
	
	
	
	
}
