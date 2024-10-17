package windowHandle;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
public class windowHandlesAssign {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
    	driver.manage().window().maximize();
    	String parentHandle = driver.getWindowHandle();
    	System.out.println("Parent window: " +parentHandle);
		driver.findElement(By.id("windowButton")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			System.out.println(handle);
		}
		Thread.sleep(2000);
		//driver.quit();
		
	    //newtab.click();
		//driver.close();

	}

}
