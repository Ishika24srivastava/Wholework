package Test_method;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Test_base.Justdial_base;
import Test_page.Justdial_page;


public class Justdial_homepage extends Justdial_base{
	
	Justdial_page justdail_homepage;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		justdail_homepage=new Justdial_page();
	}
	
	@Test(priority=1)
	public void Logo()
	{
		justdail_homepage.Logo();
	}
	
	@Test(priority=2,enabled=false)
	public void Location() throws InterruptedException
	{
		justdail_homepage.Location();
	}
	
	@Test(priority=3,enabled=false)
	public void Detect_Location() throws InterruptedException
	{
		justdail_homepage.Detect_Location();
	}
	
	
	
	@Test(priority=4)
	public void  Hotels() throws InterruptedException
	{
		justdail_homepage. Hotels();
	}
	
	@Test(priority=5)
	public void Realestate() throws InterruptedException
	{
		justdail_homepage.Realestate();
	}
	
	@Test(priority=6)
	public void Homedecor() throws InterruptedException
	{
		justdail_homepage.Homedecor();
	}
	
	@Test(priority=7)
	public void Education() throws InterruptedException
	{
		justdail_homepage.Education();
	}
	
	@Test(priority=8)
	public void Gym() throws InterruptedException
	{
		justdail_homepage. Gym();
	}
	

	@Test(priority=9)
	public void Courierservice() throws InterruptedException
	{
		justdail_homepage.Courierservice();
	}
	
	@Test(priority=10)
	public void Popularcategories() throws InterruptedException
	{
		justdail_homepage.Popularcategories();
	}
	
	@Test(priority=11)
	public void Popularcategoriessearch() throws InterruptedException
	{
		justdail_homepage.Popularcategoriessearch();
	}
	
	@Test(priority=12)
	public void Bodymassage() throws InterruptedException
	{
		justdail_homepage.Bodymassage();
	}
	
	

}
