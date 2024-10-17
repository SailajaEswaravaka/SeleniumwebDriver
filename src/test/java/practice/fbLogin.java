package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;

//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
public class fbLogin {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Decline optional cookies']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("Pritika");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Es");
		Thread.sleep(5000);
		//select month/date/year
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		selectMonth.selectByVisibleText("Aug");
		Thread.sleep(5000);
		Select selectDate = new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
		selectDate.selectByVisibleText("6");
		Thread.sleep(5000);
		Select selectYear = new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
		selectYear.selectByVisibleText("2016");
		//select male or female
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		//Mobile or email
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("admin123@gmail.com");
		//new password
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("admin123");
		//Click signup button
		//driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		//driver.close();
		//driver.quit();
		
		
		
		
	}


	}



