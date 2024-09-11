package parallandcross;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class begroup {
	
	@Test(groups= {"Smoke"})
	 void textbox()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Savita");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Thane");
		driver.findElement(By.id("permanentAddress")).sendKeys("Kalyan");
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		driver.close();
	}

	@Test(groups= {"System"})
	public void checkbox() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("item-1")).click();
		driver.findElement(By.xpath("//span[text()='Home']")).click();//click checkbox
		driver.findElement(By.xpath("//button[@type='button' and @class='rct-collapse rct-collapse-btn']")).click();//click on toggle
		driver.findElement(By.xpath("//button[@title='Expand all' and @class='rct-option rct-option-expand-all']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Collapse all'and @class='rct-option rct-option-collapse-all']")).click();
		driver.close();
		
	}
	
	
}
