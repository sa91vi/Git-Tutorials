package Mavenproj.selentest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton {
	//Program to automate Radiobutton of demoqa site//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("item-2")).click();
		WebElement button=driver.findElement(By.xpath("//input[@id='yesRadio' and @type='radio']"));
		button.sendKeys(Keys.ENTER);//***
		WebElement nobutton=driver.findElement(By.id("noRadio"));
		boolean check=nobutton.isEnabled();
		System.out.println("No button is not Enabled and output is "+check);
		
		
	}

}
