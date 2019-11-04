package pom1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Partshirt_page
	{
		@FindBy(xpath="//a[.='S']")
		private WebElement sizelk;
		
		
		@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
		private WebElement addbtn;
		
	    public Partshirt_page(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	    public void sizeclk()
	    {
	    	sizelk.click();
	    }
	    public void addclk()
	    {
	    	addbtn.click();
	    }
	    
	}


