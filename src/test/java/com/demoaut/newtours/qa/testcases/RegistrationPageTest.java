package com.demoaut.newtours.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoaut.newtours.qa.base.TestBase;
import com.demoaut.newtours.qa.pages.HomePage;
import com.demoaut.newtours.qa.pages.RegistrationPage;
import com.demoaut.newtours.qa.util.TestUtil;

public class RegistrationPageTest extends TestBase {

	HomePage homePage;
	RegistrationPage registrationPage;

	public RegistrationPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		registrationPage = homePage.gotoRegisterLink();
	}

	@DataProvider
	public Object[][] getRegisterData() {
		Object data[][] = TestUtil.getTestData("Register");
		System.out.println("Data-->" + data);
		return data;
	}

	@Test(dataProvider = "getRegisterData")
	public void testMethod(String fName, String lName, String phn, String email, String add1,
			String cityadd, String stateadd, String postaladd, String countryName, String uName, String pass,
			String passConfirm) {

		registrationPage.registerUser(fName, lName, phn, email, add1, cityadd, stateadd, postaladd, countryName,
				uName, pass, passConfirm);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
