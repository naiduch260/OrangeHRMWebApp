package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("data.xlxs");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		String value = sheet.getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("xpath")).sendKeys(value);
		wb.close();
		fis.close();
	}

}
