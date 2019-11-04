package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Githubhm_page
	{
		@FindBy(xpath="//a[.='Start a project']")
		private WebElement strtbtn;
		public Githubhm_page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void pclk() throws InterruptedException
		{
			Thread.sleep(3000);
			strtbtn.click();
		}	


}
