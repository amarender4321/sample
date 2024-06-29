package JAVA_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_Slenium_PRa {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
String mobiles = driver.findElement(By.xpath("//div[text()='POCO C50 (Royal Blue, 32 GB)']")).getText();
WebElement list = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
//for(int i=0; i<list.size();i++) {
	//String mobiles = list.get(i).getText();



	
	
	}
	
	
	

}
