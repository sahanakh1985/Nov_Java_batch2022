package day24;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	void testA() {
		System.out.println("1.Executing testA() of Demo4"); // prints in console only
		Reporter.log("2.Executing testA() of Demo4"); // only html
		Reporter.log("3.Executing testA() of Demo4", true); // html and console
		Reporter.log("4.Executing testA() of Demo4", false); // only html
	}

}
