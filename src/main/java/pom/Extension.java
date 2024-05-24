package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Extension {
	@FindBy(xpath="//span[text()='Accounts']")private WebElement clickOnAccount;
	@FindBy(xpath="//a[@title='Extensions']")private WebElement clickOnExtension;
	@FindBy(xpath="//button[@title='Add']")private WebElement addExtension;
	@FindBy(xpath="//input[@name='extension']")private WebElement extension;
	@FindBy(xpath="//input[@name='extension']")private WebElement extension1;
	@FindBy(xpath="//button[@title='Save']")private WebElement saveExtension;
	@FindBy(xpath="//button[@title='Edit']")private WebElement editExtension;
	@FindBy(xpath="//input[@id='checkbox_0']")private WebElement checkbox;
	@FindBy(xpath="//span[text()='Delete']")private WebElement delete;
	@FindBy(xpath="//span[text()='Back']")private WebElement back;
	@FindBy(xpath="//label[text()='Password']")private WebElement pass;
	@FindBy(xpath="//span[text()='Extension & Voicemail']")private WebElement confirmation;
public Extension(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickOnAccountButton() {
	clickOnAccount.click();
}

public void clickOnExtensionButton() {
	clickOnExtension.click();
}
public void clickOnAddExtension() {
	addExtension.click();
}

public void inputExtension(String user) {
	extension.sendKeys(user);
}
public void clearExtension() {
	extension1.clear();
}
public void clickOnSaveExtension() {
	saveExtension.click();
}
public void clickOnEditExtension() {
	editExtension.click();
}
public void clickOnCheckbox() {
	checkbox.click();
}
public void clickOnDelete() {
	delete.click();
}
public void clickOnBackButton() {
	back.click();
}
public String passField() {
	return pass.getText();
}
public void clickOnConfirmation() {
	confirmation.click();
}
}