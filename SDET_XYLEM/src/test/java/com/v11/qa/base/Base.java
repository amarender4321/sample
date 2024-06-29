package com.v11.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	
	WebDriver driver;
	public Properties prop;
	public Properties dataProp;
	
	
	
	public Base() {
		prop = new Properties();
		File propFile= new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\v11\\qa\\config\\config.properties");
		
		dataProp= new Properties();
		File dataProFile= new File(System.getProperty("user.dir")+"\\src/main/java/com/v11/qa/testdata/testdata.properties");
		
		try {
		
		FileInputStream dataFis= new FileInputStream(dataProFile);
		dataProp.load(dataFis);
		}
		catch (Throwable e) {
		}	
		
	try {
		FileInputStream fis = new FileInputStream(propFile);
		prop.load(fis);
		

		
	}catch(Throwable e) {
		e.printStackTrace();
	}
	}
	
		public WebDriver initializeAndOpenApplicationURL(String browserName) {
			
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		 }	 
		 else if(browserName.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		 }
		 else if(browserName.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("safari")) {
			 driver =new SafariDriver();
		 }
			 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.get(prop.getProperty("url"));
			
			return driver;
			
	}
		
	

}
