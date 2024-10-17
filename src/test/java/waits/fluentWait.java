package waits;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.out.println("Welcome to Fluent Wait Program Example");

         WebDriver driver = new ChromeDriver();
		
//		Wait wait_obj = new FluentWait(driver).withTimeout(10, SECONDS).pollingEvery(2, SECONDS).ignoring()
				
		String url = "https://testautomationpractice.blogspot.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait  = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement name = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='name']"));
			}
		});
		name.sendKeys("Pritika");
	   WebElement email = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='email']"));
			}
		});
		email.sendKeys("abc@gmail.com");
		}
}









	






		
			
		
		

	


