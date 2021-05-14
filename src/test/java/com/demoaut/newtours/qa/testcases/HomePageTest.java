package com.demoaut.newtours.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoaut.newtours.qa.base.TestBase;
import com.demoaut.newtours.qa.pages.HomePage;
import com.demoaut.newtours.qa.pages.RegistrationPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	RegistrationPage registrationPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}

	@Test
	public void testMethod() {
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
