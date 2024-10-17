package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
			// initialze webdriver instance
			WebDriver driver = new ChromeDriver();
			
			// Navigate to the url
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
			// Locate the Bank using xpath
			WebElement Bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
			
			// Locate the debitAccount using xpath
			WebElement debitAccount = driver.findElement(By.xpath("//ol[@id='bank'//li[@class='placeholder']"));
			Thread.sleep(3000);
			
			Actions obj = new Actions(driver);
			obj.dragAndDrop(Bank, debitAccount).perform();
			
			
			// Locate the Amount5000 using xpath
			WebElement Amount5000 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
			
			// Locate the debitAmount using xpath
			WebElement debitAmount = driver.findElement(By.xpath("//ol[@id='amt7'//li[@class='placeholder']"));
			Thread.sleep(3000);
			
			Actions obj1 = new Actions(driver);
			obj1.dragAndDrop(Amount5000, debitAmount).perform();
			
			
			// Locate the Loan using xpath
			WebElement sale = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
			
			// Locate the CreditAmount using xpath
			WebElement creditAccount = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
			Thread.sleep(3000);
			
			Actions obj2 = new Actions(driver);
			obj2.dragAndDrop(sale, creditAccount).perform();
			
			
			
			// Locate the loanamount5000 using xpath
			WebElement saleamount5000 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
			
			// Locate the creditAmount using xpath
			WebElement creditAmount = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
			Thread.sleep(3000);
			
			Actions obj3 = new Actions(driver);
			obj3.dragAndDrop(saleamount5000, creditAmount).perform();
			
			
			
			
			
		}
		
		
		

	}


