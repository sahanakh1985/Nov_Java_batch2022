package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//how to verify alert pop is displayed or not?

public class Demo10 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("file:///C:/Users/dell/Documents/Sample17.html");
		driver.findElement(By.id("A1")).click();

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert is present");
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}

		driver.quit();

	}

}
