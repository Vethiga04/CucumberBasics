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
public class DataTableWithExample {

	WebDriver driver;

	@Given("^Naviagte to SwagLabs Page$")
	public void naviagte_to_SwagLabs_Page() throws Throwable {

		driver=new ChromeDriver();

		driver.navigate().to("https://www.saucedemo.com/");

	}

	@When("^Enter Credentials username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void enter_Credentials_username_as_and_password_as(String Username, String Password) throws Throwable {

		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);

	}

	@When("^Click on the Login Button$")
	public void click_on_the_Login_Button() throws Throwable {

		driver.findElement(By.id("login-button")).click();

	}

	@Then("^User can able to enter SwagLabs home page$")
	public void user_can_able_to_enter_SwagLabs_home_page() throws Throwable {


//		boolean EnablingPaneHeader=driver.findElement(By.xpath("//div/span[@class=\"title\"]")).isDisplayed();

		String Cur_URL=driver.getCurrentUrl();

		if(Cur_URL.equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("Passed!!!");
		}
		else {
			System.out.println("Failed....");
		}
		driver.quit();

	}


}
