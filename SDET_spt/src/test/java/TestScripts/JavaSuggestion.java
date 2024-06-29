package TestScripts;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSuggestion {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("q")).sendKeys("java");
List<WebElement> ele = driver.findElements(By.xpath("//div[@class='sbic sb43']"));
//click  the element based on the  index
//ele.get(0).click();


//list of the suggestion by using loop
for(int i=0;i<ele.size();i++) {
                              // System.out.println(ele.get(i).getText());
	                          //or
	if(ele.get(i).getText().equals("java")) {
	ele.get(i).click();
	break;
	
	
	
	
	
	/*
	int[] ar = {9,3,1,2,6,5,4,8,7};
	Arrays.sort(ar);  //int sort and ascending the elements 
	System.out.println(Arrays.toString(ar)); //toString int;
		
	Integer[] ar1 = {9,3,1,2,6,5,4,8,7};
	Arrays.sort(ar, Collection.reverseorder()); //desending order
	System.out.println(Arrays.toString(ar));
		*/
	}


}


	}

}
