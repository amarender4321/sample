package com.v11.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	
	WebDriver driver;
	@FindBy(linkText = "Edit your account information")
	private WebElement  editYourAcountInformationoption;
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean boogetDisplayStatusOfEditYourAccountInformationOption(){
	 boolean displayStatus = editYourAcountInformationoption.isDisplayed();
		return displayStatus;
		
	}

}
