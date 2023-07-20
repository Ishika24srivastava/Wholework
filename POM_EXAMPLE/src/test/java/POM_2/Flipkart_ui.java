package POM_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart_ui {

	WebDriver driver;
	
	By logo=By.xpath("//img[@title='Flipkart\']");
	By search_box =By.xpath("//input[@title='Search for products, brands and more']");
	By search_bar=By.xpath("//button[@class='L0Z3Pu']");
	By grocery=By.xpath("//div[text()='Grocery']");
}
