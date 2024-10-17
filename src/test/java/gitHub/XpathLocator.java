package gitHub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		//WebElement signLinks = driver.findElement("//a[@href='login' or @href='Sign up']"));
		
		
		//WebElement searchInput = driver.findElement(By.xpath("//input[@name='query-builder-test']"));
		//System.out.println("Search Input placeholder: " +searchInput.getText());
		//WebElement exploreLink = driver.findElement(By.xpath("//h3[starts-with(text(), 'Explore']"));
		//System.out.println("Explore link text: " +exploreLink.getText());
		WebElement githubButton = driver.findElement(By.xpath("//a[text()='GitHub']"));
		System.out.println("GitHub button text: " +githubButton.getText());
		}
		

	}


