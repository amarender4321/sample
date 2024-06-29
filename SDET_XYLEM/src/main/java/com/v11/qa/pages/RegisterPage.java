package com.v11.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	
	//Object
	@FindBy(css="#input-firstname")
	private WebElement firstNameFiled;
	
	@FindBy(css="#input-lastname")
	private WebElement lastNameFiled;
	
	@FindBy(css="#input-email")
	private WebElement emailAddressFiled;
	
	@FindBy(css="#input-telephone")
	private WebElement telephoneFiled;
	
	@FindBy(css="#input-password")
	private WebElement passwordFiled;
	
	@FindBy(css="#input-confirm")
	private WebElement passwordConfirmFiled;
	
	@FindBy(name="agree")
	private WebElement privacyPolicyFiled;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
    private WebElement yesNewsletterOption;
	
	@FindBy(css=".alert ")
	private WebElement duplicateEmailAddressWarning;
	
	@FindBy(css=".alert")
	private WebElement privacyPoicyWarning;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement fistNameWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameWarning;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailWaring;

	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneWaring;
	

	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordWaring;
	
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String retrievePasswordWarning() {
		String passwordWaringText = passwordWaring.getText();
		return passwordWaringText;
	}
	
	public String retrieveTelephoneWarning() {
		String telephoneWaringText = telephoneWaring.getText();
		return telephoneWaringText;
	}
	
	public String retrieveEmailWarning() {
		String emailWaringText = emailWaring.getText();
		return emailWaringText;
	}
	
	
	public String retrevieLastNameWarning() {
		String lasttNameWaringText = lastNameWarning.getText();
		return lasttNameWaringText;
	}
	
	public String retrevieFirstNameWarning() {
		String firstNameWaringText = fistNameWarning.getText();
		return firstNameWaringText;
	}
	
	public String retrievePrivacyPolicyWarning() {
		String privacyPoicyWarningText = privacyPoicyWarning.getText();
		return privacyPoicyWarningText;
	}
	//Actions methods
	public void enterFirstName(String fistNameText) {
		firstNameFiled.sendKeys(fistNameText);
	}
	
	public void enterLastName(String lastNameText) {
		lastNameFiled.sendKeys(lastNameText);
	}
	
	public void enterEmailAddress(String emailText) {
		emailAddressFiled.sendKeys(emailText);
	}
	
	public void enterTelephoneNumer(String telephoneText) {
		emailAddressFiled.sendKeys(telephoneText);
	}
	public void enterPassword(String passwordText) {
		passwordFiled.sendKeys(passwordText);	
	}
	public void enterConfirmPassword(String passwordText) {
		passwordConfirmFiled.sendKeys(passwordText);
	}
	
	public void selectPrivacyPolicy() {
		privacyPolicyFiled.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}

	public void seletYesNewsleterOption() {
		yesNewsletterOption.click();
	}
	public String retrieveDuplicateEmailAddressWarring() {
	String	duplicateEmailAddressWarningText	=	duplicateEmailAddressWarning.getText();
		return duplicateEmailAddressWarningText;
	}
	}

