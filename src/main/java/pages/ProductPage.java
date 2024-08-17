package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ProductPage extends TestBase {

	// ObjectRepository:
	@FindBy(xpath = "//*[@id='content']/div[4]/div[6]/div/div[2]/div[2]/button[1]") 
	WebElement product1;

	// Initializing the Page Objects:
	public ProductPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public ShoppingCartPage validateProductSelection() throws IOException {
		product1.click();

		return new ShoppingCartPage();
	}

}
