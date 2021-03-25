package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vethiga
 *
 * 
 */
public class DataTableWithoutHeader {
	
	WebDriver driver;
	
	@Given("^Navigating to OrangeHRM site$")
	public void navigating_to_OrangeHRM_site() throws Throwable {

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("^Entering Username and Password$")
	public void entering_Username_and_Password(DataTable dataTable) throws Throwable {
		
		List<String> Credentials=dataTable.asList(String.class);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Credentials.get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(Credentials.get(1));
		
	}

	@When("^Clicking on Login Button$")
	public void clicking_on_Login_Button() throws Throwable {
		
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^You should navigated to home page$")
	public void you_should_navigated_to_home_page() throws Throwable {

		boolean UserNameStatus=driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
		org.junit.Assert.assertTrue(UserNameStatus);
		
	}

}
