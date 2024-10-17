package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class widowhandleexample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newWindowButton = driver.findElement(By.id("windowButton"));
		newWindowButton.click();
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		Set <String> multiWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = multiWindowHandles.iterator();
		while(iterator.hasNext()) {
			String childWindow = iterator.next();
			if(!mainWindowHandle.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement newWindow = driver.findElement(By.id("sampleHeading"));
				System.out.println("Element found using text: " +newWindow.getText());
			}
		}
	}
}
	

	
	

	


