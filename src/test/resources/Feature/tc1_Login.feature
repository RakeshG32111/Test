Feature: Verify the login application of facebook

Scenario: Login Validation

Given User is on Facebook login page

When User enter valid Username and Password

And User click on login button

Then User should be going to home page and validate the Username
