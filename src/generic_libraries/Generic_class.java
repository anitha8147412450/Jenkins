package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Generic_class
{
	public  WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void  test_parallel(String browser)
	{
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("http://localhost/login.do");
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("http://localhost/login.do");
		}
		
	}
	@AfterMethod
	public void closeappln(){
		driver.quit();
	}

	

}
