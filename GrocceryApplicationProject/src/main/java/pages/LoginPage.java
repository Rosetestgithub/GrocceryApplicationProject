package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")WebElement usernameField;
	@FindBy(name="password")WebElement passwordField;
	@FindBy(tagName="button")WebElement signInBtn;
	
	
	public void enterUsernameOnUsernameField(String usernameValue) {
		usernameField.sendKeys(usernameValue);
	}
	public void enterPasswordOnPasswordField(String passwordValue) {
		passwordField.sendKeys(passwordValue);
	}
	public void clickOnSignInButton() {
		signInBtn.click();
	}
}
