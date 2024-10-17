package testNGGrouping;

import org.testng.annotations.Test;

public class LoginByMethod {
	@Test(priority=1, groups= {"sanity"})
	void loginByEmail() {
		System.out.println("Logging in by Email..");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("Logging in by Facebook..");
	}
	@Test(priority=3, groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("Logging in by Twitter..");
	}

}
