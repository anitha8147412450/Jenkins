package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class Gitbub_generic 
	{
		public WebDriver driver;
		@BeforeMethod
		public void disp() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.get("https://github.com/");
			Thread.sleep(3000);
		}
		@AfterMethod
		public void cls()
		{
			driver.quit();
		}


}
