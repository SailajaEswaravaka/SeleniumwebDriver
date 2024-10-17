package testngDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	@BeforeTest
	void openApp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println("Opening the application");
	}
	@Test(priority=2)
	void search() throws InterruptedException
	{
	    Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone16");
	}
	@Test(priority=3)
	void srhbtn() throws InterruptedException 
	{
	Thread.sleep(5000);
	WebElement srhbtn = driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']"));
	srhbtn.click();
	}
	@Test(priority = 4)
	void click_prod() throws InterruptedException {
		Thread.sleep(5000);
		String mainpage = driver.getWindowHandle();
		System.out.println("Main page = " +mainpage);
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		Set<String> allpages = driver.getWindowHandles();
		for(String page : allpages)
		{
			if(!page.equals(mainpage)) {
				driver.switchTo().window(page);
				break;
			}
				
			System.out.println(driver.getCurrentUrl());
		}
		}
		@Test(priority=5)
		void add_to_cart() throws InterruptedException {
			Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
			
		}
		@Test(priority=6)
		void ClosingApp() {
		
	    driver.quit();
			
	}
}


	
	

	
	


