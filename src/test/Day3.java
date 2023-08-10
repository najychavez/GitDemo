package test;

import org.testng.annotations.*;

public class Day3 {

	@Parameters({ "URL", "APIKey/username" })
	@Test
	public void WebLoginHome(String urlName, String key) {
		// selenium
		System.out.println("web login home");
		System.out.println(urlName);
		System.out.println(key);
	}

	@Test(enabled = true)
	public void MobileLoginHome() {
		System.out.println("Mobile login home");
	}

	@Test
	public void LoginAPIHome() {
		System.out.println("API login home");
	}

	@Test(groups = { "Smoke" })
	public void WebLoginCarLoan() {
		// selenium
		System.out.println("web login car loan");
	}

	@Test(dataProvider = "getData")
	public void MobileLoginCarLoan(String username, String password) {
		System.out.println("Mobile login car loan");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(groups = { "Smoke" })
	public void MobileSiginCarLoan() {
		System.out.println("Mobile signin");
	}

	@Test(timeOut = 4000)
	public void MobileSigoutCarLoan() {
		System.out.println("Mobile signout");
	}

	@Test(dependsOnMethods = { "WebLoginHome", "MobileLoginHome" })
	public void APICarLoan() {
		System.out.println("API car loan");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		// 1st combination - username & password - good credit history
		data[0][0] = "firstSetUsername";
		data[0][1] = "firstPassword";

		/*
		 * 2nd - username & password - no credit history Columns in the row are nothing
		 * but values for that particular combination.
		 */
		data[1][0] = "secondSetUsername";
		data[1][1] = "secondPassword";

		// 3rd - fraudelent credit history
		data[2][0] = "thirdSetUsername";
		data[2][1] = "thirdPassword";

		return data;
	}
}
