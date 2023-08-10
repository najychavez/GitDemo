package test;

import org.testng.annotations.*;

public class Day4 {
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first.");
	}
	
	@Test(groups= {"Smoke"})
	public void plan() {
		System.out.println("good - day4");
	}
}
