package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutPage extends TestBase {

	// ObjectRepository:
	@FindBy(linkText = "Checkout")
	WebElement checkoutBtn;
	
	@FindBy(xpath = "//*[@id='button-payment-address']")
	WebElement addressContBtn;

	@FindBy(xpath = "//*[@id='button-shipping-address']")
	WebElement addressConfirmContBtn;
	
	@FindBy(xpath = "//*[@id='button-shipping-method']")
	WebElement shipContBtn;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement paymentCheckBox;
	
	@FindBy(xpath = "//*[@id='button-payment-method']")
	WebElement payContBtn;
	
	@FindBy(xpath = "//*[@id='button-confirm']")
	WebElement orderConfirmBtn;
	
	// Initializing the Page Objects:
	public CheckoutPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public HomePage validateOrder() throws IOException {
		checkoutBtn.click();
		addressContBtn.click();
		addressConfirmContBtn.click();
		shipContBtn.click();
		paymentCheckBox.click();
		payContBtn.click();
		orderConfirmBtn.click();
		
		return new HomePage();
	}

}