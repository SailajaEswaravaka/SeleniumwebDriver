package testngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class orangeTest {
	
	WebDriver driver ; 
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String username = "Admin";
	String password = "admin123";


	
	@Test(priority = 1)
	void openApp() {
		
		driver = new ChromeDriver(); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 


		driver.get(url);

		driver.manage().window().maximize();
		
		}
	
	@Test(priority = 2)
	void LogoTest(){
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    boolean orangeLogo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	     //		WebElement orangeLogo = driver.findElement(By.xpath("(//img[@src='/web/images/ohrm_logo.png'])[1]"));
		//boolean logoDisplayed = orangeLogo.isDisplayed(); 
		//System.out.println("Logo Displayed ? " +logoDisplayed);
		
		}
	@Test(priority = 3)
	void Login() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
		
		
		}
	
	@Test(priority = 4)
	void ClosingApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
		}
	
	

}

	
	




