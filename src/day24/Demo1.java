package day24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage {
	//handling "alert pop-up" by using POM
	
	final String element_id = "A1";
	@FindBy(id = element_id)
	private WebElement submitButton;

	private WebDriver driver;

	LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	void clickSubmit() {
		submitButton.click();
	}

	void printAlertMsg() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample17.html");
		LoginPage l = new LoginPage(driver);
		l.clickSubmit();
		l.printAlertMsg();
	}

}
