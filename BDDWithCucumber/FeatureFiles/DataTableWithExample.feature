Feature: This is to verify login feature with Examples keyword
Scenario Outline: This is login scenario with multiple combination credentials
	Given Naviagte to SwagLabs Page
	When Enter Credentials username as "<Username>" and password as "<Password>"
	And Click on the Login Button
	Then User can able to enter SwagLabs home page
	
	
	Examples:
	|Username            |Password    |
	|standard_user       |secret_sauce|
	|problem_user        |secretu     |
	|PerformanceUser     |secret_sauce|