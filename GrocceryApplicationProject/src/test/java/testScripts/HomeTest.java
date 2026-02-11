package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
	@Test
	public void verifyUserAbleToSuccessfullyLoginAndLogout() throws IOException {

		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		HomePage home=new HomePage(driver);
		home.clickOnProfileIcon();
		home.clickOnLogout();
	}
	
	
}
