package pom1;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class Flipkart_Loginpage 
	{
		@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
		private WebElement txtbox;
		@FindBy(xpath="//input[@type='password']")
		private WebElement pwdbox;
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement logbtn;
	    public Flipkart_Loginpage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	    public void txtsnd()
	    {
	    	txtbox.sendKeys("8147412450");
	    }
	    public void pwdsnd()
	    {
	    	pwdbox.sendKeys("8147412450");
	    }
	    public void log()
	    {
	    	logbtn.click();
	    }
	    
	}
	


