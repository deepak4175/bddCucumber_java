Feature: to test new file generation

  @API
  Scenario: to test new file generation

    Given I have created a new file "scenario20" in file "feature3"

  @API
  Scenario: to test new file generation 2

    Given I have created a new file "scenario21" in file "feature3"


  @API
  Scenario: to test new file generation1
    Given I have created a new file "scenario23" in file "feature3"

  @API
  Scenario Outline: to test new file generation <scenario>

    Given I have created a new file "scenario23" in file "feature3"
    When I save the file
    Examples:
      | scenario  |
      | scenario1 |
      | scenario2 |