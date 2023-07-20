package Test_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_base.demobank_base;

public class demobank_page extends demobank_base{
	
	@FindBy(xpath="(//img[@alt='Bank of India brand logo'])[2]")
	WebElement logo;
	
	@FindBy(xpath="//span[text()='Internet Banking - View Demo']")
	WebElement viewdemo;
	
	@FindBy(xpath="(//a[text()='           About Us'])[1]")
	WebElement Aboutus;
	
	@FindBy(xpath="//h1[@id='banner-long-title']")
	WebElement title;
	
	@FindBy(xpath="//h2[text()='Internet Banking - View Demo - INTERNET BANKING']")
	WebElement title_banking;
	
	@FindBy(xpath="//a[text()='Instant Regeneration of transaction password']")
	WebElement transaction;
	
	@FindBy(xpath="//a[text()='Retail Demo']")
	WebElement retail_demo;
	
	@FindBy(xpath="//a[text()='Corporate Demo']")
	WebElement corporate_demo;
	
	@FindBy(xpath="//a[text()='Transaction Password regeneration for retail customers Demo']")
	WebElement transaction_password;
	
	@FindBy(xpath="//a[text()='Online Internet Banking Registration - for retail Banking Customers']")
	WebElement online_internet;
	
	@FindBy(xpath="(//a[text()=' BOI Web'])[1]")
	WebElement Boiweb;
	
	@FindBy(xpath="(//li[@class='list-inline-item tab-hide hidenformobile'])[1]")
	WebElement Corporatewebsite;
	
	@FindBy(xpath="//a[text()='	Forex Card Rate']")
	WebElement Forex;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li KEY SERVICES'])[2]")
	WebElement Key_services;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li LOAN SERVICES'])[2]")
	WebElement Loan_services;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li ONLINE SERVICES'])[2]")
	WebElement Online_services;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li PAYMENT SERVICES'])[2]")
	WebElement payment_services;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li Personal'])[2]")
	WebElement Personal;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li Business'])[2]")
	WebElement Business;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li Invest & Insure'])[2]")
	WebElement Invest;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li NRI'])[2]")
	WebElement NRI;
	
	@FindBy(xpath="(//li[@class='nav-item megamenu-li Agri'])[2]")
	WebElement Agri;
	
	@FindBy(xpath="(//li[@id='login-buttonTwo'])[2]")
	WebElement Internet_banking;
	
	@FindBy(xpath="(//span[@class='float-right'])[12]")
	WebElement Personal_login;
	
	@FindBy(xpath="(//button[text()='Agree'])[2]")
	WebElement Agree;
	
	@FindBy(xpath="(//h5[text()='Disclaimer'])[2]")
	WebElement Disclaimer;
	
	@FindBy(xpath="(//div[@class='modal-body'])[2]")
	WebElement Modalbody;
	
	
	
	public demobank_page()
	{
		PageFactory.initElements(driver, this);
	}

	public void Logo()
	{
		boolean status=logo.isDisplayed();
		System.out.println("The logo is visible at the top left of the site "+status);
		Assert.assertEquals(status,true);
	}
	
	public void View_demo() throws InterruptedException
	{
		viewdemo.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void Aboutus() throws InterruptedException
	{
		Aboutus.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://bankofindia.co.in/about-us");
	}
	
	public void Boiweb() throws InterruptedException
	{
		Boiweb.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://bankofindia.co.in/about-us#0");
	}
	
	public void Corporatewebsite() throws InterruptedException
	{
		Corporatewebsite.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://bankofindia.co.in/about-us");
		Aboutus.click();
	}
	
	public void Forex() throws InterruptedException
	{
		 Forex.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://bankofindia.co.in/forexcard-rate");
		
	}
	
	public void Key_services() throws InterruptedException
	{
		Key_services.click();
		Thread.sleep(1000);
		boolean status=Key_services.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void Loan_services() throws InterruptedException
	{
		Loan_services.click();
		Thread.sleep(1000);
		boolean status=Loan_services.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void Online_services() throws InterruptedException
	{
		Online_services.click();
		Thread.sleep(1000);
		boolean status=Online_services.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void payment_services() throws InterruptedException
	{
		payment_services.click();
		Thread.sleep(1000);
		boolean status=payment_services.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void Title()
	{
		boolean status=title.isDisplayed();
		System.out.println("The title dispalyed at the top ="+status);
		Assert.assertEquals(status,true);
	}
	
	public void Title_banking()
	{
		boolean status=title_banking.isDisplayed();
		System.out.println("The title dispalyed at the top ="+status);
		Assert.assertEquals(status,true);
	}
	
	public void Transaction() throws InterruptedException
	{
		boolean status=transaction.isDisplayed();
		System.out.println("The instant regenrations is visible  ="+status);
		transaction.click();
		Thread.sleep(5000);
		Assert.assertEquals(status,true);
	}
	
	public void Retail_demo() throws InterruptedException
	{
		boolean status=retail_demo.isDisplayed();
		System.out.println("The retail demo is visible  ="+status);
		retail_demo.click();
		Thread.sleep(5000);
		Assert.assertEquals(status,true);
	}
	
	public void corporate_demo() throws InterruptedException
	{
		boolean status=corporate_demo.isDisplayed();
		System.out.println("The retail demo is visible  ="+status);
		corporate_demo.click();
		Thread.sleep(5000);
		Assert.assertEquals(status,true);
	}
	
	public void Transaction_password() throws InterruptedException
	{
		boolean status=transaction_password.isDisplayed();
		System.out.println("The transaction_password is visible  ="+status);
		transaction_password.click();
		Thread.sleep(5000);
		Assert.assertEquals(status,true);
	}
	
	public void Online_internet() throws InterruptedException
	{
		boolean status=online_internet.isDisplayed();
		System.out.println("The online_internet is visible  ="+status);
		online_internet.click();
		Thread.sleep(3000);
		Assert.assertEquals(status,true);
	}
	
	public void Personal() throws InterruptedException
	{
		Personal.click();
		Thread.sleep(1000);
		boolean status=Personal.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	
	public void Business() throws InterruptedException
	{
		Business.click();
		Thread.sleep(1000);
		boolean status=Business.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void Invest() throws InterruptedException
	{
		Invest.click();
		Thread.sleep(1000);
		boolean status=Invest.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void NRI() throws InterruptedException
	{
		NRI.click();
		Thread.sleep(1000);
		boolean status=NRI.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void Agri() throws InterruptedException
	{
		Agri.click();
		Thread.sleep(1000);
		boolean status=Agri.isDisplayed();
		Assert.assertEquals(status,true);
	}
	
	public void Internet_banking() throws InterruptedException
	{
		Internet_banking.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://bankofindia.co.in/internet-banking-demo");
	}
	
	public void Personal_login() throws InterruptedException
	{
		Personal_login.click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://bankofindia.co.in/internet-banking-demo");
	}
	
	public void Disclaimer()
	{
		boolean status=Disclaimer.isDisplayed();
		System.out.println("The heading Disclaimer is pesent = "+status);
		Assert.assertEquals(status,true);
	}
	
	public void Modalbody() throws InterruptedException
	{
		boolean status=Modalbody.isDisplayed();
		System.out.println("The modal disclaimer body is present = "+status);
		String text=Modalbody.getText();
		Thread.sleep(1000);
		System.out.println("The disclaimer text= "+text);
		Assert.assertEquals(status,true);
	}
	
	public void Agree() throws InterruptedException
	{
		Agree.click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Internet Banking - View Demo - BOI");
	}
	
	
}
