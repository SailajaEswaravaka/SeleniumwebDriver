package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		//Drag and drop Oslo to Norway
		WebElement source1 = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id=\"box101\"]"));
		a.dragAndDrop(source1, target1).build().perform();
		////Drag and drop Stockholm to Sweden
		WebElement source2 = driver.findElement(By.xpath("//div[@id=\"box2\"]"));
		WebElement target2= driver.findElement(By.xpath("//div[@id=\"box102\"]"));
		a.dragAndDrop(source2, target2).build().perform();
		//Washington to USA
		WebElement source3 = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		WebElement target3= driver.findElement(By.xpath("//div[@id=\"box103\"]"));
		a.dragAndDrop(source3, target3).build().perform();
		//Seoul to South Korea
		WebElement source4 = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
		WebElement target4= driver.findElement(By.xpath("//div[@id=\"box105\"]"));
		a.dragAndDrop(source4, target4).build().perform();
		//Copenhagen to Denmark
		WebElement source5 = driver.findElement(By.xpath("//div[@id=\"box4\"]"));
		WebElement target5= driver.findElement(By.xpath("//div[@id=\"box104\"]"));
		a.dragAndDrop(source5, target5).build().perform();
		//Rome to Italy
		WebElement source6 = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		WebElement target6= driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		a.dragAndDrop(source6, target6).build().perform();
		//Madrid to Spain
		WebElement source7 = driver.findElement(By.xpath("//div[@id=\"box7\"]"));
		WebElement target7= driver.findElement(By.xpath("//div[@id=\"box107\"]"));
		a.dragAndDrop(source7, target7).build().perform();
		driver.quit();

	}

}
