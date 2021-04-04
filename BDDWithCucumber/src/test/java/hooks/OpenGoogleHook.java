package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author Vethiga
 *
 * 
 */
public class OpenGoogleHook {

	
	@Before
	public void LearnToOperate() {
		System.out.println("You should have to know cucumber,selenium");
	}
	
	@After
	public void CloseBrowser() {

		System.out.println("You can do any test now!!!");
	}
	
	
}
