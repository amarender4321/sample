package JAVA_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	@Test
	public void autoSuggission() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);


		driver.get("https://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("java");
		
		Thread.sleep(3000);

		//searchBox.sendKeys(Keys.RETURN);

		List<WebElement> suggestionList	=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

		System.out.println(suggestionList);
//		int	 listCount=suggestionList.size();	
//		System.out.println(listCount);
		//suggestionList.get(listCount-2).click();

				for(int i=0;i<suggestionList.size(); i++) {
					if(i==2) {
		
						String sp = suggestionList.get(i).getText();
						
						
						System.out.println(sp); 
		}
		}	
		driver.quit();
	}	
}















