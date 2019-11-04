package Propery;


import java.util.Set;
import org.testng.annotations.Test;
import pom1.Flipkart_Home;
import pom1.Flipkart_Loginpage;
import pom1.Partshirt_page;
import pom1.Tshirt_page;
import pom1.VCart_page;
import generic_libraries.Generic_class;



	public class Testflipkart extends Generic_class
	{
	  @Test
	  public void run() throws InterruptedException
	  {
		
		 Flipkart_Loginpage fl=new Flipkart_Loginpage(driver);
		 
			 Thread.sleep(5000); 
		 
			  Thread.sleep(8000);
			  fl.txtsnd();
			  Thread.sleep(5000);
			  fl.pwdsnd();
			  Thread.sleep(8000);
			  fl.log();
			  Thread.sleep(3000);
		
			  Flipkart_Home fh=new Flipkart_Home(driver);
			  
			  Thread.sleep(3000);
			  
			  fh.lclk();
			  Thread.sleep(3000);
			  Tshirt_page tg=new Tshirt_page(driver);
			  tg.lclk();
			  Thread.sleep(3000);
			 Set<String> allid = driver.getWindowHandles();
			
			// allid.remove(p_id);
			 for(String s:allid)
			 {
				 driver.switchTo().window(s);
				 Partshirt_page ps=new Partshirt_page(driver);
				 Thread.sleep(3000);
				 ps.sizeclk();
				 Thread.sleep(3000);
				 ps.addclk();
				
			 }
			 Thread.sleep(3000);
			 
			 VCart_page v=new VCart_page(driver);
			 Thread.sleep(3000);
			 v.sizeclk();
			 Thread.sleep(3000);
			 v.addclk();
	  }
	}

	


