package amazonSignin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_in {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     String title = driver.getTitle();
     System.out.println(title);
     
     //Using cssSelector tag[attribute ='value']
     driver.findElement(By.cssSelector("span[class='nav-line-2 ']")).click();
     
     //Using cssSelector tag#id
     driver.findElement(By.cssSelector("#ap_email")).sendKeys("abc@gmail.com");
     
     //Using cssSelector tag.class
     driver.findElement(By.cssSelector("input.a-button-input")).click();
     
     //Using cssSelector tag#id
     driver.findElement(By.cssSelector("#ap_password")).sendKeys("abcd");
    
     //Using cssSelector tag.class
     driver.findElement(By.cssSelector("input.a-button-input")).click();
	}

}
