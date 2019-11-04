package generic_libraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata
{
	public static String cellvalue;
	public static void Write_data(int row,int cell, String sheetn) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	FileInputStream fis = new FileInputStream("./Excel/data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetn);
	Row r = sh.getRow(row);
	Cell c = r.getCell(cell);
      cellvalue= c.toString();
	
	}


}
