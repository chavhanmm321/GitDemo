package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {
	public WebDriver driver;
	public Properties prop;

		public WebDriver InitialiseDriver() throws IOException {
			
			 prop = new Properties(); 
			FileInputStream fis = new FileInputStream("C:\\Users\\91973\\eclipse-workspace\\ETEProject\\src\\main\\java\\resource\\data.properties");
			
			prop.load(fis); // to load fis file into prop properties.
			String BrowserName = prop.getProperty("browser"); // to call property
			
			System.out.println(BrowserName);
			
			if(BrowserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Software\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
			
			else if(BrowserName == "firefox") {
				
				driver = new FirefoxDriver();
			}
			
			else if(BrowserName == "IE") {
				
				driver = new InternetExplorerDriver()
						;
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			

			return driver;
			
		}
		
	}



