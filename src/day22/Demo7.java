package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//limitation no1. we cant initialize all the elements in constructor , becuase some the elements
//will appear during runtime-ex err msg
class LoginPage3 {
	// declaration->unTB,pwTB,loginBTN
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	private WebElement errMsg;

	// initialization:unTB,pwTB,loginBTN
	LoginPage3(WebDriver driver) {
		unTB = driver.findElement(By.id("username"));
		pwTB = driver.findElement(By.name("pwd"));
		loginBTN = driver.findElement(By.id("loginButton"));
		errMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
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

	void getErrMsg() {
		System.out.println(errMsg.getText());
	}
}

public class Demo7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/skh/login.do");
		LoginPage3 l = new LoginPage3(driver);
		l.setUserName("admin");
		l.setPassword("damager");
		l.clickLogin();
		l.getErrMsg();
	}
}
