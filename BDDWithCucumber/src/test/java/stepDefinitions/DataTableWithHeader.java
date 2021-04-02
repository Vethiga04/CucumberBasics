package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
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
public class DataTableWithHeader {

	WebDriver driver;
	
	@Given("^Navigate to sauceDemo site in Chrome$")
	public void navigate_to_sauceDemo_site_in_Chrome() throws Throwable {

		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
	}

	@When("^Entering Credentials based on below datas$")
	public void entering_Credentials_based_on_below_datas(DataTable Datatable) throws Throwable {

		List<Map<String,String>> CredentialCombination= Datatable.asMaps(String.class, String.class);
		
		String UserName=CredentialCombination.get(0).get("UserName");
		String Password=CredentialCombination.get(0).get("Password");
		
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		
		
	}

	@When("^Click button to continue the process$")
	public void click_button_to_continue_the_process() throws Throwable {

		driver.findElement(By.id("login-button")).click();
		
	}
	

	@Then("^User should have to able to navigate to Home page of sauceDemo page$")
	public void user_should_have_to_able_to_navigate_to_Home_page_of_sauceDemo_page() throws Throwable {

		String ProductText=driver.findElement(By.xpath("//div/span[@class=\"title\"]")).getText();
		
		Assert.assertEquals("PRODUCTS", ProductText);
		driver.quit();
		
	}
	

}
