package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Githubprj_page

	{
		@FindBy(id="repository_name")
		private WebElement reptbox;
		@FindBy(xpath="//button[@class='btn btn-primary first-in-line']")
		private WebElement subbtn;
		public Githubprj_page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void create() throws InterruptedException
		{
			Thread.sleep(3000);
			reptbox.sendKeys("Amazon666");
			Thread.sleep(5000);
			subbtn.click();
		}	
	}
	


