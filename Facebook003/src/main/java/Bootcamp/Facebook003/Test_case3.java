package Bootcamp.Facebook003;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;



public class Test_case3 {
	
		public static void main(String []args) throws InterruptedException
			{
				
			// Initializing browser driver
				System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			//Driver object
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
				
				WebDriver driver=new ChromeDriver(chromeOptions);
			
				//URL login
				driver.get("https://www.amazon.in");
				//. Maximize or set size of browser window
				driver.manage().window().maximize();
		
				//page title and print it
				String s=driver.getTitle();
				System.out.println(s);
				String A=Keys.chord(Keys.CONTROL,Keys.ENTER);
				//link for amazon pay
				WebElement w1=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
				w1.sendKeys(A);
				Thread.sleep(800);
			
				//BEST SELLERS
				
				WebElement w3=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
				w3.sendKeys(A);
				Thread.sleep(800);
			//MOBILES
				WebElement w4=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
				w4.sendKeys(A);
				Thread.sleep(800);
				
			
			//close the browser
				driver.close();
				driver.quit();
				
			}

		}







