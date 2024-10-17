package hybridframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends OpenCart{
	public Homepage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement myAccount;
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement register;
		public void ClickOnAccount() {
			myAccount.click();
		}
		public void ClickOnRegister() {
			register.click();
	}
}


