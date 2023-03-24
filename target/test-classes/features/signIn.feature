@smoke @login
Feature: Sign in Process


  @loginWithSocialMedia
  Scenario: The user registers on the website using a social media account (e.g. Facebook or Google).
  KAMIS 02
    Given user is on the login page
    When user clicks on the social media login button
    And user enters their social media account credentials.
    And user enters social media account's email address and password
    Then user clicks on the Login button.
    Then verify that the user is now logged in and can access the website's features and functionality.


  @validLogin

  Scenario: The user successfully signs in with valid credentials
  OBI 03
    Given user is on the login page
    When user enters email "uzeyir@inar.com"
    And user enters password as "123456"
    And user clicks on the sign in button
    Then user should be signed in profile page
    Then user should see welcome text with his username

  @profileInfos

  Scenario: User will see "Name", "Surname", "Gender", "Date of Birth", "Email" on the screen after successfully signing in with valid credentials
CEMREK 05
  This scenario tests whether a user can see "Name", "Surname", "Gender", "Date of Birth", "Email" on the screen after entering valid credentials.
    Given user is on the login page
    When user enters email "uzeyir@inar.com"
    And user enters password as "123456"
    And user clicks on the sign in button
    Then user should be signed in profile page
    Then user arrives to profile page and sees FirstName, LastName, Gender, Date of Birth, Email

  @invalidLogin
  Scenario: User failed to log in successfully with invalid credentials
    CEMREK 06
  This scenario tests whether a user can log in after entering invalid credentials.
    Given user is on the login page
    When user enters email "invalid@inar.com"
    And user enters password as "123456"
    And user clicks on the sign in button
    Then user should not be able to login and see message "Error! Please check your credentials and try again.."

  @deleteAccount
  Scenario: Verify that the user can delete their account and that all associated data is removed from the website.
    IMAM 07
    Given user is on the login page
    When user enters email "uzeyir@inar.com"
    And user enters password as "123456"
    And user clicks on the sign in button
    And  user clicks Delete button
    And  user enters password "123456" and click Delete button
    Then  user should be able to get a generic message "Success! Customer deleted successfully."
    When user enters email "uzeyir@inar.com"
    And user enters password as "123456"
    And user clicks on the sign in button
    Then user should not be able to login and see message "Error! Please check your credentials and try again.."