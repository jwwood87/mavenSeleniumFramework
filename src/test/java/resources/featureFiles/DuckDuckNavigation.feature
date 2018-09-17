Feature: Navigate the DuckDuckGo website

@Smoke
  Scenario: Go to the main URL
    Given I navigate to DuckDuckGo
    And I click the Privacy Dropdown Popout


#  Scenario: Go to the main URL
#    Given I navigate to DuckDuckGo
#    And I remove the Extension window
#    Then the social network links are displayed
#
#  Scenario: I check the privacy link
#    Given I navigate to DuckDuckGo
#    And I remove the Extension window
#    And I click the Privacy drop-down

#    @Smoke
#  Scenario: I check the social network links
#    Given I navigate to DuckDuckGo
#    And I remove the Extension window
#    And I click the Twitter drop-down
#    And the social network links are displayed


#  Scenario: I check the social network links
#    Given I navigate to DuckDuckGo
#    And I click the Hamburger menu
#    Then the page displays Settings, Menu, privacy, and Keep-in-Touch
#
#
#  Scenario: Enter a search string
#    Given I navigate to DuckDuckGo
#    And I enter the search string "freedomtester"
#    And the following URL is present: "freedomtester.com"
#



