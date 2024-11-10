package com.v11.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.v11.qa.base.Base;
import com.v11.qa.pages.HomePage;
import com.v11.qa.pages.SearchPage;


public class SearchTest extends Base{

	public SearchTest() {
		super();	
	}

	WebDriver driver;
	HomePage homePage;
	SearchPage searchPage;
	//public Properties prop;

	@BeforeMethod
	public void setUp() {
		driver=initializeAndOpenApplicationURL(prop.getProperty("browserName"));
		homePage.naviageToLoginPage();
		homePage=new HomePage(driver);
		searchPage= new SearchPage(driver);
	}

	@AfterMethod
	public void teatDown() {
		driver.quit();
	}

	@Test
	public void verifywithEexistingProduct(){

		searchPage	=homePage.searchForButton(dataProp.getProperty("validProduct"));
		Assert.assertTrue(searchPage.retriveActuvalProduct().contains("HP LP3065"), "Product Is Not Displayed");
	}

	@Test
	public void verifywithNonExistingProduct() {

		searchPage=	homePage.searchForButton(dataProp.getProperty("invalidProduct"));
		Assert.assertTrue(searchPage.retrieveNoProductMessageText().contains(dataProp.getProperty("noProductTextInSearchResults")) ,"There is  product  search message is not displayed");
	}

	@Test
	public void verifySearchingWithoutProvidingAnyProduct() {
		driver.findElement(By.cssSelector("#search input")).sendKeys("");
		homePage.clickOnSearchButton();
		Assert.assertTrue(searchPage.retrieveNoProductMessageText().contains(dataProp.getProperty("noProductTextInSearchResults")) ,"There is  product  search message is not displayed");;
	}
}
