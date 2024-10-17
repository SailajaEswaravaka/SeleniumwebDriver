package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	@Test(priority=1)
	void openApp()
	{
//	System.out.println("Opening the application");
	Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"openApp"})
   void login()
   {
	   //System.out.println("Login the application");
		Assert.assertTrue(true);
   }
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		//System.out.println("Searching the text...");
		Assert.assertTrue(true);
}
	@Test(priority=4, dependsOnMethods= {"login"})
	void Advsearch() {
		//System.out.println("Advanced search...");
		Assert.assertTrue(true);
}
	@Test(priority=5, dependsOnMethods= {"login"})
   void logout()
   {
	  // System.out.println("Logout the application");
		Assert.assertTrue(true);
   }
   
}


