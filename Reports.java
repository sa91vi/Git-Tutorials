package Fieldglassproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reports {
static WebDriver driver;
	public static void main(String[] args) {
		// Automation of Report Module
		driver=new EdgeDriver();
		driver.get("https://www.fieldglass.net/desktop.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("usernameId_new")).sendKeys                            ("Bunty Mandhyan");
		driver.findElement(By.id("passwordId_new")).sendKeys                            ("Fg@Dec2023");
		driver.findElement(By.className("formLoginButton_new")).click();
		WebElement main=driver.findElement(By.id("viewMenu_2_analytics_header_link"));
		main.click();
		Actions actions = new Actions(driver);
		WebElement submenu=driver.findElement(By.id("analyticsMenu_1_viewMyReportGraph_link"));
		actions.moveToElement(submenu);
		actions.click().build().perform();
		driver.findElement(By.id("createReportButton")).click();
		driver.findElement(By.id("70")).click();
		/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement located=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='My Reports']")));
		located.click();
		driver.quit();*/
		
		
		
	}

}
