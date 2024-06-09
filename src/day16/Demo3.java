package day16;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		int i;// variable can hold only one value at a time
		i = 10;
		i = 20;
		System.out.println(i);

		int[] a = { 10, 30 }; // array size is fixed
		System.out.println(a[0]);
		System.out.println(a[1]);

		ArrayList<String> b = new ArrayList<String>();
		b.add("Bhanu");
		b.add("Ravi");

		System.out.println(b.get(0));
		System.out.println(b.get(1));

		b.add("Surya");
		System.out.println(b.get(2));

	}
}
