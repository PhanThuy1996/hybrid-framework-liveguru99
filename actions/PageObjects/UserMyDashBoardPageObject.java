package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.FontEnd_PageUI_MyDashBoard;
import commons.BasePage;

public class UserMyDashBoardPageObject extends BasePage {
	private WebDriver driver;
	public UserMyDashBoardPageObject(WebDriver driver) {
		this.driver= driver;
	}
	public String getTextRegisterResult() {
		waitForElementVisible(driver, FontEnd_PageUI_MyDashBoard.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, FontEnd_PageUI_MyDashBoard.REGISTER_SUCCESS_MESSAGE);
	}
	public String getValueUserInformation() {
		waitForElementInVisible(driver, FontEnd_PageUI_MyDashBoard.USER_INFORMATION);
		return getElementText(driver, FontEnd_PageUI_MyDashBoard.USER_INFORMATION);
	}

}
