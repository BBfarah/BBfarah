package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModPage {
	WebDriver driver;
	
	By informationButton = By.xpath("//*[@id='identity-link']");
	By username= By.xpath("//*[@name='firstname']");
	By pass=By.xpath("//*[@name='password']");
	By save=By.xpath("//*[@class='btn btn-primary form-control-submit float-xs-right']");
	
	public ModPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void clickInformationButton() {
        driver.findElement(informationButton).click();
    }
	public void enterName (String name) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(name);
	}
	
	public void enterPassword (String password) {
		driver.findElement(pass).sendKeys(password);
	}
	public void clickSave () {
		driver.findElement(save).click();
	}
}