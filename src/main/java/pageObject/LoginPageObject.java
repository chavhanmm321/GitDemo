package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;
	
	By email = By.xpath("//*[@id='user_email']");
	By password = By.xpath("//*[@id='user_password']");
	By submitButton = By.cssSelector(".btn");
	
	
	public LoginPageObject(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getEmail() {
		
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		
		return driver.findElement(password);
	}
	
	public WebElement getSubmit() {
		
		return driver.findElement(submitButton);
	}
	
	
	
	
	
}
