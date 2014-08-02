package com.mint.pages;

import org.openqa.selenium.By;

public class OverviewPage extends MintPage{
	
	public String getDisplayedUserName(){
		
		return driver.findElement(By.id("hdr-username")).getText();
		
	}

}
