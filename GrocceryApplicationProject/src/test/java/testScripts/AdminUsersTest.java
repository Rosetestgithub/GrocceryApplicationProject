package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base{
	@Test(priority=1, description="Validating whether user is able to add new user")
	public void verifyWhetherUserIsAbleToAddNewUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
		HomePage home=new HomePage(driver);
		home.clickOnAdminUsersMoreInfoIcon();
		
		FakerUtility faker=new FakerUtility();
		String username=faker.createUserRandomUsername();
		String password=faker.createUserRandomPassword();
		//String username=ExcelUtility.getStringData(0, 0, "AdminUsersPage");
		//String password=ExcelUtility.getStringData(0, 1, "AdminUsersPage");
		
		AdminUsersPage admin=new AdminUsersPage(driver);
		admin.clickOnNewButton();
		admin.enterUsernameOnUsernameField(username);
		admin.enterPasswordOnPasswordField(password);
		admin.selectOnUserType();
		admin.clickOnSaveButton();
	}
	
	@Test(priority=2, description="Validating whether user is able to search the newly added or existing user")
	public void verifyWhetherUserIsAbleToSearchTheNewlyAddedUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
		HomePage home=new HomePage(driver);
		home.clickOnAdminUsersMoreInfoIcon();
		
		String username=ExcelUtility.getStringData(0, 0, "AdminUsersPage");
		AdminUsersPage admin=new AdminUsersPage(driver);
		admin.clickOnSearchButton();
		admin.enterUsernameOnUsernameFieldForSearching(username);
		admin.selectOnUserTypeForSearching();
		admin.clickOnSearchBtn();
	}
	
	@Test(priority=3, description="Validating whether user is able to reset the admin users list")
	public void verifyWhetherUserIsAbleToResetTheAdminUsersList() throws IOException {
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
		HomePage home=new HomePage(driver);
		home.clickOnAdminUsersMoreInfoIcon();
		
		AdminUsersPage admin=new AdminUsersPage(driver);
		admin.clickOnResetButton();
	}
}
