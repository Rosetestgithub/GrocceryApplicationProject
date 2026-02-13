package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='img-circle']")WebElement profileIcon;
	@FindBy(linkText="Logout")WebElement logout;
	//@FindBy(xpath ="//p[contains(text(),'Dashboard')]//preceding::a[text()='More info ']")WebElement adminUsersMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminUsersMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement manageNewsMoreInfo;
	public void clickOnProfileIcon() {
		profileIcon.click();
	}
	public void clickOnLogout() {
		logout.click();
	}
	public void clickOnAdminUsersMoreInfoIcon() {
		adminUsersMoreInfo.click();
	}
	public void clickOnManageNewsMoreInfoIcon() {
		manageNewsMoreInfo.click();
	}
}
