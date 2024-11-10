package Scanario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrlPresentAddressBar {
	
	@Test
	public void getUrlPrsentAddressBar(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String eUrl= "https://www.google.com/";
		String cUrl=driver.getCurrentUrl();
		if(cUrl.equals(eUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
