package windowHandle1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Unique id of the main window: " +mainWindowHandle);
		driver.close();

	}

}
