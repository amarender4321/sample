package com.selenium.practice.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	@Test
	public void fileUpload() {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, 10));
	driver.get("https://omayo.blogspot.com/");
	
	//local file upload
	//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\Narender Reddy\\Downloads\\flower.jpg");
	
	//uploading file from work space
	String projectPath=System.getProperty("user.dir");
	driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"\\Files\\flower.jpg");
	driver.quit();
	}

}
