package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void navigateLoginPage(WebDriver wd) {
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
	}//webdriver can be given globally

	public static void enterusername(WebDriver wd, String username) {
		wd.findElement(By.name("username")).sendKeys(username);
	}

	public static void enterpassword(WebDriver wd, String password) {
		wd.findElement(By.name("password")).sendKeys(password);
	}

	public static void clickloginbutton(WebDriver wd) {
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();

	}
}
