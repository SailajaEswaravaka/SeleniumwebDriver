package testNGGrouping;

import org.testng.annotations.Test;

public class PaymentByMethod {
	@Test(priority=1, groups= {"sanity, regression"})
	void PaymentInRupees() {
		System.out.println("Payment in Rupees..");
	}
	@Test(priority=1, groups= {"sanity, regression"})
	void PaymentInDollars() {
		System.out.println("Payment in Dollars..");
	}
	

}
