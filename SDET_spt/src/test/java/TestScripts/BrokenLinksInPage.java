package TestScripts;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksInPage {

	@Test
public void brokenLinkensInPage() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String	url=link.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}
			try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.connect();
				if(huc.getResponseCode()>=400) {
					System.out.println(url+"  is broken");
				}
				else {
					System.out.println(url+" is valid");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}
}
