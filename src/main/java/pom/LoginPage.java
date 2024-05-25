package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(xpath="//input[@id='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@id='btn_login']")private WebElement login;
	
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterUsername(String user) {
	username.sendKeys(user);
}
public void enterPassword(String pass) {
	password.sendKeys(pass);
}
public void clickOnLoginButton() {
	login.click();
}
public String errorMsg(WebDriver driver) {
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Username or password is incorrect']")));
		return a.getText();

}
}

