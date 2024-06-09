package day17;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
	// IW-FE & FEs
	// EW-any method

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://online.actitime.com/skh/login.do");

		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			driver.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
