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

@CucumberOptions(features="FeatureFiles/LoginUsingExpression.feature", glue="stepDefinitions")
public class LoginUsingExpression_RunnerClass {

}
