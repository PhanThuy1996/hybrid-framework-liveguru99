package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.FontEnd_PageUI_Register;
import commons.BasePage;
import commons.PageGeneratorManager;

public class UserRegisterPageObject extends BasePage {
	private WebDriver driver;
	public UserRegisterPageObject(WebDriver driver) {
		this.driver=driver;
	}
	public void sendTextToTextBox(String nameTextBox,String textValue) {
		waitForElementVisible(driver, FontEnd_PageUI_Register.DYNAMIC_TEXTBOX_LINK, nameTextBox);
		sendKeysToElement(driver, FontEnd_PageUI_Register.DYNAMIC_TEXTBOX_LINK, textValue, nameTextBox);		
	}

	public UserMyDashBoardPageObject clickToRegisterButton() {
		waitForElementClickable(driver, FontEnd_PageUI_Register.REGISTER_BUTTON);
		clickToElement(driver, FontEnd_PageUI_Register.REGISTER_BUTTON);
		return PageGeneratorManager.getMyDashBoardHomePage(driver);
		
	}



}
