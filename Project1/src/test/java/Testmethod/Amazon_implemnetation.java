package Testmethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Amazon_page;
//import Test.Amazon_impleme;
import Testbase.Amazon_base;

public class Amazon_implemnetation extends Amazon_base {

Amazon_page  am;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 am=new Amazon_page();
		 
	}
	@Test(priority=1)
	public void click1() throws InterruptedException
	{
		
		am.Elect();
		Thread.sleep(500);
		String s=driver.getCurrentUrl();
		System.out.println("Current url="+s);
		Assert.assertEquals(s, "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		am.Acc().click();
		Thread.sleep(500);
		
		//Assert.assertEquals(s,"https://www.amazon.in/s?bbn=976420031&rh=n%3A976419031%2Cn%3A1388867031&dc&qid=1681896411&rnid=976420031&ref=lp_976420031_nr_n_0");
		
	}
	
	
	@Test(priority=2)
	public void click() throws InterruptedException
	{
		am.Best();
		Thread.sleep(1000);
		am.Bag();
		Thread.sleep(1000);
		am.Cart().click();
		Thread.sleep(1000);
		
	}
	
	
	
	@Test(priority=3)
	public void add() throws InterruptedException
	{
		am.Mobileacc().click();
		Thread.sleep(1000);
		am.blue().click();
		Thread.sleep(1000);
		String ur=driver.getTitle();
		System.out.println("Get url="+ur);
		//Assert.assertEquals(ur, "https://www.amazon.in/cart/smart-wagon?newItems=1984e957-1f1a-4458-b7e3-ae362625b991,1&ref_=sw_refresh");
	}
	
	
	
	@Test(priority=4)
	public void cartj() throws InterruptedException
	{
		
		
		
		am.cart1().click();
		Thread.sleep(1000);
		
		System.out.println("The Quantity of kuber industries ="+driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).getText());
		System.out.println("The Qunatity of Boldfit shoe bag= "+driver.findElement(By.xpath("//span[@id='a-autoid-3-announce']")).getText());
		System.out.println("The subtotal Qunatity ="+driver.findElement(By.xpath("//span[@id='sc-subtotal-label-activecart']")).getText());
		System.out.println("The total amount will be= "+driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText());
		String s=driver.getTitle();
		System.out.println(s);
		Assert.assertEquals(s, "Amazon.in Shopping Cart");
	}
	
	
	
	@Test(priority=5)
	public void Searchadd() throws IOException
	{
		am.Search().sendKeys("bluetooth");
		am.Searchbox().click();
		String ss=driver.getCurrentUrl();
		System.out.println(ss);
		
		
		WebElement w1=driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		Actions ac= new Actions(driver);
		ac.moveToElement(w1).click();
		ac.keyDown(Keys.SHIFT);
		w1.click();
		driver.findElement(By.xpath("//span[text()='HI']")).click();
		am.lang().click();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(f, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"),false);
		System.out.println("Scrrenshot saved successfully");
		
	}
	@Test(enabled=false)
	public void WebSeries() throws InterruptedException
	{
		am.Minitv().click();
		Thread.sleep(1000);
		am.Series().click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		System.out.println("The current Title  = "+url);
		//Assert.assertEquals(url,"https://www.amazon.in/minitv/ct/web-series" );
	}
	
	@AfterSuite
	public void terminate1()
	{
		terminate();
	}
	

}


