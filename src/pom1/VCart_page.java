package pom1;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class VCart_page 
	{

		@FindBy(xpath="//a[contains(.,'Men Hooded Neck Dark Blue T-Shirt')]")
		private WebElement pname;
		@FindBy(xpath="//a[contains(.,'Men Hooded Neck Dark Blue T-Shirt')]/../..//span[@class='pMSy0p XU9vZa']")
		private WebElement price;
		
	    public VCart_page (WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	    public void sizeclk()
	    {
	    	String s=pname.getText();
	    	System.out.println(s);
	    }
	    public void addclk()
	    {
	    	String s1=price.getText();
	    	//int t=Integer.parseInt(s1);
	    	System.out.println(s1);
	    }
	}




