package Scanario;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyPageLoadTime {

	@Test
public void	verifyPageLoadTime() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	try {
		driver.findElement(By.className("_aa48")).sendKeys("reddyamrender");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("amarender@insta");
		System.out.println("Page is loaded within in 5 seconds");
	}
	catch(Exception e){
		System.out.println("Page is not loaded within 5 seconds");
	}
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	driver.findElement(By.xpath("//div[text()='Not now']")).click();
	driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	
	driver.quit();
}
}
