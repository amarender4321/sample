package StringPrograms;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {

		//driver setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in");
		
	WebElement src = driver.findElement(By.id("src"));
	src.sendKeys("bangalore");
	
	List<WebElement> srcList =driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']/li"));
	
//int	sussgitions=srcList.size();
//for(int i=0; i<sussgitions; i++) {
//	if
	
	for(WebElement elelemet:srcList) {
		if(elelemet.getText().contains("madiwala")) {
			elelemet.click();
			break;
		}
}
	
	
	List<WebElement> destList =driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']/li"));	
	
	for(WebElement element1:destList) {
		if(element1.getText().contains("pennu")) {
			element1.click();
			break;
		}
	}
				
	}

}
