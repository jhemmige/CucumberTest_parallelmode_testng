Feature: Login page feature

@Regression
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Your store. Login"

@sanity
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@smoke
Scenario: Login with correct credentials
Given user is on login page
When user enters username "admin@yourstore.com"
And user enters password "admin"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Dashboard / nopCommerce administration"