package testngDemo;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=2)
	void open()
	{
	System.out.println("Opening the application");
	}
	@Test(priority=3)
   void login()
   {
	   System.out.println("Login the application");
   }
	@Test(priority=1)
   void logout()
   {
	   System.out.println("Logout the application");
   }
   
}
