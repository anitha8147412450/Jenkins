package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Githubsign_page 
	{
		@FindBy(id="login_field")
		private WebElement usrtbox;
		@FindBy(id="password")
		private WebElement pwdtbox;
		@FindBy(name="commit")
		private WebElement signbtn;
		public Githubsign_page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void signfn() throws InterruptedException
		{
			Thread.sleep(3000);
			usrtbox.sendKeys("anitha8147412450");
			Thread.sleep(3000);
			pwdtbox.sendKeys("Anitha@1994");
			Thread.sleep(3000);
			signbtn.click();
			Thread.sleep(3000);
		}
		
	

}
