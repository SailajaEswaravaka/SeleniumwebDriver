package demoStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#email")).sendKeys("sailaja.eswaravaka@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("sailaja.eswaravaka@gmail.com");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sailaja.eswaravaka@gmail.com");
		//driver.findElement(By.cssSelector("input.inputtext_55r1_6luy[placeholder='Email or phone number']")).sendKeys("ABC");
		//driver.findElement(By.cssSelector("input.inputtext[name='email']")).sendKeys("ABC");

	}

}
