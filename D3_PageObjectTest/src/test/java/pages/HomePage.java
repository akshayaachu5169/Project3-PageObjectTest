package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static void navigatehomepage(WebDriver wd) {
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
	}
public static void clickformsubmission(WebDriver wd) {
	wd.findElement(By.id("element44")).click();
	}
public static void clicksimpleform(WebDriver wd){
	wd.findElement(By.id("element45")).click();
}
}


