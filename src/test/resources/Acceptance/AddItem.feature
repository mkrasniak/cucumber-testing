@acceptance
Feature: Add item

  Scenario: Successfully add item
    Given I am logged into the system as user and add item
    When  I added item
    Then  add item