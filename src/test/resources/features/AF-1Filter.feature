Feature: Filter DropDown Test
  @regression
  Scenario Outline: Filter Dropdown Selection as Beer
    Given the User Navigates to the E-commerceWebsite
    When I choose the FilterSearch as "Beer"
    Then I should be able to view the results
    Then I Close The Browser
    Examples:
      |  |

  @regression
  Scenario Outline: Filter Dropdown Selection as Cider
    Given the User Navigates to the E-commerceWebsite
    When I choose the FilterSearch as "Cider"
    Then I should be able to view the results
    Then I Close The Browser
    Examples:
      |  |

  @regression
  Scenario Outline: Filter Dropdown Selection as All Products
    Given the User Navigates to the E-commerceWebsite
    When I choose the FilterSearch as "All Products"
    Then I should be able to view the results
    Then I Close The Browser
    Examples:
      |  |


