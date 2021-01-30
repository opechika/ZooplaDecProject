Feature: For Sale Property Search

  Scenario Outline: Customer can search for properties for sale
    Given I navigate to Zoopla homepage
    When I enter "<Location>" into the search field
    And I select minimum price as "<MinimumPrice>"
    And I select maximum price as "<MaximumPrice>"
    And I select "<Property>" as property type
    And I select "<Bedrooms>" bedrooms type
    And I click on Search button
    Then the result for "<Property>" for sale in "<Location>" is displayed

    Examples: Test Data
      | Location           | MinimumPrice | MaximumPrice | Property   | Bedrooms |
      | Manchester         | £120,000     | £200,000     | Houses     | 3+       |
#      | M40 2EB            | £120,000     | £200,000     | Houses     | 3+       |
#      | Piccadilly Station | £120,000     | £200,000     | Houses     | 3+       |
#      | Manchester         | £120,000     | £200,000     | Flats      | 3+       |
#      | Manchester         | £120,000     | £200,000     | Farms/land | 3+       |

@ignore
  Scenario Outline: Customer can view the detail of properties for sale
    Given I navigate to Zoopla homepage
    When I enter "<Location>" into the search field
    And I select minimum price as "<MinimumPrice>"
    And I select maximum price as "<MaximumPrice>"
    And I select "<Property>" as property type
    And I select "<Bedrooms>" bedrooms type
    And I click on Search button
    And result is displayed for search made above
    And I click on one of the result displayed
    Then the details of the property clicked on is displayed

    Examples: Test Data
      | Location           | MinimumPrice | MaximumPrice | Property   | Bedrooms |
      | Manchester         | £100,000     | £500,000     | Houses     | 3+       |

  @ignore
  Scenario: Customer can not search with space
    Given I navigate to Zoopla homepage
    When I enter " " into the search field





