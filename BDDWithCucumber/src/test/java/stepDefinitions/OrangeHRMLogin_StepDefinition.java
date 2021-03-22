package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vethiga
 *
 * 
 */
public class OrangeHRMLogin_StepDefinition {
	
	WebDriver driver;
	
	@Given("^User is on OrangeHRM Site$")
	public void user_is_on_OrangeHRM_Site() throws Throwable {

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}

	@When("^User is entering valid credentials to Login$")
	public void user_is_entering_valid_credentials_to_Login() throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	}

	@When("^User is clicking on Login Button$")
	public void user_is_clicking_on_Login_Button() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();
		
	}

	@Then("^User should be entered into WebSite$")
	public void user_should_be_entered_into_WebSite() throws Throwable {


		String LoginName=driver.findElement(By.id("welcome")).getText();
		
		if (LoginName.equals("Welcome Paul")) {
			System.out.println("Login Test Scenario is passed");
		}
		else {
			System.out.println("Login Test Scenario is failed");
		}
		
		
		// Alternative Step
		
		boolean UserNameStatus=driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
		org.junit.Assert.assertTrue(UserNameStatus);
	}


}
