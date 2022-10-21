package test;

import org.testng.annotations.Test;

import POM.NavigateActions;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

    public class NewReleaseVal extends Launch{
	NavigateActions actions;
	
	@BeforeClass
	  public void beforeClass() 
	  {
		actions=new NavigateActions(driver);		
	  }
	
	
  @Test 
  public void NewReleaseVal() 
  {
	    Assert.assertTrue(actions.NewReleases.isDisplayed(), "New Releases is not on the page");
		actions.NewReleases();
		String expectedURL=  "https://www.amazon.ca/gp/new-releases/?ref_=nav_cs_newreleases";
		String actualURL= driver.getCurrentUrl();
		Assert.assertTrue(expectedURL.contains(actualURL), "This is not New Releases Page");
		driver.navigate().back();
  }
  
}
