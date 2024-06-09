package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url
		driver.get("https://online.actitime.com/skh/login.do");
		// enter valid user name (admin)
		driver.findElement(By.id("username")).sendKeys("trainee");
		// enter valid password (manager)
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		// click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(5000);

		// verify that home page is displayed
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is:" + actualTitle);

		String expectedTitle = "actiTIME - Enter Time-Track";
		System.out.println("Expected Title is:" + expectedTitle);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("FAIL: Home page is not displayed");
		}

		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL is:" + actualURL);

		String expectedURL = "enter";
		System.out.println("Expected URL contains:" + expectedURL);

		if (actualURL.contains(expectedURL)) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("FAIL: Home page is not displayed");
		}

		boolean displayed = driver.findElement(By.xpath("//a[@id='logoutLink']")).isDisplayed();
		System.out.println("Logout link is displayed:" + displayed);
		if (displayed) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("FAIL: Home page is not displayed");
		}
		driver.quit();
	}

}
