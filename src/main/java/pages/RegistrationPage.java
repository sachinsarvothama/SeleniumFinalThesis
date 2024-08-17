package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegistrationPage extends TestBase {

	// ObjectRepository:
	@FindBy(name = "firstname")
	WebElement fname;

	@FindBy(name = "lastname")
	WebElement lname;

	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "telephone")
	WebElement phone;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirm")
	WebElement confirmPassword;
	
	@FindBy(name = "agree")
	WebElement privacyBtn;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement createaccount;

	// Initializing the Page Objects:
	public RegistrationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public HomePage validateRegistration(String fn, String ln, String eml, String tele, String pwd, String cpwd) throws IOException {
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		email.sendKeys(eml);
		phone.sendKeys(tele);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(cpwd);
		privacyBtn.click();
		createaccount.click();

		return new HomePage();
	}

}
