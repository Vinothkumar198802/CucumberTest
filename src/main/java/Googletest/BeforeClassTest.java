package Googletest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassTest {
	@BeforeClass
	public void logindb()
	{
		System.out.println("logindb");
	}
	@AfterClass
	public void logoutdb()
	{
		System.out.println("logoutdb");
	}
	@BeforeMethod
	public void openbrowser()
	{
		System.err.println("open browser");
	}
	@AfterMethod
	public void closebrowser()
	{
		System.err.println("close browser");
	}
	@Test(priority=1)
	public void logintest() {
		System.out.println("LoginTest Completed");
	}

	@Test(priority=2,enabled=false)
	public void regtest() {
		System.out.println("RegistrationTest Completed");
	}

	@Test(priority=3)
	public void bookingtest() {
		System.out.println("BookingTest Completed");
	}

	@Test(priority=4)
	public void canceltest() {
		System.out.println("CancelTest Completed");
	}

	
	
}
