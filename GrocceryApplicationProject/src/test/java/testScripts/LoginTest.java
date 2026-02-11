package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(priority=1)
	public void verifyUserWithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(10, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
	
	@Test(priority=2,description = "Verify user login with valid username and invalid password")
	public void verifyUserWithValidUsernameAndInvalidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
	
	@Test(priority=3)
	public void verifyUserWithInvalidUsernameAndValidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
	
	@Test(priority=4)
	public void verifyUserWithInvalidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
}