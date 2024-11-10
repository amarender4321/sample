package com.selenium.practice.scripts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class AutoSuggissionRedBus {

	public static void main(String[] args) {
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