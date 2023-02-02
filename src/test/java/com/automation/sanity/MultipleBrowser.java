package com.automation.sanity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowser {
	
	public WebDriver driver;	
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void launchApplication(String browser,String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver");
			
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();			
		}	
		else if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Launch the Home URL
		driver.get(url);

		// To Maximize Window
		driver.manage().window().maximize();
		System.out.println("Application is launched");
	}
	
	@AfterClass
	public void closeApplication() {
		driver.quit();
		System.out.println("Application is closed");
	}
	
}
