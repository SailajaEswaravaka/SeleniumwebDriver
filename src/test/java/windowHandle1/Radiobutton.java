package windowHandle1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Radiobutton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='gender-female']"));
		femaleRadioButton.click();
		// Check if either of the radio buttons is selected
		Boolean isMaleSelected = maleRadioButton.isSelected();
		Boolean isfemaleSelected = femaleRadioButton.isSelected();
		// Display the results
		System.out.println("Is male Selected? " +isMaleSelected);
		System.out.println("Is female Selected? " +isfemaleSelected);
		//driver.close();
		//Optionally, display if either is selected
        //boolean isEitherSelected = isMaleSelected || isfemaleSelected;
        //System.out.println("Is either Male or Female selected? " + isEitherSelected);
		
	}

}
