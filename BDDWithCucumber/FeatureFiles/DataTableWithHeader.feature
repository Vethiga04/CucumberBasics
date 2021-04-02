Feature: This is to feature scenario with header table
Scenario: Using different set of credential choices
	Given Navigate to sauceDemo site in Chrome
	When Entering Credentials based on below datas
	|UserName | Password|
	|standard_user|secret_sauce|
	|locked_out_user|1234|
	|Admin12|secret_sauce|
	|Admin|Admin123|
	And Click button to continue the process
	Then User should have to able to navigate to Home page of sauceDemo page