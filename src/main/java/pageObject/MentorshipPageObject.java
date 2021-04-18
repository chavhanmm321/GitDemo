package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MentorshipPageObject {
	
	public WebDriver driver;
	
	public MentorshipPageObject(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	By Headline = By.cssSelector(".inner-box>h1");
	By PackageOne = By.xpath("//*[text() ='BRONZE']");	
	By PackageTwo = By.xpath("//*[text() ='PLATINUM']");

	
	public WebElement Headline() {
		
		return driver.findElement(Headline);
	}
	
	public WebElement PackageOneM() {
		
		return driver.findElement(PackageOne); 
	}
	
	public WebElement PackageTwoM() {
		
		return driver.findElement(PackageTwo);
		
	} 
	
}
