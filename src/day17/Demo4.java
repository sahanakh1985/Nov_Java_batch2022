package day17;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://online.actitime.com/skh/login.do");

		System.out.println(driver.getTitle());// actiTIME - Login

		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();

		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(driver.getTitle());// actiTIME - Enter Time-Track

		driver.findElement(By.id("logoutLink")).click();

		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle());// actiTIME - Login

		driver.quit();
	}

}
