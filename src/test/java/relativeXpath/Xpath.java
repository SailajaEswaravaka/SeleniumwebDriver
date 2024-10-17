package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Xpath using "Or" Xpath-Finds elements where at least one condition is true.
		//WebElement element = driver.findElement(By.xpath("//a[@id='nav-orders' or @id='nav-cart']"));
		//System.out.println("Element text: " +element.getText());
		//Xpath using "And" method-Finds elements where both conditions are true.
		//WebElement element = driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
		//System.out.println("Element Text: " +element.getAttribute("value"));
		//Xpath using "starts-with"-Finds elements where an attribute value starts with a specific prefix.
		//WebElement element = driver.findElement(By.xpath("//a[starts-with(@id, 'nav-link-accountList')]"));
		//System.out.println("Element Text: " +element.getText());
		//Xpath using text()-find elements with exact text.
		WebElement element = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		System.out.println("Element Text: " +element.getText());
		driver.close();
		
	}

}
