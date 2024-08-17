package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckoutPage;
import pages.HeaderSection;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ShoppingCartPage;

public class CheckoutPageTest extends TestBase {
	HeaderSection headerSection;
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	ShoppingCartPage shoppingCartPage;
	CheckoutPage checkoutPage;
	
	public CheckoutPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		headerSection = new HeaderSection();
		loginPage = headerSection.clickOnLogin();
		homePage = loginPage.validateLogin(config.getProperty("username"), config.getProperty("password"));
		productPage = homePage.validateMenu1();
		shoppingCartPage = productPage.validateProductSelection();
		checkoutPage = shoppingCartPage.validateShoppingCart();
		
	}
	
	@Test(priority=1)
	public void validateSuccessfulOrderTest() throws IOException, InterruptedException {
		homePage = checkoutPage.validateOrder();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
