package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckOutTest1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		//login page
//		wd.get("https://djangovinoth.pythonanywhere.com/login/");
//		wd.findElement(By.name("username")).sendKeys("Akshayaachu");
//		wd.findElement(By.name("password")).sendKeys("Aswin@1a");
//		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();

		LoginPage.navigateLoginPage(wd);
		LoginPage.enterusername(wd, "Akshayaachu");
		LoginPage.enterpassword(wd, "Aswin@1a");
		LoginPage.clickloginbutton(wd);

//		//home page
//		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
//		wd.findElement(By.id("element44")).click();
//        wd.findElement(By.id("element45")).click();

		HomePage.navigatehomepage(wd);
		HomePage.clickformsubmission(wd);
		HomePage.clicksimpleform(wd);

		// checkout page
//        wd.findElement(By.id("id0")).sendKeys("samsung mobiles");
//        wd.findElement(By.id("id1")).sendKeys("1234567890");
//        wd.findElement(By.id("id2")).sendKeys("user@123");
//       WebElement prodcat= wd.findElement(By.id("id3"));
//       Select s = new Select(prodcat);
//       s.selectByVisibleText("Electronics");
//      
//       wd.findElement(By.id("id4")).sendKeys("5");
//       wd.findElement(By.id("id5")).sendKeys("Akshaya");
//       wd.findElement(By.id("idyes")).click();
//       wd.findElement(By.id("cod")).click();
//       wd.findElement(By.id("order")).click();
//       

		CheckoutPage.enterprodname(wd, "samsung mobiles");
		CheckoutPage.entermobileno(wd, "1234567890");
		CheckoutPage.enteremail(wd, "user@123");
		CheckoutPage.enterprodcat(wd, "Electronics");
		CheckoutPage.enterprodqua(wd, "5");
		CheckoutPage.enterpurchasername(wd, "Akshaya");
		CheckoutPage.enterGST(wd);
		CheckoutPage.enterpaymentmethod(wd);
		CheckoutPage.placeorder(wd);

	}

}
