Feature: This is to test Google Search
Scenario: Google Search Scenario
	Given User is entering google.co.in
	When User is typing the search term "Cucumber"
	And Clicks the search button
	Then User should see the search results