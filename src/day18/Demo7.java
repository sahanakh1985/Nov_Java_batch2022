package day18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("file:///C:/Users/dell/Documents/Sample15.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A1"));

		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();// returns all the options from the list box

		int count = allOptions.size();
		System.out.println(count);
		System.out.println("----");

		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}

		System.out.println("----");
		for (int i = count - 1; i >= 0; i--) {
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
		}
		System.out.println("----");

		String text = select.getWrappedElement().getText();
		System.out.println(text);
		System.out.println("----");

		driver.quit();

	}

}
