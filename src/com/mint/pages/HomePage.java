package com.mint.pages;

import org.openqa.selenium.By;

public class HomePage extends MintPage {
	
	
	public void openHomePage(){
		
	    driver.get("http://www.mint.com");
		
	}
	
	public void login(String username, String password){
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login_button")).click();
		
		
		
	}
	
	public void signUp(String username,String password, String zipcode){
		driver.findElement(By.id("form-signup-username")).sendKeys(username);
		driver.findElement(By.id("form-signup-password")).sendKeys(password);
		driver.findElement(By.id("form-signup-zipcode")).sendKeys(zipcode);
		driver.findElement(By.id("form-signup-submit")).click();
		
		
	}
	public void openLogin(){
		
		driver.findElement(By.id("login_button")).click();
		
	}
	
	public void openCanadaFlagLink(){
		
		driver.findElement(By.xpath("//*[@id='nav']/a[6]")).click();
		
		
	}
	
	public String getPageTitle(){
		
		return driver.getTitle();
		
	}
	

	
	

}
