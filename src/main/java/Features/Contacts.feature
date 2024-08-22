Feature: Free CRM create contacts

Scenario Outline: Free CRM create new contact scenario

Given user is already on login page
When title of the page is Free CRM
When user clicks on login button
Then user enters "<username>" and "<password>"
Then user clicks on login
And user is on homepage
Then user moves to new contact page
Then click on create button
Then user enter contact details "<firstname>" and "<lastname>" and "<company>"
Then click on save button
And close the browser

Examples: 
		| username | password | firstname | lastname | company |
		|  piragoudapatil199915@gmail.com | Test@123 | David | Ds | Cotent |
		|  piragoudapatil199915@gmail.com | Test@123 | Oliver | lang | Cotent |