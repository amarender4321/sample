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

import com.v11.qa.utils.Utilities;

public class Base2 {
	
	WebDriver driver;
	public Properties prop;
	private static String browserName;
	public static String validPassword;
	public static String validEmail;
	
	
	public Base2() {
		prop = new Properties();
		File propFile= new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\v11\\qa\\config\\config.properties");
	try {
		FileInputStream fis = new FileInputStream(propFile);
		prop.load(fis);
		browserName=prop.getProperty("browserName");
		validPassword=prop.getProperty("validPassword");
		validEmail=prop.getProperty("validEmail");

		
	}catch(Throwable e) {
		e.printStackTrace();
	}
	}
	
		public WebDriver initializeAndOpenApplicationURL(String browserName) {
			
		if(browserName.equals("chrome")) {
			 driver=new ChromeDriver();
		 }
		 else if(browserName.equals("firefox")) {
			 driver=new FirefoxDriver();
		 }	 
		 else if(browserName.equals("firefox")) {
			 driver=new FirefoxDriver();
		 }
		 else if(browserName.equals("edge")) {
			 driver=new EdgeDriver();
		 }
		 else if(browserName.equals("safari")) {
			 driver =new SafariDriver();
		 }
			 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			driver.get(prop.getProperty("url"));
			
			return driver;
	}
		
		public WebDriver initializeAndOpenApplicationURL( ) {
			
			if(browserName.equals("chrome")) {
				 driver=new ChromeDriver();
			 }
			 else if(browserName.equals("firefox")) {
				 driver=new FirefoxDriver();
			 }	 
			 else if(browserName.equals("firefox")) {
				 driver=new FirefoxDriver();
			 }
			 else if(browserName.equals("edge")) {
				 driver=new EdgeDriver();
			 }
			 else if(browserName.equals("safari")) {
				 driver =new SafariDriver();
			 }
				 
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				driver.get(prop.getProperty("url"));
				
				return driver;
		}

}
