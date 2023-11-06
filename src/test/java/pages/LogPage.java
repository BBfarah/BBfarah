package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogPage {
	WebDriver driver;
By txt_email=By.name("email");
By txt_password = By.name("password");
By btn_login = By.id("submit-login");
By moncompte = By.xpath("//*[@id=\"main\"]/header/div/h2/span");
By failure =By.xpath("//*[@class='alert alert-danger']");

public LogPage(WebDriver driver) {
	this.driver = driver ;
}
public void enterEmail (String email) {
	driver.findElement(txt_email).sendKeys(email);
}
public void enterPassword (String password) {
	driver.findElement(txt_password).sendKeys(password);
}

public void Clicklogin() {
	driver.findElement(btn_login).click();
}
public void moncompte() {
	driver.findElement(moncompte).isDisplayed();
} 

public void failure() {
	driver.findElement(failure).isDisplayed();
}

}
