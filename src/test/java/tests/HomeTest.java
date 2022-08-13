package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

	HomePage hp;
	
	@BeforeClass
	public void HomeObject() {
		hp = new HomePage(driver);
	}
	@Test (priority=1)
	public void Verify2() {
		hp.Verify1();
	}
	
	@Test (priority=2)
	public void Logout2() {
		hp.Logout1();
	}
	@Test (priority=4)
	public void empty() {
		System.out.println("logout done");
	}
	@Test (priority=5)
	public void empty1() {
		System.out.println("test done");
		
	}
	
	}
