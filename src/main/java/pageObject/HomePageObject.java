package pageObject;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class HomePageObject {
	
	public WebDriver driver;
	
//	FluentWait<WebDriver> fl = new FluentWait<WebDriver> (driver).withTimeout(30,SECONDS).pollingEvery(null).ignoring(NoSuchElementException.class);
	By signin = By.xpath("//a[contains(@ href,'sign_in')]");
	By textCheck = By.xpath("//*[@id=\'content\']/div/div/h2");
	By HomePopup =	By.xpath("/html/body/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button");
	By navMenuBar = By.xpath("/html/body/header/div[2]/div/nav");
	By MentorPageLink = By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[3]/a");
	By Courses = By.linkText("CONTACT");
	
	
	public HomePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		
	}
	
	public WebElement coursesLink() {
		
		return driver.findElement(Courses);
	}

    public WebElement MentorshipLink() {
    	
    	return driver.findElement(MentorPageLink);
    
    }

	public WebElement getLogin() {
		
		return driver.findElement(signin);
		
	}
	
	public  WebElement getTextOnPage() {
		// TODO Auto-generated method stub
		return	driver.findElement(textCheck);
	}


	
	
	public WebElement getPopupClose() {
		
		return driver.findElement(HomePopup);
	}

	public WebElement getNavBar() {
		
		return driver.findElement(navMenuBar);
	}
}


