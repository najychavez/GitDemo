package test;

import org.testng.Assert;
import org.testng.annotations.*;

public class Day1 {
	
	@Test
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last.");
	}
}