package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//1.Scrolling by using pixel;
		//js.executeScript("window.scrollBy(0,3000)","");
		
        //2.Scrolling the page till we find certain element
		//WebElement txt = driver.findElement(By.xpath("//*[text()=\"Blogger\"]"));
		//js.executeScript("arguments[0].scrollIntoView();", txt);
		
		//3.Scrolling page till bottom
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
	    //4. Set the zoom level
		//js.executeScript("document.body.style.zoom='50%'");
		
		//5. Scrolling up to initial position
		  js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	
	
	}
	
	

}
