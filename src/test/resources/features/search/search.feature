Feature: Search by Hotel

 
 @smoke
 Scenario Outline: Searching for Hotel on Hotel.com once
 	Given User is on <URL> page
 	When he enters "<Location>" into location
 	Examples:
 	|URL| Location |
 	|www.hotel.com| New Delhi |
 	
 @regression	
  Scenario Outline: Searching for Hotel on Hotel.com twice
 	Given User is on <URL> page
 	When he enters "<Location>" into location
 	Examples:
 	|URL| Location |
 	|www.yatra.com| London |
 	
 @smoke @regression	
  Scenario Outline: Searching for Hotel on Hotel.com thrice
 	Given User is on <URL> page
 	When he enters "<Location>" into location
 	Examples:
 	|URL| Location |
 	|www.makemytrip.com| France |
