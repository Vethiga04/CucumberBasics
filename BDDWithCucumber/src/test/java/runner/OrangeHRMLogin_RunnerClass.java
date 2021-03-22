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

@CucumberOptions(features="FeatureFiles/Login.feature" , glue="stepDefinitions")

public class OrangeHRMLogin_RunnerClass {

}
