Feature: Free CRM APP test

Scenario: Free CRM create deal test
Given user is on deal page
When user fills the deals form
Then deal is created

Scenario: Free CRM create contact test
Given user is on contact page
When user fills the contact form
Then contact is created