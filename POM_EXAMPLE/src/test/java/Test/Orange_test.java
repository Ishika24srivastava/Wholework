package Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM_2.OrangeVisibilty;
import Page_object.Visibilty1;
import test_Base.Testbase1;

//import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;



public class Orange_test extends Visibilty1{
	
	
	Orange_test v1;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		 intilization();
		 v1=new Orange_test();
		 
	}
	
	
	
	@Test(enabled=false)
	public void valid_credentials() throws IOException
	{
			v1.user_name().sendKeys(prop.getProperty("username1"));
			v1.pass_word().sendKeys(prop.getProperty("password1"));
			v1.Sub_mit().click();
		
			
	}
	
	@Test(priority=1)
	public  void Invalid_credentials() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		v1.user_name().sendKeys(prop.getProperty("username2"));
		v1.pass_word().sendKeys(prop.getProperty("password2"));
		v1.Sub_mit().click();
		//screenshot 
		//SCREENSHOT
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
		System.out.println("Screenshot is captured");
		//Partial screenshot
		WebElement l=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot\']"));
			//TakesScreenshot screenshot1 = (TakesScreenshot)driver;
			File source1 = screenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFileToDirectory(source, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
		   BufferedImage f = ImageIO.read(source1);
		   Point location= l.getLocation();
		   int w= l.getSize().getWidth();
	       int h=l.getSize().getHeight();
	       BufferedImage cImage= f.getSubimage(location.getX(), location.getY(),  w, h);
	       ImageIO.write(cImage, "png", source1);
	       FileUtils.copyFileToDirectory(source, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
		
	}
	
	@Test(enabled=false)
	
	public void Check()
	{
		
		v1.For_got();
		System.out.println("hello");
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
	
}
