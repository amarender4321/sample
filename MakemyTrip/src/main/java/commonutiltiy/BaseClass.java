package commonutiltiy;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	

WebDriver driver;
@BeforeClass
public void openBrowser(String url){
	WebDriverManager.chromedriver().setup();
	driver =

}
