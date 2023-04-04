Feature: Home Page
  Scenario:
    Given users goto url"https://movita.com.tr//"
    When users clicked the movita logo
    And Mobile Vechile Tracking system SHould be visible
    Then  Should be success
