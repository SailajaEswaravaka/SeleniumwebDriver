package hybridframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class OpenCart {
	//public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://localhost/studyopedia/");
		public OpenCart (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
}


