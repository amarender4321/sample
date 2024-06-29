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


public class Search extends Base{
	
	public Search() {
		super();
		
	}

	WebDriver driver;
	HomePage homePage;
	SearchPage searchPage;
	//public Properties prop;

	@BeforeMethod
	public void setUp() {
		driver=initializeAndOpenApplicationURL(prop.getProperty("browserName"));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click(); 
	}

	@AfterMethod
	public void teatDown() {
		driver.quit();
	}

	@Test
	public void verifywithEexistingProduct(){

		homePage.enterProductIntoSearchBoxFiled(dataProp.getProperty("validProduct"));
		homePage.clickOnSearchButton();
		String actvalProduct = searchPage.retriveActuvalProduct();
		Assert.assertTrue(actvalProduct.contains("HP LP3065"), "Product Is Not Displayed");

	}
	
	@Test
	public void verifywithNonExistingProduct() {
		
		homePage.enterProductIntoSearchBoxFiled(dataProp.getProperty("invalidProduct"));
		homePage.clickOnSearchButton();
		String actvalSearchProduct =searchPage.retrieveNoProductMessageText();
		Assert.assertTrue(actvalSearchProduct.contains(dataProp.getProperty("noProductTextInSearchResults")) ,"There is  product  search message is not displayed");
	}
	
	@Test
	public void verifySearchingWithoutProvidingAnyProduct() {
		driver.findElement(By.cssSelector("#search input")).sendKeys("");
		homePage.clickOnSearchButton();
		String actvalSearchProduct =searchPage.retrieveNoProductMessageText();
		Assert.assertTrue(actvalSearchProduct.contains(dataProp.getProperty("noProductTextInSearchResults")) ,"There is  product  search message is not displayed");;
	}



}
