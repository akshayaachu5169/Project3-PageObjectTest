package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	public static void enterprodname(WebDriver wd, String prodname) {
		wd.findElement(By.id("id0")).sendKeys(prodname);
	}

	public static void entermobileno(WebDriver wd, String mobileno) {
		wd.findElement(By.id("id1")).sendKeys(mobileno);
	}

	public static void enteremail(WebDriver wd, String mailid) {
		wd.findElement(By.id("id2")).sendKeys(mailid);
	}

	public static void enterprodcat(WebDriver wd, String Electronics) {
		WebElement prodcat = wd.findElement(By.id("id3"));
		Select s = new Select(prodcat);
		s.selectByVisibleText(Electronics);
	}

	public static void enterprodqua(WebDriver wd, String prodqua) {
		wd.findElement(By.id("id4")).sendKeys(prodqua);
	}

	public static void enterpurchasername(WebDriver wd, String purname) {
		wd.findElement(By.id("id5")).sendKeys(purname);
	}

	public static void enterGST(WebDriver wd) {
		wd.findElement(By.id("idyes")).click();
	}

	public static void enterpaymentmethod(WebDriver wd) {

		wd.findElement(By.id("cod")).click();
	}

	public static void placeorder(WebDriver wd) {

		wd.findElement(By.id("order")).click();
	}

	;
}
