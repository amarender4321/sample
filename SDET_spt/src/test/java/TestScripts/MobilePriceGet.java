package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePriceGet {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[text()='✕']")).click();
//findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
Actions a= new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//div[text()='Fashion']"))).perform();


	}

}
