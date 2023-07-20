package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Apple_page;
import Testbase.Apple_base;

public class Apple_footer extends Apple_base {
	Apple_page apple2;
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 apple2=new Apple_page();
		
	}
	
	@Test(priority=1)
	public void footer()
	{
		boolean status=driver.findElement(By.xpath("//h3/span[text()='Shop and Learn']")).isDisplayed();
		System.out.println("The Shop and Learn heading is viewed= "+status);
		boolean status1=apple2.Logo().isDisplayed();
		Assert.assertTrue(status1);
	}
	@Test(priority=2)
	public void Shop1() throws InterruptedException
	{
		apple2.Store1().click();
		Thread.sleep(1000);
		String s=driver.getTitle();
		Assert.assertEquals(s,"Apple Store Online - Apple (IN)");
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void Mac1() throws InterruptedException
	{
		apple2.Mac1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/mac/");
		driver.navigate().back();
	}
	
	@Test(priority=4)
	public void Ipad1() throws InterruptedException
	{
		apple2.Ipad1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Assert.assertEquals(s,"https://www.apple.com/in/ipad/");
		driver.navigate().back();
	}
	
	@Test(priority=5)
	public void Iphone1() throws InterruptedException
	{
		apple2.Iphone1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/iphone/");
		driver.navigate().back();
	}
	
	@Test(priority=6)
	public void Watch1() throws InterruptedException
	{
		apple2.Watch().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/watch/");
		driver.navigate().back();
	}
	
	@Test(priority=7,enabled=false)
	public void Airpods1() throws InterruptedException
	{
		apple2.Airpods1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		
		Assert.assertEquals(s,"https://www.apple.com/in/airpods/");
		driver.navigate().back();
	}
	
	@Test(priority=8)
	public void Tv1() throws InterruptedException
	{
		apple2.Tv1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Assert.assertEquals(s,"https://www.apple.com/in/tv-home/");
		driver.navigate().back();
	}
	
	@Test(priority=9)
	public void Airtag1() throws InterruptedException
	{
		apple2.Airtag1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/airtag/");
		driver.navigate().back();
	}
	
	@Test(priority=10)
	public void Accessories1() throws InterruptedException
	{
		apple2.Accessories1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/shop/accessories/all");
		driver.navigate().back();
	}
	
	@Test(priority=11)
	public void Gift1() throws InterruptedException
	{
		apple2.Gift_card1().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/shop/gift-cards");
		driver.navigate().back();
	}
	
	@Test(priority=12)
	public void Apple_wallet()
	{
		boolean status=driver.findElement(By.xpath("//h3/span[text()='Apple Wallet']")).isDisplayed();
		System.out.println("The heading Apple Wallet is dipalyed= "+status);
		boolean status1=apple2.Logo().isDisplayed();
		Assert.assertTrue(status1);
	}
	
	@Test(priority=13)
	public void Wallet() {
		apple2.Wallet().click();
		String s=driver.getCurrentUrl();
		driver.navigate().back();
		Assert.assertEquals(s,"https://www.apple.com/in/wallet/");
		
	}
	
	@Test(priority=14)
	public void Account()
	{
		Boolean status= driver.findElement(By.xpath("//h3/span[text()='Account']")).isDisplayed();
		System.out.println("The Account is visible at the footer ="+status);
		boolean status1=apple2.Logo().isDisplayed();
		Assert.assertTrue(status1);
	}
	
	@Test(priority=15)
	public void Manage_id()
	{
		apple2.Manage().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		Assert.assertEquals(url,"https://appleid.apple.com/in/");
	}
	
	@Test(priority=16)
	public void Apple_store()
	{
		apple2.Applestore().click();
		String url=driver.getTitle();
		System.out.println(url);
		driver.navigate().back();
		//Assert.assertEquals(url,"");
	}
	
	@Test(priority=17)
	public void Icloud()
	{
		apple2.Icloud().click();
		String url=driver.getCurrentUrl();
		driver.navigate().back();
		Assert.assertEquals(url,"https://www.icloud.com/");
	}
	@Test(priority=18)
	public void Entertain()
	{
		boolean status=driver.findElement(By.xpath("//h3/span[text()='Entertainment']")).isDisplayed();
		System.out.println("The text Entertainment is viewed= "+status);
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/");
		
	}
	
	@Test(priority=19)
	public void Apple_one()
	{
		apple2.Apple_one().click();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().back();
		Assert.assertEquals(s,"https://www.apple.com/in/apple-one/");
		
	}
	@Test(priority=20)
	public void Apple_tv()
	{
		apple2.Apple_tv().click();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().back();
		Assert.assertEquals(s,"https://www.apple.com/in/apple-tv-plus/");
	}
	@Test(priority=21)
	public void Apple_music()
	{
		apple2.Apple_music().click();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().back();
		Assert.assertEquals(s,"https://www.apple.com/in/apple-music/");
	}
	@Test(priority=22)
	public void Apple_arcade()
	{
		apple2.Apple_arcade().click();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().back();
		Assert.assertEquals(s,"https://www.apple.com/in/apple-arcade/");
	}
	@Test(priority=23)
	public void Apple_podcasts()
	{
		apple2.Apple_podcasts().click();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().back();
		Assert.assertEquals(s,"https://www.apple.com/in/apple-podcasts/");
	}
	@Test(priority=24)
	public void Applestore()
	{
		apple2.Applestore().click();
		String s=driver.getTitle();
		System.out.println(s);
		driver.navigate().back();
		Assert.assertEquals(s,"Sign in - Apple (IN)");
	}

	@AfterSuite
	public  void close()
	{
		driver.close();
	}
}
