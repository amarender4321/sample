package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCRanks {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.icc-cricket.com");
WebElement list = driver.findElement(By.xpath("a[text()[normalize-space()='Rankings']]"));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOf(list));
Actions a = new Actions(driver);
//System.out.println(list);
a.moveToElement(list).perform();
driver.quit();

	}

}
