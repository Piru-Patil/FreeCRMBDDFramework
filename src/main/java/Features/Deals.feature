Feature: Deal data creation

Scenario: Free CRM create a new Deal

Given user is already on login page
When title of the page is Free CRM
When user clicks on login button
Then user enters username and password
| piragoudapatil199915@gmail.com | Test@123 |
Then user clicks on login
And user is on homepage
Then user moves to deals page
Then click on create button
Then user enter deal details
| Grocery | Flipkart | Vegitables |
Then click on save button
And close the browser