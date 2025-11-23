package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver WebDriverManager() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/global.properties");
			prop.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("Browser");
		String bUrl = prop.getProperty("baseUrl");
		
		switch(browser.toLowerCase()) {
		case "chrome":
			driver =new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\" not supported.");
		}
		
		driver.get(bUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
	}
	

}
