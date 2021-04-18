package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import pageObject.MentorshipPageObject;
import resource.Base;

public class CheckMentorPage extends Base {
	


@Test
	public void metorPage() throws IOException, InterruptedException {
	
	driver=InitialiseDriver();
	driver.get(prop.getProperty("url"));
	//Thread.sleep(5000);
	HomePageObject hp = new HomePageObject(driver);
	hp.getPopupClose().click();
	Thread.sleep(2000);
	hp.coursesLink().click();
	hp.MentorshipLink().click();
	
	
	MentorshipPageObject mp = new MentorshipPageObject(driver);
	String hedln = mp.Headline().getText();	
	String pckone = mp.PackageOneM().getText();
	String pcktwo = mp.PackageTwoM().getText();
	Assert.assertEquals(hedln, "MENTORSHIP");
	Assert.assertEquals(pcktwo, "PLATINUM");
	Assert.assertEquals(pckone, "BRONZE");
	System.out.println(hedln);
	System.out.println(pckone);
	System.out.println(pcktwo);
	
		
}

@AfterTest
public void AfterTestRun() {
	
	driver.close();
}

	

}
