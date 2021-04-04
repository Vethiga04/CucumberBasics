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

@CucumberOptions(features = "FeatureFiles" , glue={"stepDefinitions","hooks"},
							dryRun=false,
							monochrome=true,
							plugin= {"html:Reports/htmlReport" , "json:Reports/jsonReport.json","junit:Reports/xmlReport.xml"},
							tags= {"@Hooks"})

public class RunnerClass {

	//	 It should combine the feature file and step definition
	//	Runner define 

}
