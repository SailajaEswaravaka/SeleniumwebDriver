package testautomationprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement femaleRadioBtn = driver.findElement(By.xpath("(//label[text()='Female']/preceding-sibling::input)"));
		//femaleRadioBtn.click();
		//driver.switchTo().frame("iframe_name_or_id");

        WebElement femaleRadio = driver.findElement(By.xpath("//input[@id='female']"));
        WebElement maleRadio = driver.findElement(By.xpath("//input[@id='male']"));

        femaleRadio.click();
	}

}
