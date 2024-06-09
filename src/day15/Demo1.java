package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Taking the screenshot of page
public class Demo1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample10.html");
		Thread.sleep(1000);
		SearchContext shadowRoot = driver.findElement(By.id("shadow_host")).getShadowRoot();
		shadowRoot.findElement(By.cssSelector("#t1")).sendKeys("Bhanu");
		shadowRoot.findElement(By.cssSelector("#c1")).click();
	}
}
