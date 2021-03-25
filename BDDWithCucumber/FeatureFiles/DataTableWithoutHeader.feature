Feature: This is Login Feature of Orange HRM
Scenario: Here Sending Datas without regular Expressions
	Given Navigating to OrangeHRM site
	When Entering Username and Password
	|Admin|admin123|
	And Clicking on Login Button
	Then You should navigated to home page