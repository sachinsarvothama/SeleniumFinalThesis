package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HeaderSection;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginPageTest extends TestBase {
	HeaderSection headerSection;
	LoginPage loginPage;
	HomePage homePage;
	RegistrationPage registerPage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		headerSection = new HeaderSection();
		loginPage = headerSection.clickOnLogin();
	}
		
	@Test(priority=1)
	public void validLoginTest() throws IOException {
		homePage = loginPage.validateLogin("freemail@mailinator.com", "B6N@D2wMaJ6by6x");
	}
	
	@Test(priority=2)
	public void invalidLoginTest1() throws IOException {
		homePage = loginPage.validateLogin("testmail@mailinator.com", "invalid");
	}
	
	@Test(priority=3)
	public void invalidLoginTest2() throws IOException {
		homePage = loginPage.validateLogin("invalid@mailinator.com", "Test@123");
	}
	
	@Test(priority=4)
	public void invalidLoginTest3() throws IOException {
		homePage = loginPage.validateLogin("invalid@mailinator.com", "invalid");
	}
	
	@Test(priority=5)
	public void newCustomerRegisterTest() throws IOException {
		registerPage = loginPage.validateNewCustomerBtn();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
