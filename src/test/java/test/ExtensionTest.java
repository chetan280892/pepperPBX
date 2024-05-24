package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pojo.Browser;
import pom.Extension;
import pom.LoginPage;

public class ExtensionTest {

	public class LoginPageTest extends BaseTest {
	ExtentTest test;
		@BeforeMethod
		public void openBrowser() {
		driver=Browser.launchBrowser();
		}
		@Test
		public void VerifyaddExtension() {
			LoginPage loginpage=new LoginPage(driver);
	        loginpage.enterUsername("testadmin");
	        loginpage.enterPassword("Vindaloo@124#");
	        loginpage.clickOnLoginButton();
	        Extension extension =new Extension(driver);
	        extension.clickOnAccountButton();
	        extension.clickOnExtensionButton();
	        extension.clickOnAddExtension();
	        extension.inputExtension("ABCD");
	        extension.clickOnSaveExtension();
	       String field=extension.passField();
	       Assert.assertTrue(field.contains("Password"));
	        
		}
		@Test
		public void verifyUpdateExtension() {
			LoginPage loginpage=new LoginPage(driver);
	        loginpage.enterUsername("testadmin");
	        loginpage.enterPassword("Vindaloo@124#");
	        loginpage.clickOnLoginButton();
	        Extension extension =new Extension(driver);
	        extension.clickOnAccountButton();
	        extension.clickOnExtensionButton();
	        extension.clickOnAddExtension();
	        extension.inputExtension("ABCDE");
	        extension.clickOnSaveExtension();
	        extension.clickOnBackButton();
	        extension.clickOnEditExtension();
	        extension.clearExtension();
	        extension.inputExtension("12345");
	        extension.clickOnSaveExtension();
		}
		
		@Test
		public void verifyDeleteExtension() {
			LoginPage loginpage=new LoginPage(driver);
	        loginpage.enterUsername("testadmin");
	        loginpage.enterPassword("Vindaloo@124#");
	        loginpage.clickOnLoginButton();
	        Extension extension =new Extension(driver);
	        extension.clickOnAccountButton();
	        extension.clickOnExtensionButton();
	        extension.clickOnCheckbox();
	        extension.clickOnDelete();
	        extension.clickOnConfirmation();
		}
}
}