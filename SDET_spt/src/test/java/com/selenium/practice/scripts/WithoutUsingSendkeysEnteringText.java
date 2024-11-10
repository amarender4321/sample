package com.selenium.practice.scripts;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutUsingSendkeysEnteringText {

@Test
	public void withoutUsingSendkeysEnteringText() {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, 10));
	driver.get("http://tutorialsninja.com/demo");
	
	WebElement searchBox = driver.findElement(By.name("search"));
	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='Imac'",searchBox);
	driver.quit();
	}

}
