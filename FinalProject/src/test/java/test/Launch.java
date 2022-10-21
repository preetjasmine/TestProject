package test;

import org.testng.annotations.BeforeSuite;

import Utils.readPropertyFile;
import driverManager.Base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class Launch {
	static WebDriver driver;
	Base b= new Base();
	readPropertyFile file;
	Properties prop;
 
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  file=new readPropertyFile();
	  prop= file.readPropfile();
	  b.setup(prop.getProperty("browser"),prop.getProperty("url"));
	  driver= Base.getDriver(); 
   }

  @AfterSuite
  public void afterSuite() 
  {
     b.teardown();
  }

}
