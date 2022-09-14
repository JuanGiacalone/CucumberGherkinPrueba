Feature: Image search

  Scenario: Finding some image

    Given I am on the Google search page
    When I search for a "Cucumber"
    Then the page title should start with "Cucumber"


