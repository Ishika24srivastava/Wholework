package testmethod;
import java.io.IOException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testbase.Hamleys_base;
import testpage.Hamleys_page;

public class Hamleys_homepage extends Hamleys_base {
	Hamleys_page hamelys_homepage;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		intilization();
		hamelys_homepage=new Hamleys_page();
	}
	
	@Test(priority=1)
	public void Logo()
	{
		hamelys_homepage.Logo();
	}
	
	@Test(priority=2)
	public void Deals_promotion() throws InterruptedException
	{
		hamelys_homepage.Deals_promotion();
	}
	
	@Test(priority=3)
	public void Category() throws InterruptedException
	{
		hamelys_homepage.Category();
	}
	
	@Test(priority=4)
	public void Age() throws InterruptedException
	{
		hamelys_homepage.Age();
	}
	
	@Test(priority=5)
	public void Brand() throws InterruptedException
	{
		hamelys_homepage.Brand();
	}
	
	@Test(priority=6)
	public void Charcaters() throws InterruptedException
	{
		hamelys_homepage.Charcaters();
	}
	
	@Test(priority=7)
	public void Search() throws InterruptedException
	{
		hamelys_homepage.Search();
	}
	

}
