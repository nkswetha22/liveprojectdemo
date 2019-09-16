@sanity @smoke
Feature: AddTariffPlan



  Scenario: 
   # Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datasss
    And click on submit buttonss
    Then user should be displayed home button is enteredd


@smoke
  Scenario: 
   # Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datasss.
      | 6995 | 120 | 400 | 100 | 1 | 2 | 3 |
      |  500 |  50 | 300 |  58 | 2 | 3 | 4 |
      |  200 |  90 |  80 |  40 | 4 | 5 | 6 |
      |  300 | 100 |  20 |  70 | 6 | 7 | 8 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd

  Scenario: 
  #  Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datassss.
      | MonthlyRen | LM  | IM  | SMS | MC | IC | SC |
      |       6995 | 120 | 400 | 100 |  1 |  2 |  3 |
      |        500 |  50 | 300 |  58 |  2 |  3 |  4 |
      |        200 |  90 |  80 |  40 |  4 |  5 |  6 |
      |        300 | 100 |  20 |  70 |  6 |  7 |  8 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd
