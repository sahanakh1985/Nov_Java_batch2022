package day19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
//print all options present in the list box with its selection status
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample16.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select = new Select(listBox);
		for (WebElement option : select.getOptions()) {
			System.out.print(option.getText());
			System.out.println(option.isSelected() ? ":Is Selected" : ":Is Not Selected");
		}

		driver.quit();

//		List<WebElement> allOptions = select.getOptions();
//		for(int i=0;i<allOptions.size();i++)
//		{
//			WebElement option1 = allOptions.get(i);
//			String text = option1.getText();
//			System.out.print(text+":");
//			boolean selected = option1.isSelected();
//			System.out.println(selected?"Is Selected":"Is Not Selected");
//		}

	}
}
