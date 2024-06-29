package TestScripts;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMobilePrice {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.name("q")).sendKeys("mobiles");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
Thread.sleep(2000);

//single mobile and price
//String mobile = driver.findElement(By.xpath("//div[text()='REDMI 10 (Pacific Blue, 64 GB)']")).getText();
//String price = driver.findElement(By.xpath("//div[text()='REDMI 10 (Pacific Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹9,999']")).getText();
	//System.out.println(mobile.getText()+"===>"+price.getText());
//System.out.println(mobile+"====>"+price);*/
         
//print mobiles names
List<WebElement> list  =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(int i=0; i<list.size();i++) {
		String mobiles = list.get(i).getText();
		
	System.out.println(mobiles);
	}
	//print  mobile price
List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
for(int i=0; i<price.size();i++) {
String mPrice = price.get(i).getText();

//System.out.println(mPrice);


//List<WebElement> list  =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
/*// Locate the elements containing mobile names and prices and print them
List<WebElement> mobileNameElement = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
String mobileName = ((WebElement) mobileNameElement).getText();
WebElement mobilePriceElement = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
String mobilePrice = mobilePriceElement.getText();

// Concatenate the mobile name and price values
//String mobileDetails = mobileName + " - " + mobilePrice;

// Print the concatenated value
System.out.println(mobileDetails);

}*/   


	}
	}
}
