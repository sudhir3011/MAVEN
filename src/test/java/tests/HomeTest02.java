package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage02;



public class HomeTest02 extends BaseTest{

	SoftAssert sa;
HomePage02 hp;

	
	@BeforeClass
	public void HomeObject() {
		sa = new SoftAssert();
		hp = new HomePage02(driver);
	}
	
	@Test (priority=1)
	public void Verify2() {
		hp.Verify1();
		sa.assertTrue(true);
		sa.assertAll();
	}
	
	@Test (priority=2)
	public void Profile2() {
		hp.Profile1();
	}
	
	@Test (priority=3)
	public void Logout2() {
		hp.Logout1();
	}
}
