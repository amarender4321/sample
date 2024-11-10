package TestScripts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TopProgrmaingLanguages {

	@Test
	public void topProgramingLanuages() throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

		driver.get("https://www.google.com");


		// Find the search box element
		WebElement searchBox = driver.findElement(By.name("q"));

		// Enter the search query
		searchBox.sendKeys("top programming languages 2024");

		// Submit the search query
		searchBox.sendKeys(Keys.RETURN); //or wecan use >>searchBox.submit();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		js.executeScript("window.scrollBy(0, 200)");
		Thread.sleep(5000);

		WebElement url = driver.findElement(By.xpath("(//div[@class='byrV5b'])[1]"));
		url.click();
		
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		js.executeScript("window.scrollBy(0, 200)");
	
			List<WebElement> languages = driver.findElements(By.cssSelector(".article-content h2"));
	//int	sa	=languages.size();
		
			
    for (int i = 0; i < languages.size(); i++) {
    	
    	if(i==11) {
    	String sp = languages.get(i).getText();
              System.out.println(sp+" swift is present on the webPage");  

    	}
           else {
              System.out.println("swift is not present");
    	}
    }
  
    driver.quit();
}
}