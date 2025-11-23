package Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	public WebDriver driver;
	public void takescreenshot(WebDriver driver, String fileName) {
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("./screeenshot/" + fileName + "./png");
			
			FileUtils.copyFile(source, target);
			System.out.println("file destination is: " + target.getPath());
			
		}catch(Exception e){
			System.out.println("Exception while tacking screenshot: " + e.getMessage());
		}
	}
}
