package Scanario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookies {

	@Test(enabled=false)
	public void deleteCookies(){

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.quit();
	}

	@Test(invocationCount = 3, priority=1)
	public void getUrlPrsentAddressBar(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String eUrl= "https://www.google.com/";
		String cUrl=driver.getCurrentUrl();
		if(cUrl.equals(eUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}
	@Test(priority=2)
	public void deleteCookies2(){

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.quit();
	}

	@Test(invocationCount = 0)
	public void getUrlPrsentAddressBar2(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String eUrl= "https://www.google.com/";
		String cUrl=driver.getCurrentUrl();
		if(cUrl.equals(eUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}
	@Test(priority=3)
	public void getUrlPrsentAddressBar3(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String eUrl= "https://www.google.com/";
		String cUrl=driver.getCurrentUrl();
		if(cUrl.equals(eUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();
	}
	@Test()
	public void getPageSource(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);
		SoftAssert asset = new SoftAssert();
		asset.fail();
		driver.quit();
	}

}
