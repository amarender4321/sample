package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
WebElement store = driver.findElement(By.xpath("//input[@class='_3704LK']"));
store.sendKeys("mobiles");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
WebElement stor1 = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']"));
WebElement store2 = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹6,999']"));
System.out.println(stor1.getText()+"===="+store2.getText());
driver.close();

//++++++++++++++++
driver.findElement(By.xpath(null));
driver.findElement(By.id(null));


	}

}
