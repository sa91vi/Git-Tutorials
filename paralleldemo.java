package parallandcross;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleldemo {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void launchbrowser(String bw)
	{
		if(bw.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		if(bw.equals("Edge")) {
			driver=new EdgeDriver();
			
		
	}
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	driver.findElement(By.id("item-3")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;//scroll
	js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.id("addNewRecordButton")).click();
	driver.findElement(By.id("firstName")).sendKeys("Pet");
	driver.findElement(By.id("lastName")).sendKeys("Test");
	driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("age")).sendKeys("12");
	driver.findElement(By.id("salary")).sendKeys("10000");
	driver.findElement(By.id("department")).sendKeys("Electronics");
	driver.findElement(By.id("submit")).click();
	}
}
