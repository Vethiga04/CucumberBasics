package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vethiga
 *
 * 
 */
public class LoginUsingExpression_StepDefinition {

	WebDriver driver;
	
	@Given("^User is on OrangeHRM Login Page$")
	public void User_is_on_OrangeHRM_Login_Page() throws Throwable{
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("^User enters \"(.*?)\" as Username and \"(.*?)\" as Password$")
	public void User_enters_as_Username_and_as_Password(String Username, String Password) throws Throwable{
		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}
	
	
	@And("^User clicks on Login Button$")
	public void User_clicks_on_Login_Button() throws Throwable{
		
		driver.findElement(By.id("btnLogin")).click();

	}


	@Then("^User should be navigated to Homepage$")
	public void User_should_be_navigated_to_Homepage() throws Throwable {
		
		boolean UserNameStatus=driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
		org.junit.Assert.assertTrue(UserNameStatus);
	}

}

