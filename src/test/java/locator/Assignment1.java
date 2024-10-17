package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		//1. Find total no. of links in the website. 		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " +links.size());
		
		// 2. Find total no. of images in the website. 
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images: " +images.size());
		
		driver.findElement(By.linkText("Laptops")).click();
		List<WebElement> headerLinks = driver.findElements(By.className("list-group-item"));
		System.out.println("Total no. of headerlinks: "+headerLinks.size());

	}

}
