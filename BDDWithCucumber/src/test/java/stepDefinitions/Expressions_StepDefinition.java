package stepDefinitions;

import cucumber.api.java.en.Given;

/**
 * @author Vethiga
 *
 * 
 */
public class Expressions_StepDefinition {

	
	@Given("^I am having (\\d+) pet$")
	public void I_am_having_1_pet(int Value) throws Throwable{
		System.out.println("Pet count: "+Value);
	}
	//d take values between 0-9
	
	@Given("^My Working hours is (\\d+\\.\\d+)$")
	public void My_Working_hours_is(float Hours) throws Throwable{
		System.out.println("Working Hours: "+Hours);
	}
	
	@Given("^\"(.*?)\" has Name as \"(.*?)\" and \"(.*?)\"$")
	public void has_Name_as_and(String name1,String name2, String name3) throws Throwable{
		System.out.println("User's names: "+name1+","+name2+" and "+name3);
	}
	


}
