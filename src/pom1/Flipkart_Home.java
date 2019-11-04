package pom1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Flipkart_Home 
	{
		
		@FindBy(xpath="//span[.='Men']")
		private WebElement mhover;
		@FindBy(xpath="//a[.='T-Shirts']")
		private WebElement tlink;
	    public Flipkart_Home(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    	Actions act=new Actions( driver);
	    	act.moveToElement(mhover).perform();
	    }
	    
	  
	    public void lclk() throws InterruptedException
	    {
	    	Thread.sleep(2000);
	    	tlink.click();
	    	Thread.sleep(2000);
	    }
	   
	}

	


