package Mavenproj.selentest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class usedtestng {
@Test(invocationCount=5)
public void testcase1() throws InterruptedException
{
	//Program to automate webtables and 5 times browser will open// after 1flow is complete then new browser will open and flow starts//
	ChromeDriver driver = new ChromeDriver();
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
	Thread.sleep(3000);
}

}
