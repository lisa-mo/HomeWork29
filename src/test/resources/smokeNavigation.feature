@Smoke
Feature: Navigation to few pages is working

  @HomePage
  Scenario: User can navigate to homePage
    When user navigate to homePage
    Then title of homePage is "Guru99 Bank Home Page"
    And login form is present

  Scenario: User can navigate to newToursPage
    Given user is on homePage
    When user click on newToursButton
    Then title of newToursPage is "Welcome: Mercury Tours"
    And main fragment is present

  Scenario: User can navigate to tablePage
    Given user is on homePage
    When user click on tableDemoLink
    Then title of tablePage is "Table Demo"
    And table is present