Feature: Conduit Login

  Scenario: Sign in to conduit
    Given User is already on Home Page
    When User clicks on "signin" link
    And User enters username and password
    And User clicks on "signin" button
    Then User is on Home page
