package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");

		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.ignoring(NoSuchElementException.class);
		wait.pollingEvery(Duration.ofSeconds(1));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();

		System.out.println("End");

	}
}
