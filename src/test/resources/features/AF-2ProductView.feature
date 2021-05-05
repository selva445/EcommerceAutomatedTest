Feature: Product View Test
  @regression
  Scenario Outline: View Product Page Check
    Given the User Navigates to the E-commerceWebsite
    When I Click on "View Product" for any product
    Then I should be able to view the results
    Then I Close The Browser
    Examples:
      |  |



