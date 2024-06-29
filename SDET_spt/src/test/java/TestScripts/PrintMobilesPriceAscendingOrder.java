package TestScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintMobilesPriceAscendingOrder {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		List<WebElement>nameElements  = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement>  priceElements =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		// Create a map to store the mobile names and prices
		Map<String, Double> mobiles = new TreeMap<String, Double>();

		// Extract the mobile names and prices and store them in the map
		for (int i = 0; i < nameElements.size(); i++) {
		    String name = nameElements.get(i).getText();
		    double price = Double.parseDouble(priceElements.get(i).getText().replaceAll("[^0-9.]", ""));
		    mobiles.put(name, price);
		}

		// Sort the map in ascending order based on the prices
		List<Map.Entry<String, Double>> list = new ArrayList<Entry<String, Double>>(mobiles.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
		    public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
		        return (o1.getValue()).compareTo(o2.getValue());
		    }
		});

		// Print the mobile names and prices in ascending order
		for (Map.Entry<String, Double> entry : list) {
		    System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// Close the browser
		driver.quit();
	}

}
