package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
	}

}
