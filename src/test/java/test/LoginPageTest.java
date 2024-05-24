package test;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.testng.annotations.Listeners;
import pojo.Browser;
import pom.LoginPage;
@Listeners(test.Listeners.class)
public class LoginPageTest extends BaseTest {
ExtentTest test;
	@BeforeMethod
	public void openBrowser() {
	driver=Browser.launchBrowser();
	}
	@Test
	public void loginWithValidCredentials() {
		LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsername("testadmin");
        loginpage.enterPassword("Vindaloo@124#");
        loginpage.clickOnLoginButton();
        String url=driver.getCurrentUrl();
Assert.assertTrue(url.contains("dashboard"));
	}
	
	@Test
	public void loginWithInvalidCredentials()  {
		LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsername("test");
        loginpage.enterPassword("Vindaloo@123#");
        loginpage.clickOnLoginButton();
        String url=driver.getCurrentUrl();
        Assert.assertFalse(url.contains("dashboard"));
 
	}
	}
