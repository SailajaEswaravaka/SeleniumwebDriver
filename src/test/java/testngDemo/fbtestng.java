package testngDemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbtestng {
	WebDriver driver = new ChromeDriver();
	@Test
	void openApp()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Opening the application");
	}
	@Test(priority=1) 
		void login() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text() ='Decline optional cookies']")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

}
