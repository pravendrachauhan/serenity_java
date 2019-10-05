Feature: Search by keyword

 Scenario Outline: Searching for a term
 	Given User is on Google.com page
 	When he searches for "<term>"
 	Then all the search result titles should contain the word "<term>"
 	
 	Examples:
 	|term|
 	|cucumber|
 	|world|
 	|America|
 	|India|
 	