package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase {

	// ObjectRepository:
	@FindBy(xpath = "//*[@id='cart']/button") 
	WebElement viewCart;

	// Initializing the Page Objects:
	public ShoppingCartPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public CheckoutPage validateShoppingCart() throws IOException {
		viewCart.click();
		return new CheckoutPage();
	}
}
