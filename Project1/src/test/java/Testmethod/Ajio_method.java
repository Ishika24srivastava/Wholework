package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Ajio_page;
import Testbase.Aji_base;

public class Ajio_method extends Aji_base {

	Ajio_page aj;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 aj=new Ajio_page();
		 
	}
	
	@Test(priority=1)
	public void Home() throws InterruptedException
	{
		boolean status =aj.Logo().isDisplayed();
		System.out.println("Logo is visible= "+status);
		String s=driver.getTitle();
		System.out.println("The title= "+s);
		Assert.assertEquals(s, "Online Shopping for Women, Men, Kids – Clothing, Footwear | AJIO");
		aj.Image().click();
		Thread.sleep(500);
		System.out.println("Image is viewed frequently");
	}
	
	@Test(priority=2)
	public void Search() throws InterruptedException
	{
		aj.SearchBox().sendKeys("Shoes");
		Thread.sleep(500);
		System.out.println("The search box is visible");
		aj.SearchButton().click();
		Thread.sleep(500);
		System.out.println("The search button is visible");
		String s=driver.getCurrentUrl();
		System.out.println("The current url ="+s);
		Assert.assertEquals(s, "https://www.ajio.com/s/footwear-4063-31521?query=:relevance");
		}
	
	@Test(priority=3)
	public void Men() throws InterruptedException
	{
		aj.Men().click();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("The current url= "+s);
		Assert.assertEquals(s,"https://www.ajio.com/shop/men");
	}
	
	@Test(priority=4)
	public void Women() throws InterruptedException
	{
		aj.Women().click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url, "https://www.ajio.com/shop/women");
		
	}
	
	@Test(priority=5)
	public void Kids() throws InterruptedException
	{
		aj.Kids().click();
		Thread.sleep(500);
		String title=driver.getTitle();
		System.out.println("The current title = "+title);
		Assert.assertEquals(title,"Online Kids fashion shopping site in India - AJIO");
	}
	
	@Test(priority=6)
	public void Indie() throws InterruptedException
	{
		aj.Indie().click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url,"https://www.ajio.com/shop/indie");
	}
	
	@Test(priority=7)
	
	public void Kitchen() throws InterruptedException
	{
		aj.Home().click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println("The current url= "+url);
		Assert.assertEquals(url, "https://www.ajio.com/c/8312");
	}
	@Test(priority=8)
	public void Visit_ajio() throws InterruptedException
	{
		aj.Visitaji().click();
		Thread.sleep(500);
		String title=driver.getTitle();
		System.out.println("The current title = "+title);
		Assert.assertEquals(title, "Shop fashion, beauty and home from the most coveted luxury brands");
		
		
	}
	
	@Test(priority=9)
	public void Visit_ajio1() throws InterruptedException
	{
		aj.Search().sendKeys("Jackets");
		Thread.sleep(500);
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		aj.Search_bb().click();
		Thread.sleep(1000);
	}
	@Test(priority=10)
	public void Visit1() throws InterruptedException
	{
		aj.Men_v().click();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("The current url="+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/shop/luxe-men");
	}
	
	@Test(priority=11)
	public void Visit2() throws InterruptedException
	{
		aj.Women_v().click();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("Desired url= "+s);
		Assert.assertEquals(s,"https://luxe.ajio.com/shop/luxe-women");
	}
	@Test(priority=12)
	public void Visit3() throws InterruptedException
	{
		aj.Brands_v().click();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("Desired url= "+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/");
	}
	@Test(priority=13)
	public void Visit4() throws InterruptedException
	{
		aj.Home_v().click();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("Desired url= "+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/shop/luxe-lifestyle");
	}
	@Test(priority=14)
	public void Visit5() throws InterruptedException
	{
		aj.Beauty_v().click();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("Desired Title = "+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/shop/luxe-beauty");
	}

	
	@Test(enabled=false)
	public void Signin() throws InterruptedException
	{
		aj.Sign().click();
		Thread.sleep(1000);
		aj.Mobile().sendKeys("8533904286");
		Thread.sleep(1000);
		aj.Con().click();
		Thread.sleep(2000);
		aj.Otp().sendKeys("0150");
		Thread.sleep(1000);
		aj.Start().click();
		Thread.sleep(1000);
		System.out.println("Sign in successfully");
		String ss=driver.getCurrentUrl();
		System.out.println("The current url= "+ss);
		Assert.assertEquals(ss, "https://www.ajio.com/");
	}
	
	
	
	
	
	@AfterSuite
	public void close()
	{
		terminate();
		
	}
}
