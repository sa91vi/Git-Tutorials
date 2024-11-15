package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import FB_Login.listenertest;
import FB_Login.logintofb;

@Listeners(listenertest.class)
public class logintofbtest extends listenertest{

	@Test(retryAnalyzer=FB_Login.Retryclass.class)
	public void logintest() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		logintofb pm=new logintofb();
		pm.inputmail();
		pm.inputpsw();
		pm.clicklogin();
		
		
		//Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
		
	
	}
}
