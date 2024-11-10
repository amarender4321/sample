package com.v11.qa.testcases;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.v11.qa.base.Base;
import com.v11.qa.pages.AccountPage;
import com.v11.qa.pages.AccountSuccessPage;
import com.v11.qa.pages.HomePage;
import com.v11.qa.pages.RegisterPage;
import com.v11.qa.utils.Utilities;

public class RegisterTest  extends Base{

	WebDriver driver;
	HomePage homePage;
	AccountPage accountPage;
	RegisterPage registerPage;
	AccountSuccessPage accountSuccessPage;
	SoftAssert sa;
	//public Properties prop;
	
	public RegisterTest()  {
		super();
	}

	@BeforeMethod
	public void setUp() {

		driver=initializeAndOpenApplicationURL(prop.getProperty("browserName"));
		homePage.naviageToRegisterPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority=1)
	public void  variyRegisteringAnAccountwithMandatoryFields() {

		registerPage.registerWithMandatoryFields(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), Utilities.qenerateEmailWithTimeStap(), dataProp.getProperty("telephoneNumber"), prop.getProperty("validPassword"));
		sa.assertEquals(accountSuccessPage.retriveAccountSuccesPageHeading(), dataProp.getProperty("accountSuccessfullyCreatedHeading"),"Your Account Has not Been Created!");

	}

	@Test(priority=2)
	public void verifyRegisteringAcountByProvidingAllFileds() {
		registerPage.registerWithAllFields(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), Utilities.qenerateEmailWithTimeStap(), dataProp.getProperty("telephoneNumber"), prop.getProperty("validPassword"));
		sa.assertEquals(accountSuccessPage.retriveAccountSuccesPageHeading(), dataProp.getProperty("accountSuccessfullyCreatedHeading"),"Your Account Has not Been Created!");

	}

	@Test(priority=3)
	public void verifyRegisteringAcountwithExistingEmail() {

		registerPage.registerWithAllFields(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"),dataProp.getProperty("validEmail"), dataProp.getProperty("telephoneNumber"), prop.getProperty("validPassword"));
		sa.assertEquals(registerPage.retrieveDuplicateEmailAddressWarring(), dataProp.getProperty("duplicateEmailWarning"),"Warning Message is not displayed");

	}

	@Test(priority=4)
	public void verifyRegistingAccountWithoutFillingDetails() {
		
		
		registerPage.clickOnContinueButton();
		sa.assertTrue(registerPage.displayStatusOfWarningMessages(dataProp.getProperty("privacyPolicyWarning"), dataProp.getProperty("firstNameWarning"),dataProp.getProperty("lastNameWaring"), dataProp.getProperty("emailWarning"), dataProp.getProperty("telephoneWaring"), dataProp.getProperty("passwordWaring")));


	}
}
