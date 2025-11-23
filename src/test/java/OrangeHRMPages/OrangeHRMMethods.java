package OrangeHRMPages;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ScreenshotUtils;



public class OrangeHRMMethods {
	private WebDriver driver;
	OrangeHRMLocators orangeHRMLocators;
	ScreenshotUtils ss;


	public OrangeHRMMethods(WebDriver driver) {
		this.driver = driver;
		this.ss = new ScreenshotUtils();
	}

//	code for user Name Enter
	public void enterUserField(String userName) throws Exception {
//		ExcelUtil excel = new ExcelUtil("C:\\Users\\Prasad Ch\\OneDrive");
//		String username = excel.getCellData("sheet1", 1, 0);
//		enterUserField(username);
//		excel.closeWorkbook();
		
		driver.findElement(OrangeHRMLocators.USER_FIELD).sendKeys(userName);
	}

//	code for Login Page Title 
	public void loginPageTitle() throws IOException {
		WebElement element = driver.findElement(OrangeHRMLocators.LOGIN_TITLE_TEXT);
		String actualResult = element.getText();
		String expectedResult = "Login";
		try {
			Assert.assertEquals(actualResult, expectedResult);
			System.out.println("Test passed: The login message is correct");
//			ss.takescreenshot(driver, "Dashbord pased");
		} catch (AssertionError e) {
			System.out.println("Test failed: the login message is incorrect");
			ss.takescreenshot(driver, "Dashbord failed");
		}
	}

//	code for Password Enter
	public void enterPasswordField(String password) {
		driver.findElement(OrangeHRMLocators.PASSWORD_FIELD).sendKeys(password);
	}

//	code for click on login button
	public void clickOnLoginButton() {
		driver.findElement(OrangeHRMLocators.LOGIN_BUTTON).click();
	}

//	code for Dash Board page Title 
	public void dashBoardMainPage() {
		WebElement element = driver.findElement(OrangeHRMLocators.DASHBOARD_TEXT);
		String actualResult = element.getText();
		String expectResult = "Dashboard";
		try {
			Assert.assertEquals(actualResult, expectResult);
			System.out.println("Test passed: the title message is correct");
		} catch (Exception e) {
			System.out.println("Test failed: the title message is incorrect");
		}

	}

//	code for Error Message Title
	public void errorMessageTitle() {
		WebElement element = driver.findElement(OrangeHRMLocators.ERROR_MESSAGE);
		String actualResult = element.getText();
		String expectResult = "Invalid credentials";
		try {
			Assert.assertEquals(actualResult, expectResult);
			System.out.println("Test passed: the title message is correct");
			ss.takescreenshot(driver, "Message is corrected");
		} catch (Exception e) {
			System.out.println("Test failed: the title message is incorrect");
		}
	}
//	code for error message under user name field
	public void errorMessageUnderUserName()
	{
		WebElement element = driver.findElement(OrangeHRMLocators.ERROR_MESSAGE_USERNAME);
		String actualResult = element.getText();
		String expectResult = "Required";
		try {
			Assert.assertEquals(actualResult, expectResult);
			System.out.println("Test passed: the title message is correct");
			ss.takescreenshot(driver, "errorMessageUnderUserName Message is corrected");

		} catch (Exception e) {
			System.out.println("Test failed: the title message is incorrect");
		}
	}
//	code for error message under Password field
	public void errorMessageUnderPassword()
	{
		WebElement element = driver.findElement(OrangeHRMLocators.ERROR_MESSAGE_PASSWORD);
		String actualResult = element.getText();
		String expectResult = "Required";
		try {
			Assert.assertEquals(actualResult, expectResult);
			System.out.println("Test passed: the title message is correct");
			ss.takescreenshot(driver, "errorMessageUnderpassword Message is corrected");
		} catch (Exception e) {
			System.out.println("Test failed: the title message is incorrect");
		}
	}
	
	
	
	
	
	
	
	
}
