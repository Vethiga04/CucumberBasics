package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
public class OpenGoogle_StepDefinition {

	WebDriver driver;

	@Given("^User is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in/");

	}

	@When("^User is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String SearchTerm) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(SearchTerm);

	}

	@When("^Clicks the search button$")
	public void clicks_the_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^User should see the search results$")
	public void user_should_see_the_search_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Status=driver.findElement(By.partialLinkText("Cucu")).isDisplayed();

		if(Status) {
			System.out.println("Results Displayed");
		}
		else {
			System.out.println("Results are not displayed");
		}
	}



}
