package wikipedia;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Contains {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement obj = driver.findElement(By.xpath("//input[contains(@id,'searchInput' )]"));
		obj.sendKeys("Selenium software");
		obj.submit();

	}

}
