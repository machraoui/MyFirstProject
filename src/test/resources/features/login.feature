Feature: Login  ;
  Scenario: Login with right Login and Password
    Given I lanch firefox browser
    When i open my login  page
    And i use my right login and password
    Then i m in my dashbord page

    And close browser
