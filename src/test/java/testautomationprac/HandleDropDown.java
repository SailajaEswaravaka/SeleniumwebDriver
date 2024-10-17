package testautomationprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		//Select dropDown = new Select(country);
		//dropDown.selectByVisibleText("France");
		//dropDown.selectByValue("brazil");
		//dropDown.selectByIndex(3);
		WebElement colors = driver.findElement(By.xpath("//select[@id ='colors']"));
		Select dropDown1 = new Select(colors);
		dropDown1.selectByValue("blue");
		List<WebElement> opt = dropDown1.getOptions();
		System.out.println("The number of colors: " +opt.size());
		System.out.println("List of all options: ");
		for(int i =0; i<opt.size(); i++) {
			System.out.println(opt.get(i).getText());
		//List<WebElement> options = dropDown.getOptions();
		//System.out.println("The number of options: " +options.size());
		//for(int i=0; i<options.size(); i++) {
		//	System.out.println("List of all options: " +options.get(i).getText());
		}

	}

}
