package com.v11.qa.testcases;

import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.v11.qa.base.Base;
import com.v11.qa.pages.AccountPage;
import com.v11.qa.pages.HomePage;
import com.v11.qa.pages.LoginPage;
import com.v11.qa.utils.Utilities;

public class LoginTest extends Base{

	HomePage homePage;
	LoginPage loginPage;
	AccountPage accountPage;
	WebDriver driver;
	public LoginTest()  {
		super();
	}

	@BeforeMethod
	public void setup() {
		// driver=initializeAndOpenApplicationURL();

		driver=initializeAndOpenApplicationURL(prop.getProperty("browserName"));
		homePage.naviageToLoginPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority=1)//,dataProvider = "validCredentialSupplier"
	public void verifyLoginWithValidCredentials(String email, String password) throws InterruptedException {

		loginPage.login(email, password);
		Assert.assertTrue(accountPage.boogetDisplayStatusOfEditYourAccountInformationOption());

	}

	//	@DataProvider(name="validCredentialSupplier")
	//	public Object[][] supplyTestData(){
	//
	//		Object[][] data=Utilities.getTextDataFromExcel("Login");
	//		return data;
	//
	//	}

	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials() throws InterruptedException {

		loginPage.login(Utilities.qenerateEmailWithTimeStap(), "invalidPasword");
		Assert.assertTrue(loginPage.retriveEmailPasswordNotMatchingWaringMessageText().contains(dataProp.getProperty("emailPasswordNoMatchwarning")),"Expected Warning Message Is not Displayed");
	}
	public String generateTimeStamp(){

		Date date = new Date();
		return date.toString().replace(" ","_").replace(":","_");
	}

	@Test(priority=3)
	public void verifyLoginWithInvalidEmailAndValidPassword() throws InterruptedException {

		loginPage.login(Utilities.qenerateEmailWithTimeStap(), "validPassword");
		Assert.assertTrue(loginPage.retriveEmailPasswordNotMatchingWaringMessageText().contains(dataProp.getProperty("emailPasswordNoMatchwarning")),"Expected Warning Message Is not Displayed");
	}
	
	@Test(priority=4)
	public void verifyLoginWithInvalidPasswordAndValidEmail() throws InterruptedException {

		loginPage.login(Utilities.qenerateEmailWithTimeStap(), "validPassword");
		Assert.assertTrue(loginPage.retriveEmailPasswordNotMatchingWaringMessageText().contains(dataProp.getProperty("emailPasswordNoMatchwarning")),"Expected Warning Message Is not Displayed");

	}

	@Test(priority=5)
	public void verifyLoginWithoutProvidingCredential() throws InterruptedException {

		//		driver.findElement(By.cssSelector("#input-email")).sendKeys("");
		//		driver.findElement(By.cssSelector("#input-password")).sendKeys("");
		loginPage.clickClicOnLoginButton();
		Assert.assertTrue(loginPage.retriveEmailPasswordNotMatchingWaringMessageText().contains(dataProp.getProperty("emailPasswordNoMatchwarning")),"Expected Warning Message Is not Displayed");

	}
}