package com.selenium.practice.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selnium_Exceptions {
	
	@Test
	public void seleniumExceptions() {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, 10));
	
	//driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	//driver.get("https://omayo.blogspot.com/");
	
	//NoSuchElementException
	//driver.findElement(By.xpath("//input[@value='Loginxxx']")).click();
	
	//NoSuchWindowException
	//	driver.switchTo().window("abcd");
	
	//NoSuchFrameException
	//driver.switchTo().frame("abcd");
	
	//NoAlertPresentException
	//driver.switchTo().alert();
	
	//InvalidSelectorException
	//driver.findElement(By.xpath("///input[@value='Login']")).click();
	
	//ElementNotInteractableException
	//driver.get("https://omayo.blogspot.com/");
	//driver.findElement(By.id("hbutton")).click();
	
	//NoSuchSessionException
	driver.quit();
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
