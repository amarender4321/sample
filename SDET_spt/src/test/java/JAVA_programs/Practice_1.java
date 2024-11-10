package JAVA_programs;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Practice_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in");
		
		 WebElement fromDate = driver.findElement(By.id("src"));
		 fromDate.sendKeys("bangalore");

		List<WebElement> fromList=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']"));

		int allSugg=fromList.size();
		for(int i=0; i<allSugg; i++){
		if(
		
		else{
		System.out.println("allSugg list dont have the madiwala");
		}
		}
		WebElement toDate=driver.findElemt(by.id("dest");
		toDate.sendKeys("coimbathore");

		List<WebElement> toList= driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']"));

		List<WebElement> fromList1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']"));

		int allSugg2=fromList1.size();
		for(int i=0; i<allSugg2; i++){
		if(allSugg2.contains("pergu"){
		allSugg2.get(i).click();
		}
		else{
		System.out.println("list contains the Perungalathur");
		}
		}
		
		   // Setup WebDriverManager for ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Set up the implicit wait and window configuration
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open the RedBus website
        driver.get("https://www.redbus.in");

        // Select source city
        WebElement fromDate = driver.findElement(By.id("src"));
        fromDate.sendKeys("bangalore");

        // Wait and choose the suggestion for 'madiwala'
        List<WebElement> fromList = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        for (WebElement element : fromList) {
            if (element.getText().contains("Madiwala")) {
                element.click();
                break;
            }
        }

        // Select destination city
        WebElement toDate = driver.findElement(By.id("dest"));
        toDate.sendKeys("coimbatore");

        // Wait and choose the suggestion for 'Perungalathur'
        List<WebElement> toList = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        for (WebElement element : toList) {
            if (element.getText().contains("Perungalathur")) {
                element.click();
                break;
		
		
	}
        }
	}
}


