package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[contains(text(),'Dashboard')]//preceding::a[text()='More info ']")WebElement moreInfolink;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newBtn;
	@FindBy(id="username")WebElement usernameField;
	@FindBy(id="password")WebElement passwordField;
	@FindBy(id="user_type")WebElement usertypeDrpDn;
	@FindBy(xpath="//button[@name='Create']")WebElement saveBtn;
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement searchBtn;
	@FindBy(id="un")WebElement usernameFd;
	@FindBy(id="ut")WebElement userTypeSelection;
	@FindBy(xpath="//button[@name='Search']")WebElement searchButton;
	@FindBy(linkText = "Reset")WebElement resetBtn;
	
	public void clickOnAdminUsersMoreInfo() {
		moreInfolink.click();
	}
	public void clickOnNewButton() {
		newBtn.click();
	}
	/*public void enterUsernameOnUsernameField() {
		usernameField.sendKeys("jfffin");
	}*/
	public void enterUsernameOnUsernameField(String username) {
		usernameField.sendKeys(username);
		}
	/*public void enterPasswordOnPasswordField() {
		passwordField.sendKeys("jfffin");
	}*/
	public void enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	public void selectOnUserType() {
		Select select=new Select(usertypeDrpDn);
		select.selectByIndex(1);
	}
	public void clickOnSaveButton() {
		saveBtn.click();
	}
	public void clickOnSearchButton() {
		searchBtn.click();
	}
	/*public void enterUsernameOnUsernameFieldForSearching() {
		usernameFd.sendKeys("Jain");
	}*/
	public void enterUsernameOnUsernameFieldForSearching(String username) {
		usernameFd.sendKeys(username);
	}
	public void selectOnUserTypeForSearching() {
		Select select=new Select(userTypeSelection);
		select.selectByValue("staff");
	}
	public void clickOnSearchBtn() {
		searchButton.click();
	}
	public void clickOnResetButton() {
		resetBtn.click();
	}
}
