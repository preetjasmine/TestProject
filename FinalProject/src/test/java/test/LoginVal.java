package test;

import org.testng.annotations.Test;

import POM.LoginActions;
import POM.NavigateActions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

 class LoginVal extends Launch {
	LoginActions login;
	NavigateActions action;
	
@BeforeClass
  public void beforeClass()
  {
	  login=new LoginActions(driver);
  }

@Test
    public void ValidSignIn() throws InterruptedException
    {
	  login.SignIn();
    }

@Parameters({"validemail"})
@Test()
public void validLogin(String emailSend)
{
	  login.SendEmail(emailSend);
	  driver.get("https://www.amazon.ca/");
	 
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
 }
