package Scanario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginInstagram {

	@Test
	public void	loginInstagram(){

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.className("_aa48")).sendKeys("reddyamrender");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("amarender@insta");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		String	tittle	=driver.getTitle();
		System.out.println(tittle);
		//		WebElement list = driver.findElement(By.xpath("x1qjc9v5x9f619 x78zum5 x1q0g3np xln7xf2 xk390pu x5yr21d x1n2onr6 x11njtxf"));
		//		Dimension count = list.getSize();
		//		System.out.println(count);
		driver.quit();

	}

}
