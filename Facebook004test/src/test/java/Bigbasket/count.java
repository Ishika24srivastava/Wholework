package Bigbasket;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class count {

	WebDriver driver;
	WebDriverWait wait;
	
	
	@Test
	@Parameters("URL")
	public void add(String URL) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		
		
		
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Farm Eggs - Regular, Medium, Antibiotic Residue-Free']")).click();
		driver.findElement(By.xpath("//div[@data-qa='addToBasket']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-qa='add']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='Country Eggs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@uib-tooltip='Eggs - Country Duck']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[@class='Cs6YO rippleEffect']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-qa='add']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@data-qa='myBasket']")).click();
	
		
		WebElement egg=driver.findElement(By.xpath("//div[@class='eubx4']"));
		System.out.println("TOTAL ITEM COST="+egg.getText());
		Thread.sleep(2000);
		
	
		
		
		WebElement eggCost=driver.findElement(By.xpath("//div[@class='_2jeTu']"));
		System.out.println("EggCost=" + eggCost.getText());
		
		WebElement Cost=driver.findElement(By.xpath("//div[@class='PhLrq']"));
		System.out.println("Total Cost=" + Cost.getText());
		
		
			//String expected="2 items";
		//String expected = "Saved Rs 48.00";
		//Assert.assertEquals(s1, expected);
		//System.out.println("Item is  same ");
		
		//WebElement w1=driver.findElement(By.xpath("//span[@ng-bind='vm.cart.cart_total']"));
		//System.out.println("TOTAL COST= "+w1.getText());
		driver.close();
		
	}
	
	
}
