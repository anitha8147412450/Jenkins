package pom1;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Tshirt_page 
	{
		@FindBy(xpath="//a[contains(@title,'Printed, Geometric Print')]")
		private WebElement tlink;
		
	    public Tshirt_page(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    	
	    }
	    
	  
	    public void lclk() throws InterruptedException
	    {
	    	Thread.sleep(2000);
	    	tlink.click();
	    	Thread.sleep(2000);
	    }
	   
	}


