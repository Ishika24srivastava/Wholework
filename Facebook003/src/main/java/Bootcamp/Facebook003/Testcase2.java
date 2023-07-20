package Bootcamp.Facebook003;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Testcase2 {
	
	public static void main(String []args) throws InterruptedException
		{
			
		// Initializing browser driver
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		//Driver object
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			
			WebDriver driver=new ChromeDriver(chromeOptions);
		//. Maximize or set size of browser window
			driver.manage().window().maximize();
		//URL login
			driver.get("https://www.amazon.in");
	
		//page title and print it
			String s=driver.getTitle();
			System.out.println(s);
			String ext=s;
		//link for amazon pay
			WebElement w1=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
			w1.click();
			Thread.sleep(100);
		//verify the value of Title
			String t2=driver.getTitle();
			System.out.println(t2);
			if(t2.equalsIgnoreCase("Amazon Pay"))
				System.out.println("Title verified");
			else
				System.out.println("Title didn't verified");
		//Navigate to home page
			driver.navigate().back();
			Thread.sleep(100);
		// Title validation
			if(ext.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
				System.out.println("Title matched");
			else
				System.out.println("Title didn't matched");
		//. Repeat steps 5 to 8 for other menu links.
		//  1.  Amazon MINI  TV
			WebElement w2=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav']"));
			w2.click();
			Thread.sleep(500);
			driver.navigate().back();
			
			
		//3.BEST SELLERS
			WebElement w3=driver.findElement(By.linkText("Best Sellers"));
			w3.click();
			Thread.sleep(300);
			driver.navigate().back();
		//4. Mobiles
			WebElement w4=driver.findElement(By.linkText("Mobiles"));
			w4.click();
			Thread.sleep(300);
			driver.navigate().back();
		// 5.Customer Service
			WebElement w5=driver.findElement(By.linkText("Customer Service"));
			w5.click();
			Thread.sleep(300);
			driver.navigate().back();
		//6.Today's Deal
			WebElement w6=driver.findElement(By.linkText("Today's Deals"));
			w6.click();
			Thread.sleep(300);
			driver.navigate().back();
		//7.Electronics
			WebElement w7=driver.findElement(By.linkText("Electronics"));
			w7.click();
			Thread.sleep(300);
			driver.navigate().back();
		// 8. Home and kitchen
			WebElement w8=driver.findElement(By.linkText("Home & Kitchen"));
			w8.click();
			Thread.sleep(300);
			driver.navigate().back();
		
		//9.PRIME
			WebElement w10=driver.findElement(By.linkText("Prime"));
			w10.click();
			Thread.sleep(300);
			driver.navigate().back();
		//close the browser
			driver.close();
			driver.quit();
			
		}

	}





