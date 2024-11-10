package TestScripts;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;



public class Amazon {
	
	WebDriver driver;
	
	@Test
	public void searchProducts() {
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4));
		
		driver.manage().window().maximize();
		

		// Function to read URL and additional data from notepad
		def read_data_from_notepad(file_path):
		    with open(file_path, 'r') as file:
		        lines = file.readlines();
		        url = lines[0].strip();
		        data = {}
		        for line in lines[1:]:
		            key, value = line.strip().split(':');
		            data[key] = value
		    return url, data;

		// Path to the notepad file
		file_path = 'path/to/your/data.txt';

		// Read the URL and additional data from the notepad
		url, data = read_data_from_notepad(file_path)

		// Set up Selenium WebDriver (using Chrome in this example)
		driver = webdriver.Chrome(executable_path='path/to/chromedriver');

	// Open the URL in the browser
		driver.get(url);

		// Wait for the page to load (customize this as needed)
		time.sleep(5)

		// Example of using the additional data (e.g., filling a login form)
		if 'username' in data and 'password' in data:
		    username_input = driver.find_element(By.NAME, 'username');  // Adjust the selector as needed
		    password_input = driver.find_element(By.NAME, 'password');  // Adjust the selector as needed
		    username_input.send_keys(data['username']);
		    password_input.send_keys(data['password']);
		    password_input.send_keys(Keys.RETURN);  //Submit the form

		// Wait for a few seconds to see the result (optional)
		time.sleep(5);

		//Close the browser
		driver.quit();

		
		
		
		
		
	}

}
