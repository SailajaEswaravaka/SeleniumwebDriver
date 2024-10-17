package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) {
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptops");
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    // driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']")).click();
	     
	     
}
}
