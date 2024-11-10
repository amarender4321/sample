package Scanario;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextForMobilesAmazon {
	
	WebDriver driver;
	@Test
	public void getTextForMobilesAmazon(){
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(800));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=hp+laptp&crid=36CBC7MQK91AS&sprefix=hp+laptp%2Caps%2C395&ref=nb_sb_noss_2");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
				wait.until(ExpectedConditions("//span[text()='₹1,14,990']"));
		String text = driver.findElement(By.xpath("//span[text()='₹1,14,990']")).getText();
		System.out.println(text);
		
	}
	private Function ExpectedConditions(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
