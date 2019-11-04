package generic_libraries;




	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

	public class Generic123
	{
		
		public WebDriver driver;
		public String p_id;
		public Actions act;
		@BeforeMethod
		public void disp()
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		    driver=new FirefoxDriver();
			driver.get("http://localhost/login.do");
			 p_id=driver.getWindowHandle();
			 act=new Actions(driver);
		}
		@AfterMethod
		public void cls() throws IOException
	   {
			Generic_screenshot.getscrenshot(driver);
			driver.quit();		
			
	   }

	}



	



