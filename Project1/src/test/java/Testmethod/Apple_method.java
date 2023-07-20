package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Apple_page;
import Testbase.Apple_base;


public class Apple_method extends Apple_base {
	Apple_page apple;

	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 apple=new Apple_page();
		
	}
	
	
	@Test(priority=1)
	public void Logo()
	{
		boolean status=apple.Logo().isDisplayed();
		System.out.println("The logo is dispalyed= "+status);
		Assert.assertTrue(status);
		
	}
	@Test(priority=2)
	public void Text()
	{
		String text=driver.findElement(By.xpath("//span[@class='iphone-ti-ribbon-copy trade-in']")).getText();
		System.out.println("The text display on the home page= "+text);
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url,"https://www.apple.com/in/");
	}
	@Test(priority=3)
	public void Search() 
	{
		apple.Search().click();
		String title=driver.getCurrentUrl();
		System.out.println("The current url= "+title);
		Assert.assertEquals(title,"https://www.apple.com/in/");
	}
	@Test(priority=4)
	public void Search_item() throws InterruptedException
	{
		apple.Search_item().sendKeys("Apples store");;
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println("The current url= "+url);
		Assert.assertEquals(url,"https://www.apple.com/in/");
		
	}
	
	@Test(priority=5)
	public void Store()	
	{
		apple.Store().click();
		String title=driver.getTitle();
		System.out.println("The title will be= "+title);
		Assert.assertEquals(title,"Apple Store Online - Apple (IN)");
	}
	
	@Test(priority=6)
	public void Mac()
	{
		apple.Mac().click();
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url,"https://www.apple.com/in/mac/");
	}
	
	@Test(priority=7)
	public void Ipad()
	{
		apple.iPad().click();
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"iPad - Apple (IN)");
	}
	
	@Test(priority=8)
	public void Iphone()
	{
		apple.iPhone().click();
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"iPhone - Apple (IN)");
	}
	@Test(priority=9)
	public void Watch()
	{
		apple.Watch().click();
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"Apple Watch - Apple (IN)");
	}
	@Test(priority=10)
	public void Airpods()
	{
		apple.AirPods().click();;
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"AirPods - Apple (IN)");
	}
	@Test(priority=11)
	public void Tv()
	{
		apple.TV_Home().click();
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"TV & Home - Apple (IN)");
	}
	@Test(priority=12)
	public void Entertainment()
	{
		apple.Entertainment().click();
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"Entertainment - Services - Apple (IN)");
	}
	@Test(priority=13)
	public void Accessories()
	{
		apple.Accessories().click();
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"Apple Accessories for Apple Watch, iPhone, iPad, iPod and Mac - Apple (IN)");
	}
	@Test(priority=14)
	public void Support()
	{
		apple.Support().click();;
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		Assert.assertEquals(title,"Official Apple Support");
	}
	
	@Test(priority=15)
	public void Back()
	{
		apple.Logo().click();
		boolean status=apple.Logo().isDisplayed();
		System.out.println("The logo is dispalyed= "+status);
		Assert.assertTrue(status);
	}
	
	
	@Test(priority=16)
	public void Heading()
	{
		boolean heading=driver.findElement(By.xpath("//h2[text()='iPhone 14 Pro']")).isDisplayed();
		System.out.println("The heading is visible= "+heading);
		String title=driver.getTitle();
		System.out.println("The title is "+title);
		Assert.assertEquals(title,"Apple (India)");
	}
	
	@Test(priority=17)
	public void Pro_beyond()
	{
		apple.Pro_beyond().click();
		String title=driver.getTitle();
		System.out.println("The title ="+title);
		Assert.assertEquals(title,"iPhone 14 Pro and iPhone 14 Pro Max - Apple (IN)");
		driver.navigate().back();
	}
	
	@Test(priority=18)
	public void Image()
	{
		boolean dispaly=driver.findElement(By.xpath("//div[@data-unit-id='apple-watch-series-8']")).isDisplayed();
		System.out.println("The image is visible= "+dispaly);
		String title=driver.getCurrentUrl();
		Assert.assertEquals(title,"https://www.apple.com/in/");
	}
	@Test(priority=19)
	public void Banner2()
	{
		apple.Banner2().click();
		String title=driver.getCurrentUrl();
		System.out.println("The url = "+title);
		Assert.assertEquals(title,"https://www.apple.com/in/apple-watch-series-8/");
		driver.navigate().back();
	}
	@Test(priority=20)
	public void Banner3() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@data-analytics-title='See what your device is worth']")).click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.apple.com/in/shop/trade-in");
		driver.navigate().back();
	}
	
	@Test(priority=21)
	public void Banner4() throws InterruptedException
	{
		apple.Banner4().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals(url,"https://developer.apple.com/wwdc23/");
		driver.navigate().back();
	}
	
	@Test(priority=22)
	public void Banner5()
	{
		apple.Banner5().click();
		String url=driver.getCurrentUrl();
		//Assert.assertEquals(, null);
		System.out.println("22="+url);
		Assert.assertEquals(url,"https://www.apple.com/in/ipad-10.9/");
		driver.navigate().back();
	}
	
	@Test(priority=23)
	public void Banner6()
	{
		apple.Banner6().click();
		String url=driver.getCurrentUrl();
		System.out.println("23= "+url);
		Assert.assertEquals(url,"https://www.apple.com/in/macbook-pro-14-and-16/");
		driver.navigate().back();
	}
	
	@Test(priority=24)
	public void Banner7()
	{
		apple.Banner7().click();
		String url=driver.getCurrentUrl();
		System.out.println("24="+url);
		Assert.assertEquals(url,"https://www.apple.com/in/apple-watch-ultra/");
		driver.navigate().back();
	}
	@Test(priority=25,enabled=false)
	public void Banner8()
	{
		apple.Banner8().click();
		String url=driver.getCurrentUrl();
		System.out.println("25= "+url);
		Assert.assertEquals(url,"https://www.apple.com/in/homepod-2nd-generation/");
		driver.navigate().back();
	}
	
	@Test(priority=26)
	public void Scroll1() {
		apple.Scroll1().click();
		String url=driver.getCurrentUrl();
		//System.out.println(title);
		Assert.assertEquals(url,"https://www.apple.com/in/");
	}
	@Test(priority=27,enabled=false)
	public void Scroll() throws InterruptedException {
		apple.Scroll4().click();
		Thread.sleep(2000);
		apple.Scroll6().click();
		Thread.sleep(2000);
		apple.Scroll12().click();
		String url=driver.getCurrentUrl();
		//System.out.println(title);
		Assert.assertEquals(url,"https://www.apple.com/in/");
	}
	
	@Test(priority=28)
	public void Footer_text()
	{
		String text=driver.findElement(By.xpath("//li[@id='footnote-1']")).getText();
		System.out.println("The footer note= "+text);
		boolean status=apple.Logo().isDisplayed();
		System.out.println("The logo is dispalyed= "+status);
		Assert.assertTrue(status);
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}

}
