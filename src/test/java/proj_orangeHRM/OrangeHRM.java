package proj_orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		WebElement pim = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"));
		pim.click();
		//driver.findElement(By.xpath("//label[text()='Job Title']"));
		Thread.sleep(5000);
		WebElement employmentStatus = driver.findElement(By.xpath("//div[text()=\"-- Select --\"]"));
		employmentStatus.click();
		//Thread.sleep(5000);
		//WebElement opt = driver.findElement(By.xpath("//div[contains(text(),'Freelance')]"));
		//Select dropDown = new Select(opt);
		//dropDown.selectByVisibleText("Freelance");
		//opt.click();
		
		
    	
		}

}

		
		



