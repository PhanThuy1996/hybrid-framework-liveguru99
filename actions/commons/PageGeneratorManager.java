package commons;

import org.openqa.selenium.WebDriver;

import PageObjects.UserHomePageObject;
import PageObjects.UserLoginPageObject;
import PageObjects.UserMyDashBoardPageObject;
import PageObjects.UserRegisterPageObject;

public class PageGeneratorManager extends BasePage {
	public static UserHomePageObject getUserHomePage(WebDriver driver) {
		return new UserHomePageObject(driver);
	}
	
	public static UserRegisterPageObject getUserRegisterPage(WebDriver driver) {
		return new UserRegisterPageObject(driver);
	}
	
	public static UserLoginPageObject getLoginHomePage(WebDriver driver) {
		return new UserLoginPageObject(driver);
	}
	
	public static UserMyDashBoardPageObject getMyDashBoardHomePage(WebDriver driver) {
		return new UserMyDashBoardPageObject(driver);
	}
}
