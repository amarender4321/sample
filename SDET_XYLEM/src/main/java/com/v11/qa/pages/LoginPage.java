package com.v11.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	


	WebDriver driver;


	@FindBy(css="input")
	private	WebElement emailAddressField;

	@FindBy(css="#input-password")
	private WebElement passwordFiled;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement emailPasswordNotMatchingWaring;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void enterEmailAddress(String emailText) {
		emailAddressField.sendKeys(emailText);
	}
	
	public void enterPassword(String passwordText) {
	passwordFiled.sendKeys(passwordText);
}
	public AccountPage clickClicOnLoginButton() {
		LoginButton.click();
		return new AccountPage(driver);
	}
	
	public AccountPage login(String emailText,String passwordText) {
		emailAddressField.sendKeys(emailText);
		passwordFiled.sendKeys(passwordText);
		LoginButton.click();
		return new AccountPage(driver);
		
	}
	



public String	retriveEmailPasswordNotMatchingWaringMessageText() {
String warningText	=emailPasswordNotMatchingWaring.getText();
return warningText;
}
	

}
