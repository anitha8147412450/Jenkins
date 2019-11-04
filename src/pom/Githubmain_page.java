package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Githubmain_page 
	{
		@FindBy(xpath="//a[@class='HeaderMenu-link no-underline mr-3']")
		private WebElement sinlk;
		public Githubmain_page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void clk() throws InterruptedException
		{
			
			sinlk.click();
			Thread.sleep(3000);
		}
		
	}


