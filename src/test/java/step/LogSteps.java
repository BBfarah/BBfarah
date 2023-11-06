package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogPage;
import pages.ModPage;

public class LogSteps {
	
	WebDriver driver =null;
	LogPage login;
	ModPage Mod;
	
	@Before
	public void browserSetup () throws InterruptedException { 
		System.out.println (" User Is inside browserSetup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@After
	public void tearDown () {
		driver.close();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.tunisianet.com.tn/connexion?back=my-account");
	}
	
	@When("^user enters(.*)and(.*)$")
	public void user_enters_email_and_password(String email, String password) {
		System.out.println("Inside step-user enters email and password");
		login =new LogPage(driver);
		login.enterEmail(email);
		login.enterPassword(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step-clicks on login button");
		login.Clicklogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside step-user is navigated to home page");
		login.moncompte();
	}
	@Then("error message is displayed")
	public void error_message_is_displayed() {
		System.out.println("Inside step-error message is displayed");
	    login.failure();
	}
	
	
	@When("user clicks the Information button")
	public void user_clicks_the_information_button() {
		Mod = new ModPage(driver);
	    Mod.clickInformationButton();
	}

	@And("^user sends newName(.*)and(.*)$")
	public void user_sends_new_name_name_and_password( String name, String password) {
		Mod.enterName(name);
		Mod.enterPassword(password);
	}

	@When("user clicks the Save button")
	public void user_clicks_the_save_button() {
		Mod.clickSave();
	}

	@Then("the user name is changed")
	public void the_user_name_is_changed() {
	}
	
}
