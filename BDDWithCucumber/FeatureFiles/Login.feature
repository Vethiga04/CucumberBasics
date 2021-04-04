@SimpleLogin
Feature: This is to verify Login Feature of OrangeHRM
@PositiveScenario
Scenario: This is Login Scenario
	Given User is on OrangeHRM Site
	When User is entering valid credentials to Login
	And User is clicking on Login Button
	Then User should be entered into WebSite
	
@NegativeScenario
Scenario: This is Login scenario with invalid credentials
	Given User is on OrangeHRM Site
	When User is entering valid credentials to Login
	And User is clicking on Login Button
	Then User should be entered into WebSite