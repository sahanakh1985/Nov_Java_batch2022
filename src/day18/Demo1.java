package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		//customwait
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");

		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
		int i = 1;
		while (true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Logout link is found and clicked:" + i);
				break;
			} catch (Exception e) {
				System.out.println("Logout link is not found");
			}
			i++;
		}

		System.out.println("End");

	}
}
