Feature: Find the dealers and verify

  As a user I want to find the delars and verify

  Scenario: Find the dealers and verify the dealers are in list
    Given I am on homepage
    When I mouse hover on the buy+sell tab
    And I click ‘Find a Dealer’
    Then I navigate to ‘car-dealers’ page
    And I should see the dealer names "<dealersName>" are display on page