package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import hybridframe.AccountRegistrationTest;
import hybridframe.Homepage;

public class TC001_AccountRegistration {
	public WebDriver driver;
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/studyopedia/");
		driver.manage().window().maximize();
	}
		@AfterClass
		public void closeWindlow() {
		driver.quit();
		}
		
		public void verifyAcctRegistration() {
			Homepage hp = new Homepage(driver); 
			hp.ClickOnAccount();
			hp.ClickOnRegister();
			AccountRegistrationTest reg = new AccountRegistrationTest(driver);
			reg.setFirstName("Priti");
			reg.setLastName("Ashritha");
			reg.setEmail("abc@gmail.com");
			reg.setTelephone("113345566");
			reg.setPassword("admin");
			reg.setConfPassword("admin");
			reg.setPrivacyPolicy();
			reg.setContinue();
			reg.setMsgConf();
			String confmsg = reg.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created");
			
		}
			
		}
		
	
	


