package com.mint.pages;

import org.openqa.selenium.*;

public class LoginPage extends MintPage {
	
	public void login(String username,String password){
		
		driver.findElement(By.id("form-login-username")).sendKeys(username);
		driver.findElement(By.id("form-login-password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		
	}
	
  
	public void openForgotPasswordPage(){
		
		driver.findElement(By.id("formbox-login-recover")).click();
		
		
	}
}
