package pom;


import java.io.IOException;

import org.testng.annotations.Test;

import pom.Github_ps;
import pom.Githubhm_page;
import pom.Githubmain_page;
import pom.Githubprj_page;
import pom.Githubsign_page;
import generic_libraries.Generic123;
import generic_libraries.Generic_screenshot;

	public class Github_test extends Generic123
	{
		@Test
		public void run() throws InterruptedException, IOException
		{
			Thread.sleep(4000);
			Githubmain_page gm=new Githubmain_page(driver);
			gm.clk();
			Thread.sleep(4000);
			Githubsign_page gs=new Githubsign_page(driver);
			gs.signfn();
			Thread.sleep(4000);
			Githubhm_page gm1=new Githubhm_page(driver);
			gm1.pclk();
			Thread.sleep(4000);
			Githubprj_page gpr=new Githubprj_page(driver);
			gpr.create();
			Thread.sleep(4000);
			Github_ps gs1=new Github_ps(driver);
			gs1.getu();
			Generic_screenshot sh=new Generic_screenshot();
			sh.getscrenshot(driver);
			Thread.sleep(4000);
			gs1.getcode();
		}

	}


