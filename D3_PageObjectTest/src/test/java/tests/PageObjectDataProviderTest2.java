package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class PageObjectDataProviderTest2 {

	@Test(dataProvider = "tests")
	public void simpleFormTest(String prodname, String mobileno, String email, String prodcat, String prodqua,
			String purchasername) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// login page
		LoginPage.navigateLoginPage(wd);
		LoginPage.enterusername(wd, "Akshayaachu");
		LoginPage.enterpassword(wd, "Aswin@1a");
		LoginPage.clickloginbutton(wd);

		// home page

		HomePage.navigatehomepage(wd);
		HomePage.clickformsubmission(wd);
		HomePage.clicksimpleform(wd);

		// checkout page
		CheckoutPage.enterprodname(wd, prodname);
		CheckoutPage.entermobileno(wd, mobileno);
		CheckoutPage.enteremail(wd, email);
		CheckoutPage.enterprodcat(wd, prodcat);
		CheckoutPage.enterprodqua(wd, prodqua);
		CheckoutPage.enterpurchasername(wd, purchasername);
		CheckoutPage.enterGST(wd);
		CheckoutPage.enterpaymentmethod(wd);
		CheckoutPage.placeorder(wd);

	}

	@DataProvider(name = "tests")
	public static Object[][] getSimpleFormTest() throws InterruptedException {

		Object[][] data = new Object[3][6];
		// 1st iteration
		data[0][0] = "samsung mobiles";
		data[0][1] = "1234567890";
		data[0][2] = "user@123";
		data[0][3] = "Electronics";
		data[0][4] = "5";
		data[0][5] = "Akshaya";
		Thread.sleep(2000);
		// 2nd iteration
		data[1][0] = "iphone mobiles";
		data[1][1] = "9786173189";
		data[1][2] = "user@456";
		data[1][3] = "Electronics";
		data[1][4] = "4";
		data[1][5] = "Aswin";
		Thread.sleep(2000);
		// 3rd iteration
		data[2][0] = "redme mobiles";
		data[2][1] = "9889019001";
		data[2][2] = "user@891";
		data[2][3] = "Electronics";
		data[2][4] = "2";
		data[2][5] = "Aakash";
		return data;
	}
}
