package checkBoxes;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement monday = driver.findElement(By.xpath("//input[@id = 'monday']"));
		//monday.click();
		List<WebElement> weeks = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        //weeks.click();
		//Checking all checkboxes
		//for(int i=0; i<weeks.size(); i++) {
		//	weeks.get(i).click();
		//}
		//Checking last three checkboxes
		for(int i=0; i < weeks.size(); i++) {
			weeks.get(i).click();
		}
		
		
	}

}
