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
	
	
	public void clickOnProfileIcon() {
		profileIcon.click();
	}
	public void clickOnLogout() {
		logout.click();
	}
}
