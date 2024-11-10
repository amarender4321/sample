package com.v11.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	//Objects
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;

	@FindBy(linkText="Login")
	private WebElement LoginOption;

	@FindBy(linkText="Register")	
	private	WebElement registerOption;
	
	@FindBy(css="#search input")
	private WebElement searchBoxFiled;
	
	@FindBy(xpath="#search button")
	private WebElement searchButton;

	public HomePage(WebDriver driver) {

		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	//Actions
	
	public void clickOnSearchButton() {
		searchButton.click();
		
	}
	public void enterProductIntoSearchBoxFiled(String productText) {
		searchBoxFiled.sendKeys(productText);
	}
	
	public SearchPage searchForButton(String productText) {
		searchBoxFiled.sendKeys(productText);
		searchButton.click();
		return new SearchPage(driver);
	}
	public void clickOnMyAccount() {
		myAccountDropMenu.click();
	}

	public void selectLoginOptions() {
		LoginOption.click();
	}
	
	
	public void naviageToLoginPage() {
		myAccountDropMenu.click();
		LoginOption.click();
	}
	public RegisterPage naviageToRegisterPage() {
		searchButton.click();
		registerOption.click();
		return new RegisterPage(driver);
	}
	public RegisterPage selectRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}
}