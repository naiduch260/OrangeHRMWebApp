package OrangeHRMPages;

import org.openqa.selenium.By;

public class OrangeHRMLocators {

	public static final By LOGIN_TITLE_TEXT = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	public static final By USER_FIELD = By.xpath("//input[@name='username']");
	public static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
	public static final By LOGIN_BUTTON = By.xpath("//button[text()=' Login ']");
	public static final By DASHBOARD_TEXT = By
			.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	public static final By ERROR_MESSAGE = By.xpath("//p[text()='Invalid credentials']");
	public static final By ERROR_MESSAGE_USERNAME = By.xpath("//input[@name='username']/following::span[text()='Required'][1]");
	public static final By ERROR_MESSAGE_PASSWORD = By.xpath("//input[@name='password']/following::span[text()='Required']");
	
	
	
}
