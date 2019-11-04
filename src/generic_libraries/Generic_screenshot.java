package generic_libraries;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_screenshot
{
	public static void getscrenshot(WebDriver driver) throws IOException
	{
		String shot="./screenshots/";
		Date d=new Date(0);
		String d1=d.toString();
		String date=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(shot+date+".jpeg");
		FileUtils.copyFile(src, dest);
		
		
		
	}

}
