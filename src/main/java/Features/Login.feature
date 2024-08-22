Feature: Free CRM Login Featur

#Scenario: Free CRM Login Test Scenario

#Given user is already on login page
#When title of the page is Free CRM
#When user clicks on login button
#Then user enters username and password
#Then user clicks on login
#And user is on homepage

Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of the page is Free CRM
When user clicks on login button
Then user enters "<username>" and "<password>"
Then user clicks on login
And user is on homepage
Then close the browser

Examples: 
		| username | password |
		| piragoudapatil199915@gmail.com | Test@123|
		| tom      | Tom@213  |