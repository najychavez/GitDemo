package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * ITestListeners is an interface which implements TestNG listeners
 */

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed Listeners Pass code.");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code
		// response if API is failed
		System.out.println("I failed executing Listeners Pass code.");
	}
}