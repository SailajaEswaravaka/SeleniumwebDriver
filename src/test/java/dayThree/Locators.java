package dayThree;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//Name locator
		//driver.findElement(By.name("search")).sendKeys("Mac");
		//Id locator
		//boolean obj1 =driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(obj1);
		
		//Link Text
		//driver.findElement(By.linkText("Tablets")).click();
		
		//FindElements
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));

		//System.out.println("Total number of header links:" + headerLinks.size());
		
		//TagName
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of links: " +links.size());
		//Images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: " +images.size());
		
	}	
	

	}

	
		
	


