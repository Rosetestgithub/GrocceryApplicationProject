package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newBtn;
	@FindBy(xpath = "//textarea[@id='news']")WebElement newsTextBox;
	@FindBy(xpath = "//button[@type='submit']")WebElement saveBtn;
	@FindBy(xpath = "//a[@data-widget='pushmenu']")WebElement menuIcon;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class=' nav-link']")WebElement manageNewsTab;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement searchBtn;
	@FindBy(tagName = "input")WebElement searchTitle;
	@FindBy(xpath = "//button[@name='Search']")WebElement search;
	@FindBy(linkText = "Reset")WebElement resetBtn;
	
	
	public void clickOnNewButton() {
		newBtn.click();
	}
	public void enterTheNewsOnNewsTextBox(String newsText) {
		newsTextBox.sendKeys(newsText);
	}
	public void clickOnSaveButton() {
		saveBtn.click();
	}
	public void clickOnMenuIcon() {
		menuIcon.click();
	}
	public void clickOnManageNewsTab() {
		manageNewsTab.click();
	}
	public void clickOnSearchButton() {
		searchBtn.click();
	}
	public void enterTitleOfTheNewsOnNewsField(String title) {
		searchTitle.sendKeys(title);
	}
	public void clickOnSearch() {
		search.click();
	}
	public void clickOnResetButton() {
		resetBtn.click();
	}
}
