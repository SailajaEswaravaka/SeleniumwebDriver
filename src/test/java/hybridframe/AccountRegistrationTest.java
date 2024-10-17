package hybridframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationTest extends OpenCart{
	public AccountRegistrationTest(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement LastName;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement Telephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement ConfPassword;
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkbox;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement Continue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created']")
	WebElement MsgConf;
	
	public void setFirstName(String fName){
		firstName.sendKeys(fName);
	}
	public void setLastName(String lName){
		LastName.sendKeys(lName);
	}
	public void setEmail(String email){
		Email.sendKeys(email);
	}
	public void setTelephone(String telephone){
		Telephone.sendKeys(telephone);
	}
	public void setPassword(String password){
		Password.sendKeys(password);
	}
	public void setConfPassword(String confPassword){
		ConfPassword.sendKeys(confPassword);
	}
	public void setPrivacyPolicy(){
		checkbox.click();
	}
	public void setContinue(){
		Continue.click();
}
	public void setMsgConf(){
		MsgConf.click();
	}
	public String getConfirmationMsg() {
		try {
			return (MsgConf.getText());
		}
		catch (Exception e) {
			return (e.getMessage());
		}
			
		
	}
}
	

	


		


