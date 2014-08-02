package com.mint.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MintPage {
	
	protected static WebDriver driver;
	
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void openBroswer(String browser){
		
		if(browser.equals("firefox")){
			
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\workspace\\personal\\SelFramework\\Lib\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		
	}
	public void closeBroswer(){
		driver.quit();
		
	}

}
