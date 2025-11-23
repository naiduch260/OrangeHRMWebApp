package Utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    XSSFWorkbook wb;

    public ExcelUtil(String filePath) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        wb = new XSSFWorkbook(fis);
        fis.close();
    }

    public String getCellData(String sheet, int row, int col) {
        return wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
    }

    public void closeWorkbook() throws Exception {
        wb.close();
    }
}
