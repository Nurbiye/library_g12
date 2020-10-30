


@login
Feature: As the valid user I should be able to login
  Scenario: Login as a librarian
  Given user is on the login page
  When user logs in as a "librarian"
  Then User should be able to see homepage