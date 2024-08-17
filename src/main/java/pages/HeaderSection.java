package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HeaderSection extends TestBase {

	// ObjectRepository:
	@FindBy(linkText = "My Account")
	WebElement myAccount;

	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(linkText = "Login")
	WebElement login;

	@FindBy(partialLinkText = "Wish List")
	WebElement wishlist;

	@FindBy(linkText = "Shopping Cart")
	WebElement shoppingCart;

	@FindBy(linkText = "Checkout")
	WebElement checkout;

	// Initializing the Page Objects:
	public HeaderSection() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public RegistrationPage clickOnRegister() throws IOException {
		myAccount.click();
		register.click();

		return new RegistrationPage();
	}
	
	public LoginPage clickOnLogin() throws IOException {
		myAccount.click();
		login.click();

		return new LoginPage();
	}

	public LoginPage clickOnWishlist() throws IOException {
		wishlist.click();

		return new LoginPage();
	}

	public ShoppingCartPage clickOnShoppingCart() throws IOException {
		shoppingCart.click();

		return new ShoppingCartPage();
	}

	public ShoppingCartPage clickOnCheckout() throws IOException {
		checkout.click();

		return new ShoppingCartPage();
	}
}
