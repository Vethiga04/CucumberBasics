package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vethiga
 *
 * 
 */
public class OpenGoogle_HookExplained {

	WebDriver driver;
	WebElement SearchField;

	@Given("^Navigate to Google chrome$")
	public void navigate_to_Google_chrome() throws Throwable {

		driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com/");
//		navigate.to("www.google.com");

	}

	@When("^Enter Google$")
	public void enter_Google_com() throws Throwable {

		SearchField=driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		SearchField.sendKeys("Google.com");

	}

	@When("^Click on Enter button$")
	public void click_on_Enter_button() throws Throwable {

		SearchField.sendKeys(Keys.ENTER);


	}

	@Then("^User should be able to view the results$")
	public void user_should_be_able_to_view_the_results() throws Throwable {

		driver.quit();
		System.out.println("You got the result...");

	}

}
