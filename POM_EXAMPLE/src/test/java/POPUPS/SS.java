package POPUPS;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SS {
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://the-internet.herokuapp.com/iframe");
	//IFRAME IMPLEMENTATION
	driver.switchTo().frame("mce_0_ifr");
	System.out.println("frame is viewed");
	System.out.println(driver.findElement(By.xpath("//body[@data-id='mce_0\']")).getText());
	driver.switchTo().defaultContent();
	
	
	
	//SCREENSHOT
	//TakesScreenshot screenshot = (TakesScreenshot)driver;
	//File source = screenshot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFileToDirectory(source, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
	//System.out.println("Screenshot is captured");
	//driver.quit();
	
	//PARTIAL SCREENSHOT
	WebElement l=driver.findElement(By.xpath("//span[text()='Edit']"));
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	File source = screenshot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFileToDirectory(source, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
	  BufferedImage f = ImageIO.read(source);
	  Point location= l.getLocation();
	  int w= l.getSize().getWidth();
      int h=l.getSize().getHeight();
      BufferedImage cImage= f.getSubimage(location.getX(), location.getY(),  w, h);
      ImageIO.write(cImage, "png", source);
      FileUtils.copyFileToDirectory(source, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
	}
	}


