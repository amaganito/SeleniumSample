package com.mint.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

import com.mint.pages.*;

public class LoginTests {
	
	HomePage homePg = new HomePage();
	LoginPage loginPg = new LoginPage();
	OverviewPage overviewPg = new OverviewPage();
	CanadaPage canadaPg = new CanadaPage();
	
  @Test
  public void testValidLogin() {
	  homePg.openLogin();
	  //enter own username and password for login method
	  loginPg.login("", "");
	  //should equal the username above.
	  assertEquals(overviewPg.getDisplayedUserName(), "");
	  
  }
  @Test
  public void testCanadaPage(){
	  
	  homePg.openCanadaFlagLink();
	  assertEquals(canadaPg.getPageTitle(),"Canada | Mint.com");
	  
	  
  }
  @Test
  public void testSignupInvalidEmail(){
	  homePg.signUp("Joe621234","123456","94536");
	  assertEquals(homePg.getPageTitle(),
       "Mint - Personal Finance, Budgeting, Money Management, Financial Management, Money Manager, Budget Planner, Free Budget Software, Online Banking");
	  
	  
	  
  }
  
  @Test
  public void testLoginFromHomePage() { 
	  
	  homePg.login("kasipreddy+bssuser@gmail.com", "Test1234");
	  assertEquals(overviewPg.getDisplayedUserName(), "kasipreddy+bssuser@gmail.com");
	  
  }
  
  @Test
  public void testForgotPassword(){
	  
	  homePg.openLogin();
	  loginPg.openForgotPasswordPage();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  homePg.openBroswer("chrome");
	  homePg.openHomePage();
	  
  }
  
  @AfterMethod
  public void afterMethod(){
	  
	  //homePg.closeBroswer();
	  
  }

}
