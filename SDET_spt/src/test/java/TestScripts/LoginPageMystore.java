package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageMystore {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://automationpractice.pl/index.php");
driver.findElement(By.xpath("//a[@class='login']")).click();
driver.findElement(By.id("email")).sendKeys("amarender36ba@gmail.com");

 

	}

}
