Feature: Select value From Dropdown List

 Scenario: Select second option from Dropdown List
 	Given User is on the-internet.herokuapp.com/dropdown page
 	When he selects "Option 2" from dropdown
 	Then "Option 2" should be selected in dropdown