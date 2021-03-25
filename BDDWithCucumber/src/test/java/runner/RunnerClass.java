package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



/**
 * @author Vethiga
 *
 * 
 */


@RunWith(Cucumber.class)

@CucumberOptions(features = "FeatureFiles/DataTableWithoutHeader.feature" , glue="stepDefinitions")
public class RunnerClass {

	//	 It should combine the feature file and step definition
	//	Runner define 

}
