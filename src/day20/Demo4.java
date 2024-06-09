package day20;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.findElement(By.xpath("//span[.='departure']")).click();
		Thread.sleep(1000);

		String month = "June";
		String year = "2023";
		String day = "10";

		String xp = "(//span[.='" + year + "']/parent::div[text()='" + month + "']/../..//p[.='" + day
				+ "'])[1]|//div[text()='" + month + " " + year + "']/../..//p[text()='" + day + "']";
		System.out.println(xp);
		String next = "//span[@ aria-label='Next Month']";

		for (int i = 1; i <= 12; i++) {
			try {
				driver.findElement(By.xpath(xp)).click();
				break;
			} catch (Exception e) {
				System.out.println("Date not found, hence clicking ->" + i);
				driver.findElement(By.xpath(next)).click();
			}
		}

		Thread.sleep(4000);

		driver.quit();
	}

}
