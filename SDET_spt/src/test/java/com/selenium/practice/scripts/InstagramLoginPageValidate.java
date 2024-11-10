package com.selenium.practice.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramLoginPageValidate {
	
	@Test
		public void loginInstagram() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordInput=	driver.findElement(By.xpath("//input[name='password']"));
		
		usernameInput.sendKeys("reddyamrender");
		passwordInput.sendKeys("amarender@insta");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		 System.out.println("Login attempt completed.");
		 driver.close();
		}
	}


