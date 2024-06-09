package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
	// printing the content of the table in table format
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample5.html");
		List<WebElement> tableHead = driver.findElements(By.xpath("//tr[1]"));
		List<WebElement> firstRowCells = driver.findElements(By.xpath("//tr[2]"));
		List<WebElement> secondRowCells = driver.findElements(By.xpath("//tr[3]"));

		for (WebElement heading : tableHead) {
			System.out.print(heading.getText());

		}
		System.out.println();

		for (WebElement firstRowcell : firstRowCells) {
			System.out.println(firstRowcell.getText());

		}
		for (WebElement secondRowcell : secondRowCells) {
			System.out.println(secondRowcell.getText());

		}
	}
}
