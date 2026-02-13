package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test(priority = 1, description = "Validating whether user is able to add new news Information" )
	public void verifyWhetherUserIsAbleToAddNewNewsInformations() throws IOException {
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
		HomePage home=new HomePage(driver);
		home.clickOnManageNewsMoreInfoIcon();
		
		String newsText=ExcelUtility.getStringData(0, 0, "NewsPage");
		ManageNewsPage news=new ManageNewsPage(driver);
		news.clickOnNewButton();
		news.enterTheNewsOnNewsTextBox(newsText);
		news.clickOnSaveButton();
		news.clickOnMenuIcon();
		news.clickOnManageNewsTab();
	}
	
	@Test(priority = 2, description = "Validating whether user is able to search newly added or existing news")
	public void verifyWhetherUserIsAbleToSearchNewlyAddedNewsInformations() throws IOException {
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
		HomePage home=new HomePage(driver);
		home.clickOnManageNewsMoreInfoIcon();
		
		String title=ExcelUtility.getStringData(0, 0, "NewsPage");
		ManageNewsPage news=new ManageNewsPage(driver);
		news.clickOnSearchButton();
		news.enterTitleOfTheNewsOnNewsField(title);
		news.clickOnSearch();
		
	}
	
	
	@Test(priority = 2, description = "validating whether user is able to reset news list")
	public void verifyWhetherUserIsAbleToResetNewsList() throws IOException {
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
		HomePage home=new HomePage(driver);
		home.clickOnManageNewsMoreInfoIcon();
		
		ManageNewsPage news=new ManageNewsPage(driver);
		news.clickOnResetButton();
	}
}
