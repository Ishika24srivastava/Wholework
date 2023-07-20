package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page_object.Amazon_ui;

public class Amazon_impleme  extends Amazon_ui
{
	Amazon_impleme am;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 am=new Amazon_impleme();
		 
	}
	
	
	@Test(priority=1)
	public void click() throws InterruptedException
	{
		am.Best();
		Thread.sleep(1000);
		am.Bag();
		Thread.sleep(1000);
		am.Cart().click();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=2)
	public void click1() throws InterruptedException
	{
		am.Cart_Bag();
		Thread.sleep(1000);
		//am.add().click();
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Assert.assertEquals(s,"https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		
	}
	
	
	

}
