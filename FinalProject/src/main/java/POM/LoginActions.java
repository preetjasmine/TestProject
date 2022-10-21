package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Commonmethods;
import driverManager.Base;

public class LoginActions {
	private WebDriver driver;
	Commonmethods common = new Commonmethods(Base.getDriver());
	
	public LoginActions(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory .initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Account & Lists')]")
	public WebElement AccountsList;
	
	@CacheLookup
	@FindBy(xpath="(//span[contains(text(),'Sign in')])[2]")
	public WebElement signIn;

	@CacheLookup
	@FindBy(id="ap_email")
	public WebElement email;

	@CacheLookup
	@FindBy(id="continue")
	public WebElement continuebutton;



	public void SignIn() throws InterruptedException
	{

		Actions act= new Actions(driver);
		act.moveToElement(AccountsList).build().perform();
		signIn.click();
	}

	public void SendEmail(String emailkeys)
	{
		email.sendKeys(emailkeys);
		continuebutton.click();
		
	}
	
}
