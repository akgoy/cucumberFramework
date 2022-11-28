Feature: Login scenarios for Salesforce Application

Scenario Outline: Login into salesforce with valid username and password
Given User launch the salesforce application
Then User enter username "<username>"
And user enter password "<password>"
Then Click on login button

Examples:
|username|password|
|some@tek.com|xFsqF6WuRujaQa5|
|Jnanesh@te.com|test123|

