package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);

		// enter valid user name (Admin)
		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter valid password (admin123)
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);

		// verify that home page is displayed

		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL is:" + actualURL);

		String expectedURL = "dashboard";
		System.out.println("Expected URL contains:" + expectedURL);

		if (actualURL.contains(expectedURL)) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("FAIL: Home page is not displayed");
		}

		driver.quit();
	}

}
