
package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.HomePageObject;
import pageObject.LoginPageObject;
import resource.Base;

public class LoginPageCalling extends Base{
	


	
	
	@Test(dataProvider="getData")
	public void PageNavigate(String email,String password) throws InterruptedException, IOException {
		driver=InitialiseDriver();
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(7000);
		
		HomePageObject hplog = new HomePageObject(driver);
		//hplog.getPopupClose().click();
		hplog.getLogin().click();
		Thread.sleep(7000);
		
		
		LoginPageObject lp = new LoginPageObject(driver);
		
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.getSubmit().click();
	
		
	}
	
@DataProvider
public Object[][] getData() {
	
	// row for test conditions
	//	for ex. 1.invalid user
	//			2.valid user
	//column for count of data 
	// for ex . 1. email id
	//    		2. password
	
	Object[][] ar= new Object[2][2];
	ar[0][0] = "abc@gmmail.com";
	ar[0][1] = "142frsd";
	
	ar[1][0] ="gh@gmail.com";
	ar[1][1] ="5rtffg";
	
	return ar;
}

@AfterTest
public void AfterTestRun()  {
	
	driver.close();
	
}
	
} 


