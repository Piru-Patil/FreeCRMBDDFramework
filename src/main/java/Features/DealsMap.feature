Feature: Deals data creation using Maps

Scenario: Free CRM Create Deals using Maps
Given user is on login page
When title of the page is Free CRM
Then user clicks on login button
Then user enters username and password
| username | password |
| piragoudapatil199915@gamil.com | Test@123 |
Then user click on login
And user is on homepage
Then user moves to deals page
Then click on create button
Then user enters deal details
| title | company | products |
| Grocery | Flipkart | Vegitables |
| Electronics | Amazon | Mobiles |
| Fashion | Myntra | Shirts |
And close the browser