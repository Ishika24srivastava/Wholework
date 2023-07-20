package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Apple_page;
import Testbase.Apple_base;

public class AppleMac_module extends Apple_base{

	Apple_page apple3;
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 apple3=new Apple_page();
		
	}
	
	@Test(priority=1)
	public void Mac()
	{
		apple3.Mac().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://www.apple.com/in/mac/");
	}
	
	@Test(priority=2)
	public void MacPro()
	{
		driver.findElement(By.xpath("//a/span[text()='MacBook Pro']")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://www.apple.com/in/macbook-pro/");
	}
	
	
	@Test(priority=3)
	public void Mac_pro()
	{
		apple3.Mac_pro().click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	
	@Test(priority=4)
	public void Heading_pro()
	{
		String heading=apple3.Pro().getText();
		System.out.println("The heading = "+heading);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://www.apple.com/in/macbook-pro-14-and-16/");
		
	}
	
	@Test(priority=5)
	public void Movemaker_text()
	{
		String text=driver.findElement(By.xpath("//p[@class='typography-eyebrow-super hero-copy']")).getText();
		System.out.println("The text after Move Maker is= "+text);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.apple.com/in/macbook-pro-14-and-16/");
	}
	
	@Test(priority=6)
	public void Watch_announcemnet() throws InterruptedException
	{
		apple3.Watch_announce().click();
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.apple.com/in/macbook-pro-14-and-16/");
		
	}
	
	@Test(priority=7)
	public void Pause() throws InterruptedException
	{
		Thread.sleep(2000);
		apple3.Pause().click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	
	@Test(priority=8,enabled=false)
	public void Volume()
	{
		apple3.Volume().click();
		WebElement w1=driver.findElement(By.xpath("//div[2][@class='ac-slider-thumb-background']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(w1).dragAndDropBy(w1,0,10);
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	@Test(priority=9)
	public void Sub_title()
	{
		apple3.Subtitle().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	@Test(priority=10)
	public void Sub_titlel()
	{
		apple3.Subtitle_langauage().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	
	@Test(priority=11)
	public void Slider() throws InterruptedException
	{
		WebElement w2=driver.findElement(By.xpath("//div[@class='ac-slider-thumb-overlay']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(w2).dragAndDropBy(w2, 10, 15);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=12)
	public void FullScreen() throws InterruptedException
	{
		apple3.FullScreen().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	
	@Test(priority=13)
	public void ExitScreen() throws InterruptedException
	{
		apple3.ExitScreen().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
		driver.navigate().back();
	}
	
	
	@Test(priority=14)
	public void Mac_14() throws InterruptedException
	{
		apple3.Mac_pro().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	
	@Test(priority=15)
	public void Go_insideM2pro() throws InterruptedException
	{
		apple3.Go_inside().click();
		Thread.sleep(1000);
		String s =driver.getCurrentUrl();
		Assert.assertEquals(s,"https://www.apple.com/in/macbook-pro-14-and-16/");
		System.out.println(s);
	}
	
	@Test(priority=16)
	public void New_chips()
	{
		String text=driver.findElement(By.xpath("//span[text()='New pro chips.']")).getText();
		System.out.println("The text after NewChips= "+text);
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
		
	}
	
	@Test(priority=17)
	public void  Better_better()
	{
		String text=driver.findElement(By.xpath("//span[text()='Better. And better.']")).getText();
		System.out.println("The text after better = "+text);
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
	}
	
	@Test(priority=18)
	public  void  Keeps_going()
	{
		String text=driver.findElement(By.xpath("//span[text()='Keeps going. No matter watt.']")).getText();
		System.out.println("The text after Keeps going  = "+text);
		String title=driver.getTitle();
		Assert.assertEquals(title,"MacBook Pro 14-inch and MacBook Pro 16-inch - Apple (IN)");
		driver.navigate().back();
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
}


