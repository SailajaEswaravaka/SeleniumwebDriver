package testngDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAnnotations {
	WebDriver driver;
	
	//Preconditions defined
	@BeforeMethod
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    System.out.println("Opening the application");
	}
	@Test(priority=1)
	void verifyPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("The page title is: " +title);
		Assert.assertEquals(title, title);
	}
	
	@Test(priority=2)
	void search() throws InterruptedException {
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone16");
	}
	@Test(priority=3)
	void srhbtn() {
	WebElement srhbtn = driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']"));
	srhbtn.click();
	}
	@Test(priority=4)
	void click_prod() {
		
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
		
		
	@AfterMethod
	void tearDown() {
	driver.quit();
	}
	}
		
	


