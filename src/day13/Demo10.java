package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		WebElement unTB = driver.findElement(By.id("username"));

		WebElement pwTB = driver.findElement(By.xpath("//input[@type='password']"));

		int y1 = unTB.getLocation().getY();
		System.out.println(y1);

		int y2 = pwTB.getLocation().getY();
		System.out.println(y2);

		if (y2 > y1) {
			System.out.println("The password is below  the username");
		} else {
			System.out.println("The password is above the username");

		}

		driver.quit();

	}

}
