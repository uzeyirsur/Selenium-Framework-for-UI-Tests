@smoke @sigUp
Feature: Register process

  As a user, we would like to be able to register successfully with the right credentials.

  Scenario: The user enters valid information in all required fields and submits the registration form.
  KAMIS 01
    Given the user is on the sign up page
    When the user enters First Name "Uzeyir"
    And the user enters Last Name "Sur"
    And the user enters email "uzeyir@inar.com"
    And the user enters Password "123456"
    And the user enters Confirm Password "123456"
    And the user clicks on the sign up button
    Then Verify that the form is submitted successfully and a confirmation message is displayed.
    Then the user should arrives at the login page.


  Scenario:The user enters a password that is too short or doesn't meet the
  OBI 04
  website's password requirements.The user should receive an error message indicating the password requirements and the registration form should not be submitted.
    Given the user is on the sign up page
    When the user enters First Name "Uzeyir"
    And the user enters Last Name "Sur"
    And the user enters email "uzeyir@inar.com"
    And the user enters Password "12345"
    Then Verify that error text is displayed immediately as "The 'Password' field must be at least 6 characters"




