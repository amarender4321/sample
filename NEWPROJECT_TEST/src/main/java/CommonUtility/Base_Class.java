package CommonUtility;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	static WebDriver driver;
	WebDriverManager.chromedriver().setup();

}
