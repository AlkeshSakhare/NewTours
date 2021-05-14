package com.demoaut.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoaut.newtours.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement registerlink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public RegistrationPage gotoRegisterLink() {
		registerlink.click();
		return new RegistrationPage();
	}
}
