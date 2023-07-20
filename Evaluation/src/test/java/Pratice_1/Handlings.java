package Pratice_1;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handlings {
	
	WebDriver driver;
	
	@Test(enabled=false)
	public void Window()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//a[text()='Click Here\']")).click();
		Set<String> ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String> id=ids.iterator();
		for(String i:ids)
		{
			System.out.println("The window id"+i);
		
		}
		String parent_id=id.next();
		String child_id=id.next();
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent_id);
		System.out.println(driver.getTitle());
		//driver.quit();
	}
	

	@Test(enabled=false)
	public void drag_drop()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//div[@id='column-a\']"));
		WebElement w2=driver.findElement(By.xpath("//div[@id=\"column-b\"]"));
		ac.dragAndDrop(w1, w2).build().perform();
		
	}
	
	@Test(enabled=false)
	public void ss() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(f, new File("C:\\\\Users\\\\isrivastava\\\\Pictures\\\\Saved Pictures"),false);
		}
	
	@Test(enabled=false)
	public void partial_ss() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File f=screenshot.getScreenshotAs(OutputType.FILE);
		WebElement w1=driver.findElement(By.xpath("//img[@class='lnXdpd\']"));
		BufferedImage f1 = ImageIO.read(f);
		  Point location= w1.getLocation();
		  int w= w1.getSize().getWidth();
	      int h=w1.getSize().getHeight();
	      BufferedImage cImage= f1.getSubimage(location.getX(), location.getY(),  w, h);
	      ImageIO.write(cImage, "png", f);
		FileUtils.copyFileToDirectory(f, new File("C:\\Users\\isrivastava\\Pictures\\Saved Pictures"), false);
		System.out.println("Successfully ss");
	}
	@Test(enabled=false)
	public void upload()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement browser=driver.findElement(By.xpath("//input[@id='file-upload\']"));
		browser.sendKeys("C:\\Users\\isrivastava\\Pictures\\Saved Pictures");
		driver.findElement(By.xpath("//input[@class='button\']")).click();	
		}
	@Test()
	public void Iframe()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		//driver.switchTo().frame("")
		
		
	}
}



