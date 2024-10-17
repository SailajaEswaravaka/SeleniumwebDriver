package alertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
        //Thread.sleep(5000);
		//Alert myAlert = driver.switchTo().alert();
		//System.out.println(myAlert.getText());
		//myAlert.accept();
		//confirmation Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert secondAlert = driver.switchTo().alert();
		System.out.println(secondAlert.getText());
		secondAlert.dismiss();
		//Prompt Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert obj = driver.switchTo().alert();
		
		//obj.sendKeys("java");
		Thread.sleep(5000);
		//System.out.println(thirdAlert.getText());
		obj.accept();
	
	}

}
