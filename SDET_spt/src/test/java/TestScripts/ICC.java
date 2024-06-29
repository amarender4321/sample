package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICC {

	public static void main(String[] args) {
//		1. Open google
//	    2. Search for ICC
//	    3. open the ICC website
//	    4. go to Rankings -> Overview
//	    5. Check if Team India in Rank 1 or not
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().window().maximize();
		driver.get("https://www.cricketworldcup.com/");
		
	}

}
