package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HeaderSection;
import pages.HomePage;
import pages.RegistrationPage;

public class RegistrationPageTest extends TestBase {
	HeaderSection headerSection;
	RegistrationPage registrationPage;
	HomePage homePage;
	
	public RegistrationPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		headerSection = new HeaderSection();
		registrationPage = headerSection.clickOnRegister();
	}
	
	@Test(priority=1)
	public void validRegistrationTest() throws IOException, InterruptedException {
		homePage = registrationPage.validateRegistration("Test","Test","test@test.com","1234567890","Test@123","Test@123");
	}
	
	@Test(priority=2)
	public void invalidRegistrationTest() throws IOException, InterruptedException {
		homePage = registrationPage.validateRegistration("!@#$%^&","!@#$%","xyz.com","!@#$%^&","123","456");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
