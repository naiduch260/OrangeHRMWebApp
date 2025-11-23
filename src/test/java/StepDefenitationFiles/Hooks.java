package StepDefenitationFiles;

import org.openqa.selenium.WebDriver;

import Utils.BrowserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	public BrowserSetup browserSetup;
	
	@Before
	public void setup() {
		browserSetup= new BrowserSetup();
		
		driver=browserSetup.WebDriverManager();
	}
	@After
	public void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}
	

}
