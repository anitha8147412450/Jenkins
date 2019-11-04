package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginscptacti 
{
	
	
	
	@FindBy(id="username")
	private WebElement untbox;
	
	@FindBy(name="pwd")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login1;//addr of login btn

	
public Loginscptacti(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

//utilization
public void SetUsername(String un)
{
	untbox.sendKeys(un);
}
public void SetPassword(String pwd)
{
	pwdtbox.sendKeys(pwd);
}
public void clicklogin()
{
login1.click();

}

}
