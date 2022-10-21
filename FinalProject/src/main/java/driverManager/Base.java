package driverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public void setup(String browser , String url)
	{
		String path= System.getProperty("user.dir");
		System.out.println("Returning location"+path);
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14166\\Automation\\FinalProject\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if( browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\14166\\Automation\\FinalProject\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("no browser");
			System.exit(0);
			}
		
		//LAUNCH AMAZON URL
		if(url!="")
		{
		driver.get(url);
	    }
		else 
		{
			driver.get("about:blank");
		}
	}
	
	
		
	public void teardown()
	{
		driver.quit();
		//driver.close();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static  WebDriver getDriver()    
	{
		return driver;
	}
}
