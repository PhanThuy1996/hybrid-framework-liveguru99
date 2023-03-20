package com.liveguru99.fontend;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.UserHomePageObject;
import PageObjects.UserMyDashBoardPageObject;
import PageObjects.UserRegisterPageObject;
import commons.BaseTest;

public class FontEnd_Register extends BaseTest {
	
	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserMyDashBoardPageObject myDashBoardPage;
	private String firstName,middleName, lastName,emailAdress,password;
	@Parameters("browser")
	@BeforeClass
	public void BeforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		driver.get("http://live.techpanda.org/");
		homePage= new UserHomePageObject(driver);
		registerPage = new UserRegisterPageObject(driver);
		firstName="Automation";
		middleName="Testing";
		lastName ="FC";
		emailAdress ="ThuyPhan96"+ generalFakeNumber()+"@gmail.com";
		password ="123456";
	}
	
	@Test
	public void Register_01_Register_Success() {
		System.out.println("Register_01: Step 1: Click to Account Link");
		homePage.clickAccountMenu(driver);
		System.out.println("Register_01: Step 2: Click to Register Link");
		registerPage = homePage.openRegisterPage();
		System.out.println("Register_01: Step 3: Input data to textbox");
		registerPage.sendTextToTextBox("firstname",firstName);
		registerPage.sendTextToTextBox("middlename",middleName);
		registerPage.sendTextToTextBox("lastname",lastName);
		registerPage.sendTextToTextBox("email_address",emailAdress);
		registerPage.sendTextToTextBox("password",password);
		registerPage.sendTextToTextBox("confirmation",password);
		System.out.println("Register_01: Step 4: Click to Register Button");
		myDashBoardPage = registerPage.clickToRegisterButton();
		System.out.println("Register_01: Step 5: Verify text displayed after registing success"); 
		Assert.assertEquals(myDashBoardPage.getTextRegisterResult(),"Thank you for registering with Main Website Store.");
	}
	
	@Test
	public void Register_02_Verify_User_Information() {
		myDashBoardPage.clickAccountMenu(driver);
		myDashBoardPage.openUserMyDashBoardPage(driver);
		assertTrue(myDashBoardPage.getValueUserInformation().contains(firstName));
		assertTrue(myDashBoardPage.getValueUserInformation().contains(lastName));
		assertTrue(myDashBoardPage.getValueUserInformation().contains(emailAdress));
		
	}
	
	
}
