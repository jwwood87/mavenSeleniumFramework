Feature: Navigate the DuckDuckGo website


  Scenario: Go to the main URL
    Given I navigate to DuckDuckGo


  Scenario: Go to the main URL
    Given I navigate to DuckDuckGo
    Then the DuckDuckGo log is visible

  @Smoke
  Scenario: I check the social network links
    Given I navigate to DuckDuckGo
    And I click the Twitter drop-down
    Then the page displays Twitter, Reddit, and Blog links


  Scenario: I check the social network links
    Given I navigate to DuckDuckGo
    And I click the Hamburger menu
    Then the page displays Settings, Menu, privacy, and Keep-in-Touch
    And I click the Hamburger X button


  Scenario: Enter a search string
    Given I navigate to DuckDuckGo
    And I enter the search string "freedomtester"
    And the following URL is present: "freedomtester.com"




