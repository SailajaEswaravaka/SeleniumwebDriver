package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class explicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]")));
		password.sendKeys("admin123");
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]")));
		loginBtn.click();
	}


}
