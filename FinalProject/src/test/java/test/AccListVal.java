package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.NavigateActions;

public class AccListVal extends Launch{
	NavigateActions acc;
	
	@BeforeTest
	  public void beforeTest() 
	{
		acc= new NavigateActions(driver);
    }
	

	@Test
  public void AccListVal() throws InterruptedException
  {
	  Assert.assertTrue(acc.AccountsList.isDisplayed(), "Accounts and Lists is not available on Page");
	  Assert.assertTrue(acc.AccountsList.getText().contains("Account & Lists"),"Not Correct Link");
	  acc.NavigateToAccountsActions();
  }
 
 @Test
  public void ValidationCreateWishList() throws InterruptedException
  {
	  acc.CreateWishList();
	  String expectedTitle= "Wish List";
	  String actualTitle= driver.getTitle();
	  Assert.assertTrue(expectedTitle.contains(actualTitle), "This is not 'create a wishlist' page");
	  driver.navigate().back();
  }
}
