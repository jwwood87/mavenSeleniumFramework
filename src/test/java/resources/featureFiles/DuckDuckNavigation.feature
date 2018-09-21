Feature: Navigate the DuckDuckGo website

@Smoke
  Scenario: Go to the main URL and main elements are displayed
    Given I navigate to DuckDuckGo
    And I close the Ad Track Popup
    Then the Duck Duck Logo is displayed
    Then the Privacy Dropdown Popout button is displayed
    Then the Social Networking button is displayed
    Then the hamburger icon is displayed


  Scenario: Go to the main URL
    Given I navigate to DuckDuckGo
    And I click the Privacy Dropdown Popout
    Then the social network links are displayed

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



