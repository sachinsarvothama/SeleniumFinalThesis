package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	// ObjectRepository:
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(linkText = "Forgotten Password")
	WebElement forgotPassword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(linkText = "Continue")
	WebElement newCustomer;

	// Initializing the Page Objects:
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public HomePage validateLogin(String un, String pw) throws IOException {
		email.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();

		return new HomePage();
	}

	public RegistrationPage validateNewCustomerBtn() throws IOException {
		newCustomer.click();

		return new RegistrationPage();
	}

}
