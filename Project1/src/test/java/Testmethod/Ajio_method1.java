package Testmethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Ajio_page;
import Testbase.Aji_base;

public class Ajio_method1 extends Aji_base{
	Ajio_page aj1;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 aj1=new Ajio_page();
		 
	}
	
	@Test(priority=1)
	public void Visit_ajio() throws InterruptedException
	{
		aj1.Visitaji().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("The current title = "+title);
		Assert.assertEquals(title, "Shop fashion, beauty and home from the most coveted luxury brands");
		aj1.Search().sendKeys("Jackets");
		Thread.sleep(1000);
		aj1.Search_bb().click();
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void Visit1() throws InterruptedException
	{
		aj1.Men_v().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println("The current url="+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/shop/luxe-men");
	}
	
	@Test(priority=3)
	public void Visit2() throws InterruptedException
	{
		aj1.Women_v().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println("Desired url= "+s);
		Assert.assertEquals(s,"https://luxe.ajio.com/shop/luxe-women");
	}
	@Test(priority=3)
	public void Visit3() throws InterruptedException
	{
		aj1.Brands_v().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println("Desired url= "+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/");
	}
	@Test(priority=4)
	public void Visit4() throws InterruptedException
	{
		aj1.Home_v().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println("Desired url= "+s);
		Assert.assertEquals(s, "https://luxe.ajio.com/shop/luxe-lifestyle");
	}
	@Test(priority=5)
	public void Visit5() throws InterruptedException
	{
		aj1.Beauty_v().click();
		Thread.sleep(1000);
		String s=driver.getTitle();
		System.out.println("Desired Title = "+s);
		Assert.assertEquals(s, " Best of Beauty");
	}

	@AfterSuite
	public void close()
	{
		terminate();
	}
}
