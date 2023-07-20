package POM_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import Page_object.OrangeVisibilty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_lo {

	WebDriver driver;
	OrangeVisibilty op;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void test_Logo()
	{
		op=new  OrangeVisibilty(driver);
		Assert.assertEquals(op.logo(), true);
	}
	
	@Test(priority=2)
	public void enter()
	{
		
		op.username("Admin");
		op.password("admin123");
		op.button();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
	
	
	
}
