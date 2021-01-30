Feature: Search on Properties For Sale Page

  Scenario Outline: Customer can click on For Sale tab to search
    Given I navigate to Zoopla homepage
    And I click on For Sale tab
#    When I enter "<Location>" into the search field
#    And I select minimum price as "<MinimumPrice>"
#    And I select maximum price as "<MaximumPrice>"
#    And I select "<Property>" as property type
#    And I select "<Bedrooms>" bedrooms type
#    And I click on Search button
#    Then result is displayed for search made above


    Examples: Test Data
      | Location           | MinimumPrice | MaximumPrice | Property   | Bedrooms |
      | Manchester         | £100,000     | £500,000     | Houses     | 3+       |
