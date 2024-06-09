package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A3"));

		Select select = new Select(listBox);

		String text = select.getWrappedElement().getText();
		System.out.println(text);
		System.out.println("_________________________________");

		List<WebElement> allOptions = select.getOptions();
		int count = allOptions.size();
		System.out.println(count);

		for (WebElement option : allOptions)
			System.out.println(option.getText());

		System.out.println("_________________________________");

		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement selectedoption : selectedOptions)
			System.out.println(selectedoption.getText());

		System.out.println("_________________________________");

		WebElement option = select.getFirstSelectedOption();
		System.out.println(option.getText());

		driver.close();

	}

}
