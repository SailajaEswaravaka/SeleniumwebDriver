package demoQA;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathEx {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		//try {
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Elements']"))).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']")).click();
		
		//Elements']")).click();
		//click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://toolsqa.com/");
		driver.navigate().refresh();
		driver.close();
		}

}

		//}
		//catch (Exception e) {
          //  e.printStackTrace();
		//}
		//finally {
			
		
		
	




