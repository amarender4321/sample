package TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICICIBANKDETIALS {

	public static void main(String[] args) throws IOException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.icicibank.com/");
Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//span[text()='Accounts']"))).perform();
driver.findElement(By.xpath("(//label[text()='Deposits'])[1]")).click();
driver.findElement(By.xpath("//a[text()='Online Services']")).click();
/*  t=(Takescreenshot)driver;//typecastsing
File src=t.getscreenshotAs(OutputType.FILE);
File dest =new File("./screenshot/ss.png");
FileUtil.copyFile(src,dest);*/

File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(f, new File("C:\\Users\\Narender Reddy\\Downloads\\sample\\iciciscreenshot.jpg"));// i was import from this package[import org.openqa.selenium.TakesScreenshot;




	}

}

