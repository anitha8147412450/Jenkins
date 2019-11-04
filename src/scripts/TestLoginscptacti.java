package scripts;

import java.io.IOException;

import generic_libraries.Generic123;
import generic_libraries.Readdata;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom2.Loginscptacti;

public class TestLoginscptacti extends Generic123
{
	@Test
	public void TestLoginscptacti() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	Loginscptacti lp=new Loginscptacti(driver);
	Thread.sleep(2000);
//	lp.SetUsername("admin");
//	lp.SetPassword("manager");
	Readdata rd=new Readdata();
	rd.Write_data(3,0,"Sheet1");
	Thread.sleep(2000);
	lp.SetUsername(rd.cellvalue);
	Thread.sleep(2000);
	rd.Write_data(3,1,"Sheet1");
	lp.SetPassword(rd.cellvalue);
	Thread.sleep(2000);
	lp.clicklogin();

}
}
