package daytwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String s = driver.getTitle();
		if(s.equals("Your Store")) {
			System.out.println("Test passed");
		}
			else
			{
				System.out.println("Failed");
		}
		driver.close();
	}
}
		

	


