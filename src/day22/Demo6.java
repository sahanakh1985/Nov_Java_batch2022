package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage2 {
	// declaration->unTB,pwTB,loginBTN
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;

	// initializationunTB,pwTB,loginBTN
	LoginPage2(WebDriver driver) {
		unTB = driver.findElement(By.id("username"));
		pwTB = driver.findElement(By.name("pwd"));
		loginBTN = driver.findElement(By.id("loginButton"));
	}

	// utilization
	void setUserName(String un) {
		unTB.sendKeys(un);
	}

	void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}

	void clickLogin() {
		loginBTN.click();
	}
}

public class Demo6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		LoginPage2 l = new LoginPage2(driver);
		l.setUserName("trainee");
		l.setPassword("trainee");
		l.clickLogin();

	}
}
