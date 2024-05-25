package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public static WebDriver driver;

	public static String errorMsg() {
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Username or password is incorrect']")));
		return a.getText();
	}
}
