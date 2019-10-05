Feature: Search by Hotel

 
 Scenario Outline: Searching for Hotel on Hotel.com
 	Given User is on Hotel.com page
 	When he enters "<location>" into location
 	And he enters "<checkin_date>" into checkin
 	And he enters "<checkout_date>" into checkout
 	And clicks on search button
 	Then he should find given "<location>" on result page
 	Examples:
 	|location| checkin_date | checkout_date |
 	|New Delhi| 31/08/2019	|  02/09/2019 	|
 	
  Scenario Outline: Searching for Hotel on Hotel.com twice
 	Given User is on Hotel.com page
 	When he enters "<location>" into location
 	And he enters "<checkin_date>" into checkin
 	And he enters "<checkout_date>" into checkout
 	And clicks on search button
 	Then he should find given "<location>" on result page
 	Examples:
 	|location| checkin_date | checkout_date |
 	|New Delhi| 31/08/2019	|  02/09/2019 	|
 	
  Scenario Outline: Searching for Hotel on Hotel.com thrice
 	Given User is on Hotel.com page
 	When he enters "<location>" into location
 	And he enters "<checkin_date>" into checkin
 	And he enters "<checkout_date>" into checkout
 	And clicks on search button
 	Then he should find given "<location>" on result page
 	Examples:
 	|location| checkin_date | checkout_date |
 	|New Delhi| 31/08/2019	|  02/09/2019 	|