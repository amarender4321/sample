package com.v11.qa.testcases;



import org.openqa.selenium.By;
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

public class Register  extends Base{

	WebDriver driver;
	HomePage homePage;
	AccountPage accountPage;
	RegisterPage registerPage;
	AccountSuccessPage accountSuccessPage;

	//public Properties prop;
	public Register()  {
		super();
	}

	@BeforeMethod
	public void setUp() {

		driver=initializeAndOpenApplicationURL(prop.getProperty("browserName"));
		homePage.clickOnMyAccount();
		homePage.selectRegisterOption();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority=1)
	public void  variyRegisteringAnAccountwithMandatoryFields() {

		registerPage.enterFirstName(dataProp.getProperty("firstName"));
		registerPage.enterLastName(dataProp.getProperty("lastName"));
		registerPage.enterEmailAddress(Utilities.qenerateEmailWithTimeStap());
		registerPage.enterTelephoneNumer(dataProp.getProperty("telephoneNumber"));
		registerPage.enterPassword(prop.getProperty("validPassword"));
		registerPage.enterConfirmPassword(prop.getProperty("validPassword"));
		registerPage.selectPrivacyPolicy();
		registerPage.clickOnContinueButton();
		String actualSuccessHeading = accountSuccessPage.retriveAccountSuccesPageHeading();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualSuccessHeading, dataProp.getProperty("accountSuccessfullyCreatedHeading"),"Your Account Has not Been Created!");

	}

	@Test(priority=2)
	public void verifyRegisteringAcountByProvidingAllFileds() {
		registerPage.enterFirstName(dataProp.getProperty("firstName"));
		registerPage.enterLastName(dataProp.getProperty("lastName"));
		registerPage.enterEmailAddress(Utilities.qenerateEmailWithTimeStap());
		registerPage.enterTelephoneNumer(dataProp.getProperty("telephoneNumber"));
		registerPage.enterPassword(prop.getProperty("validPassword"));
		registerPage.enterConfirmPassword(prop.getProperty("validPassword"));
		registerPage.seletYesNewsleterOption();
		registerPage.selectPrivacyPolicy();
		registerPage.clickOnContinueButton();
		String actualSuccessHeading = accountSuccessPage.retriveAccountSuccesPageHeading();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualSuccessHeading, dataProp.getProperty("accountSuccessfullyCreatedHeading"),"Your Account Has not Been Created!");

	}

	@Test(priority=3)
	public void verifyRegisteringAcountwithExistingEmail() {

		registerPage.enterFirstName(dataProp.getProperty("firstName"));
		registerPage.enterLastName(dataProp.getProperty("lastName"));
		registerPage.enterEmailAddress(dataProp.getProperty("validEmail"));
		registerPage.enterTelephoneNumer(dataProp.getProperty("telephoneNumber"));
		registerPage.enterPassword(prop.getProperty("validPassword"));
		registerPage.enterConfirmPassword(prop.getProperty("validPassword"));
		registerPage.seletYesNewsleterOption();
		registerPage.selectPrivacyPolicy();
		registerPage.clickOnContinueButton();
		String actualSuccessMessage = registerPage.retrieveDuplicateEmailAddressWarring();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualSuccessMessage, dataProp.getProperty("duplicateEmailWarning"),"Warning Message is not displayed");

	}

	@Test(priority=4)
	public void verifyRegistingAccountWithoutFillingDetails() {

		registerPage.clickOnContinueButton();


		String actualPrivacyPolicy = registerPage.retrievePrivacyPolicyWarning();
		SoftAssert sa0 = new SoftAssert();
		sa0.assertTrue(actualPrivacyPolicy.contains(dataProp.getProperty("privacyPolicyWarning")),"Privacy Policy Message is not displayed");


		String actualFirtNameMessage = registerPage.retrevieFirstNameWarning();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualFirtNameMessage, dataProp.getProperty("firstNameWarning"),"First Name Message is not displayed");


		String actualLastNameMessage = registerPage.retrevieLastNameWarning();
		SoftAssert sa1 = new SoftAssert();
		sa.assertEquals(actualLastNameMessage, dataProp.getProperty("lastNameWaring"),"Last Name Message is not displayed");


		String actualEmailMessage = registerPage.retrieveEmailWarning();
		SoftAssert sa2 = new SoftAssert();
		sa.assertEquals(actualEmailMessage, dataProp.getProperty("emailWarning"),"E-Mail Address is not displayed");


		String actualTeliponicMessage = registerPage.retrieveTelephoneWarning();
		SoftAssert sa3 = new SoftAssert();
		sa.assertEquals(actualTeliponicMessage, dataProp.getProperty("telephoneWaring"),"Teliphonic Number is not displayed");	


		String actualPasswordcMessage =registerPage.retrievePasswordWarning();
		SoftAssert sa4 = new SoftAssert();
		sa.assertEquals(actualPasswordcMessage, dataProp.getProperty("passwordWaring"),"Password Number is not displayed");	

	}
}
