package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.FontEnd_PageUI_HomePage;
import commons.BasePage;
import commons.PageGeneratorManager;

public class UserHomePageObject extends BasePage{
	private WebDriver driver;
	public UserHomePageObject(WebDriver driver) {
		this.driver= driver;
	}
	public UserRegisterPageObject openRegisterPage() {
		waitForElementVisible(driver, FontEnd_PageUI_HomePage.DYNAMIC_MENU_LINK, "Register");
		clickToElement(driver,  FontEnd_PageUI_HomePage.DYNAMIC_MENU_LINK, "Register");
		return PageGeneratorManager.getUserRegisterPage(driver);
	}


}
