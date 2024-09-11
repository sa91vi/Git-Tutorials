package Mavenproj.selentest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
	//Program to automate Textbox of demoqa site//

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
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

}
