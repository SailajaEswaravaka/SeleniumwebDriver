package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		//WebElement container = driver.findElement(By.xpath("//div[@class=\"container\"]"));
		//js.executeScript("arguments[0].scrollIntoViewFuntion;", container);
	}

}
