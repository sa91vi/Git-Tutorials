package Mavenproj.selentest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	//Program to automate Checkbox of demoqa site//
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
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
