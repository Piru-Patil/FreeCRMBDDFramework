@FunctionalTest
Feature: Free CRM Apllication testing

@SmokeTest @RegressionTest
Scenario: Login with valid username and password
Given This is valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is invalid login test

@SomkeTest @RegressionTest
Scenario: Create a contact
Given This is a contact test case

@SomkeTest 
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a task
Given This is a tasks test case

@SomkeTest
Scenario: Create a case
Given This is a case test case

@SomkeTest @RegressionTest
Scenario: Verify left panel links
Given Clicking on left panel links

@SomkeTest
Scenario: Search a deal
Given This is a search deal test

@SomkeTest
Scenario: Search contact
Given This is a search contact test

@SomkeTest @RegressionTest
Scenario: Search a case
Given This is a search case test

@SomkeTest @RegressionTest
Scenario: Search a task
Given This is a search task test

@SmokeTest @EndToEndTest
Scenario: Search a call
Given This is a search call test

@SomkeTest @EndToEndTest
Scenario: Search an email
Given This is a search email test

@SmokeTest @EndToEndTest
Scenario: Search a docs
Given: This is a search docs test

@SmokeTest @EndToEndTest
Scenario: Search a forms
Given This is a search forms test

@EndToEndTest
Scenario: Validate report
Given This is a report test

@EndToEndTest
Scenario: Application logout
Given This is a logout test


Scenario: Browser closed
Given This is a close browser test 
