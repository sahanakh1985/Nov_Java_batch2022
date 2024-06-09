package day17;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Duration defaultITO = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(defaultITO);

		driver.get("https://online.actitime.com/skh/login.do");

		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Duration customITO = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(customITO);

		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
	}

}
