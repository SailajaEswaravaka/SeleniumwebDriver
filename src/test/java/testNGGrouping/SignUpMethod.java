package testNGGrouping;

import org.testng.annotations.Test;

public class SignUpMethod {
	@Test(priority=1, groups= {"regression"})
	void SignupByEmail() {
		System.out.println("Signup by Email..");
	}
	@Test(priority=2, groups= {"regression"})
	void SignupByFacebook() {
		System.out.println("Signup by Facebook..");
	}
	@Test(priority=3, groups= {"regression"})
	void SignupByTwitter() {
		System.out.println("Signup by Twitter..");
	}

}
