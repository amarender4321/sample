package com.v11.qa.testcases;

import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.v11.qa.base.Base2;

public class Login2 extends Base2{

	
	WebDriver driver;
	public Properties prop;
	public Login2()  {
		super();
	}
	
	
 @BeforeMethod
 public void setup() {
	 driver=initializeAndOpenApplicationURL();
		//driver=initializeAndOpenApplicationURL(prop.getProperty("browserName"));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click(); 
 }

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority=1)
	public void verifyLoginWithValidCredentials() throws InterruptedException {

	//	driver.findElement(By.cssSelector("#input-email")).sendKeys(prop.getProperty("validEmail"));
	//	driver.findElement(By.cssSelector("#input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("#input-email")).sendKeys(Base2.validEmail);

		driver.findElement(By.cssSelector("#input-password")).sendKeys(Base2.validPassword);

		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed(),"Edit your acount information is not displayed");

	}

	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials() throws InterruptedException {

		driver.findElement(By.cssSelector("#input-email")).sendKeys("amarender9846"+generateTimeStamp()+"@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("automation2");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actvalWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWaringMessage="Warning: No match for E-Mail Address and/or Password";
		Assert.assertTrue(actvalWarningMessage.contains(expectedWaringMessage),"Expected Warning Message Is not Displayed");

	}
	public String generateTimeStamp(){

		Date date = new Date();
		return date.toString().replace(" ","_").replace(":","_");
	}

	@Test(priority=3)
	public void verifyLoginWithInvalidEmailAndValidPassword() throws InterruptedException {

		driver.findElement(By.cssSelector("#input-email")).sendKeys("amarender9846"+generateTimeStamp()+"@gmail.com");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("#input-password")).sendKeys(Base2.validPassword);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actvalWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWaringMessage="Warning: No match for E-Mail Address and/or Password";
		Assert.assertTrue(actvalWarningMessage.contains(expectedWaringMessage),"Expected Warning Message Is not Displayed");

	}
	@Test(priority=4)
	public void verifyLoginWithInvalidPasswordAndValidEmail() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("amarender9846"+generateTimeStamp()+"@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("#input-password")).sendKeys(Base2.validPassword);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actvalWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWaringMessage="Warning: No match for E-Mail Address and/or Password";
		Assert.assertTrue(actvalWarningMessage.contains(expectedWaringMessage),"Expected Warning Message Is not Displayed");

	}

	@Test(priority=5)
	public void verifyLoginWithoutProvidingCredential() throws InterruptedException {

		driver.findElement(By.cssSelector("#input-email")).sendKeys("");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actvalWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWaringMessage="Warning: No match for E-Mail Address and/or Password";
		Assert.assertTrue(actvalWarningMessage.contains(expectedWaringMessage),"Expected Warning Message Is not Displayed");

	}
}