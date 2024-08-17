package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HeaderSection;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ShoppingCartPage;

public class ProductPageTest extends TestBase {
	HeaderSection headerSection;
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	ShoppingCartPage shoppingCartPage;
	
	public ProductPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		headerSection = new HeaderSection();
		loginPage = headerSection.clickOnLogin();
		homePage = loginPage.validateLogin(config.getProperty("username"), config.getProperty("password"));
		productPage = homePage.validateMenu1();
		
	}
	
	@Test(priority=1)
	public void validateProductSelectionTest() throws IOException, InterruptedException {
		shoppingCartPage = productPage.validateProductSelection();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}