package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Academy.HomePageTextCheck;
import pageObject.HomePageObject;
import resource.Base;

public class HomePageTextCheck extends Base{
	
	
	
	@Test(priority=1)
	public void textCheck() throws IOException, InterruptedException {
		
		//private static Logger log = LogManager.getLogger(HomePageTextCheck.class.getName());
		
		driver=InitialiseDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(7000);
		HomePageObject hp = new HomePageObject(driver);
		//hp.getPopupClose().click();
	
		Assert.assertEquals("FEATURED COURSES", hp.getTextOnPage().getText());
		System.out.println(hp.getTextOnPage().getText());
	
		
	}
	

	@AfterTest
	public void AfterTestRun() {
		
		driver.close();
	}
	
}
