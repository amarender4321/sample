package Scanario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripBookTicket {

	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void makeMyTripBookTicket() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/");
		// driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		WebElement XhButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']")));
		XhButton.click();
		driver.findElement(By.xpath("//li[@class='menu_Buses']")).click();
		/*
		 * 
		 * WebElement fromCity =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));
		 * fromCity.click();
		 * 
		 * WebElement fromInput =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@placeholder='From']"))); fromInput.sendKeys("bangalore");
		 * 
		 * Thread.sleep(3000); List<WebElement> assSugg =
		 * driver.findElements(By.xpath("//ul[@role='listbox']")); int count =
		 * assSugg.size(); System.out.println(count); // * for(int i=0; i<count; i++) {
		 * String text=assSugg.get(i).getText(); System.out.println(text);
		 * 
		 * if(text.contains("Banglore")) { assSugg.get(i).click(); break; } }
		 * 
		 * WebElement toCity =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("toCity")));
		 * toCity.click(); Thread.sleep(3000); WebElement toInput =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@placeholder='To']"))); toInput.sendKeys("pune");
		 * 
		 * List<WebElement> assSugg1 =
		 * driver.findElements(By.xpath("//ul[@role='listbox']")); int count1 =
		 * assSugg.size(); System.out.println(count1);
		 * 
		 * for(int i=0; i<count1; i++) { String text1=assSugg1.get(i).getText();
		 * System.out.println(text1);
		 * 
		 * if(text1.contains("pune")) { assSugg1.get(i).click(); break; } }
		 * 
		 * 
		 */
		String year = "2024";
		String month = "december";
		String date = "20";

		driver.findElement(By.xpath("//span[@data-cy='travelDate']")).click();

// while(true) {
// 
// String monthyear = driver.findElement(By.id("travelDate")).getText();
// System.out.println(monthyear); 

	}
}
