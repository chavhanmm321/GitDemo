package Academy;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import resource.Base;


public class CheckNavBar extends Base{



	@Test(priority=1)
	public void CheckNavBarMethod() throws IOException, InterruptedException {
		
		driver=InitialiseDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(7000);
		HomePageObject hpnav = new HomePageObject(driver);
		//hpnav.getPopupClose().click();
		
		
		
		Assert.assertTrue(hpnav.getNavBar().isDisplayed());
	
	}
	
	@AfterTest
	public void AfterTestRun() {
		
		driver.close();
	}
	
}
