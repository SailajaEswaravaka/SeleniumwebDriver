package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mediamarkt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mediamarkt.nl/");
		driver.manage().window().maximize();
		//select cookies
		driver.findElement(By.xpath("//button[text()=\"Alles accepteren\"]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@aria-label=\"Alle categorieën\"]")).click();
	    Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[@aria-label=\"Tv\"][1]"))).build().perform();
	    driver.findElement(By.xpath("//span[text()=\"Televisie-aanbiedingen\"][1]")).click(); 
	    driver.findElement(By.xpath("//img[@alt=\"SAMSUNG The Frame 65LS03B (2023)\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='sc-1dea8331-3 gUaNOh']//span[@class='sc-ad0ca069-0 ewEseA']")).click();
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("/div[@class='sc-3355cb52-0 cFBotR'][1]")).click();
	    driver.findElement(By.xpath("//button[text()=\"Nee, dank je\"]")).click();
	}

}
