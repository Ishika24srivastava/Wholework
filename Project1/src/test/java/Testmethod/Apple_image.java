package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Apple_page;
import Testbase.Apple_base;

public class Apple_image extends Apple_base{
	Apple_page apple2;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 apple2=new Apple_page();
		
	}
	
	@Test(priority=1)
	public void Image()
	{
		apple2.Image().click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Apple (India)");
	}
	
	@Test(priority=2)
	public void Stream_click()
	{
		apple2.Stream().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Apple (India)");
	}
	
	@Test(priority=3)
	public void Search()
	{
	
		WebElement w1=driver.findElement(By.xpath("//input[@name='query']"));
		w1.sendKeys("seasonpass");
		w1.sendKeys(Keys.ENTER);
		//apple2.Stream_search().click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Watch Drops of God | Apple TV+ (IN)");
		
	}
	@Test(priority=4)
	public void Play() throws InterruptedException
	{
		apple2.Play().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		Assert.assertEquals(url,"https://tv.apple.com/in/show/drops-of-god/umc.cmc.497ttx33nudgzywis3i2bnvuk?query=seasonpass");
		driver.navigate().back();
	}
	
	@Test(priority=5,enabled=false)
	public void Message() throws InterruptedException
	{
		apple2.Play().click();
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//p[@data-test='gdpr-pane-account']")).getText();
		System.out.println("The text will be ="+text);
		driver.navigate().back();
	}
	
	@Test(priority=6)
	public void Try() throws InterruptedException
	{
		apple2.Try().click();
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		Assert.assertEquals(title,"Watch Drops of God | Apple TV+ (IN)");
		driver.navigate().back();
	}
	
	@Test(priority=7,enabled=false)
	public void Add() throws InterruptedException
	{
		apple2.Add().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://tv.apple.com/in/show/drops-of-god/umc.cmc.497ttx33nudgzywis3i2bnvuk");
		Thread.sleep(2000);
		
	}
	@Test(priority=5)
	public void Fleur()
	{
		String s=driver.findElement(By.xpath("//div[@class='line-clamp  person-header__bio__long-notes typ-subhead']")).getText();
		System.out.println(s);
	}
}
