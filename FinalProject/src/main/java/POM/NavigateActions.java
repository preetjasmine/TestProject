package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Commonmethods;
import driverManager.Base;

public class NavigateActions 
{
	Actions act;
	WebDriver driver;
Commonmethods common=new Commonmethods(Base.getDriver());
	
	
	public NavigateActions(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Account & Lists')]")
	public WebElement AccountsList;
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Create a Wish List')]")
	public WebElement CreateWishList;
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'New Releases')]")
	public WebElement NewReleases;
	
	@CacheLookup
	@FindBy(xpath="//span[@class='a-price a-text-price a-size-medium']")
	public WebElement price;
	
	public void NavigateToAccountsActions() throws InterruptedException
	{
		act=new Actions(driver);
		act.moveToElement(AccountsList).build().perform();
		common.higlightement(AccountsList);
	}
	
	public void CreateWishList()
	{
		common.higlightement(CreateWishList);
		common.Click(CreateWishList);
	}
	
	public void NewReleases()
	{
		common.higlightement(NewReleases);
		common.Click(NewReleases);
	}
	
	public void getMobilePrice()
	{
		act= new Actions(driver);
		act.moveToElement(price);
	}
}
