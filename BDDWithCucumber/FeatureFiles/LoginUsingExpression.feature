Feature: This is to verify Login Feature of OrangeHRM using Expression
Scenario: This is Login Scenario
	Given User is on OrangeHRM Login Page
	When User enters "Admin" as Username and "admin123" as Password
	And User clicks on Login Button
	Then User should be navigated to Homepage