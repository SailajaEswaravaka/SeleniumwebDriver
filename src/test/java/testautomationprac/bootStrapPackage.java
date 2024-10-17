package testautomationprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrapPackage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
        driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();
        List <WebElement> options = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        System.out.println("Number of options in drop down is: " +options.size());
       // driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
        
       for(WebElement opt : options) {
       	String option = opt.getText();
       	if(option.equals("Java")|| option.equals("Python") ||option.equals("MySQL"))
       	{
       opt.click();
       }
       }
	}
}
        	
        
	
	


