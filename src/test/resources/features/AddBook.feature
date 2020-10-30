@AddBookF
Feature: As a user I should be able to add book

  Background: login
    Given user is on the homepage
    And user clicks on the Books tab
@AddBookS
    Scenario: add book
      When user clicks on "Add Book" button
      And user enters book's information
      |Book Name  |1984         |
      |ISBN       |1234567890   |
      |Year       |1984         |
      |Author     |George Orwell|
      |Description|good book    |
      And user clicks on "Save changes" button
      Then confirmation message appears





