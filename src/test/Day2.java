package test;

import org.junit.Before;
import org.testng.annotations.*;

public class Day2 {

	@BeforeSuite
	public void befSuite() {
		System.out.println("I'm no. 1 from beginning.");
	}

	@Parameters({"URL"})
	@BeforeTest
	public void prerequisite(String urlName) {
		System.out.println("I will execute first.");
		System.out.println(urlName);
	}

	@BeforeClass
	public void befClass() {
		System.out.println("Before executing all methods in the class.");
	}

	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Execute before each method.");
	}

	@Test(groups= {"Smoke"})
	public void plan() {
		System.out.println("good - day2");
	}
	
	@AfterClass
	public void afClass() {
		System.out.println("After executing all methods in the class.");
	}

	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last.");
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I'm no. 1 from last.");
	}
}
