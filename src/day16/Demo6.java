package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//handle multiple elements->findElements-> xpath
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample14.html");
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allCheckBox.size();
		System.out.println("No. of CheckBoxes:" + count);

		for (WebElement checkBox : allCheckBox) {
			checkBox.click();
			Thread.sleep(500);
		}

		for (int i = count - 1; i >= 0; i--) {
			allCheckBox.get(i).click();
			Thread.sleep(500);
		}

		for (int i = 0; i < count; i += 2) {
			allCheckBox.get(i).click();
			Thread.sleep(500);
		}

		for (int i = count - 2; i >= 0; i -= 2) {
			allCheckBox.get(i).click();
			Thread.sleep(500);
		}
	}

}
