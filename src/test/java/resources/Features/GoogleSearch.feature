@Tag("Google_Search_Engine")
Feature: Google Search Service

  Scenario Outline:Google-Search engine
    Given web browser is open
    And user is on google home page
    When user enters <searchText>
    And user clicks Login Button
    And user is navigated to search results page
    And New searched page is displayed
#    And user navigates to 'MAVEN REPOSITORY: CENTRAL'
#    And user enters <searchText2>
#    Then user is navigated to search results page

    Examples:
      | searchText
      | text
