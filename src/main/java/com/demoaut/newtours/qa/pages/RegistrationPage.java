package com.demoaut.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoaut.newtours.qa.base.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "userName")
	WebElement emailId;

	@FindBy(name = "address1")
	WebElement address1;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "postalCode")
	WebElement postalCode;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(name = "email")
	WebElement UserName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//b[contains(text(),'Dear')]")
	WebElement newUserName;

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void registerUser(String fName, String lName, String phn, String email, String add1,
			String cityadd, String stateadd, String postaladd, String countryName, String uName, String pass,
			String passConfirm) {

		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		phone.sendKeys(phn);
		emailId.sendKeys(email);
		address1.sendKeys(add1);
		city.sendKeys(cityadd);
		state.sendKeys(stateadd);
		postalCode.sendKeys(postaladd);
		Select courntryDropDown = new Select(country);
		courntryDropDown.selectByVisibleText(countryName);
		UserName.sendKeys(uName);
		password.sendKeys(pass);
		confirmPassword.sendKeys(passConfirm);
		submitBtn.click();
		System.out.println(newUserName.getText().toString());
	}

}
