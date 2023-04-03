@Cicle @CheckIns
Feature:CheckIns Feature

  @PositiveCase @RegressionTest @TC1
  Scenario: Verify user successfully create general question with invite other member
    Given User on the checkins page
    And User click button chekins
    And User input question "What's is appium?"
    And User click day question Friday and Sunday
    And User set time 9 PM
    And User click icon add member
    And User click check all member
    When User click submit
    Then User successfully create question

  @PositiveCase @RegressionTest @TC2
  Scenario: Verify user successfully create private question
    Given User on the checkins page
    And User click button chekins
    And User create private question "What's is java?"
    And User click day question Friday and Sunday
    And User set time 9 PM
    And User checklist box private question
    When User click submit
    Then User successfully create private question

  @PositiveCase @RegressionTest @TC3
  Scenario: Verify user successfully create general question with select all days
    Given User on the checkins page
    And User click button chekins
    And User input question "What's is Intellj IDEA?"
    And User click select all days
    And User set time 9 PM
    And User click icon add member
    And User click check all member
    When User click submit
    Then User successfully create question
#
  @PositiveCase @RegressionTest @TC4
  Scenario: Verify user successfully reviewed and comment question that was created
    Given User on the checkins page
    And User click question that was created
    And User add comment "Appium Inspector"
    When User click submit comment
    Then User successfully open and comment question "Appium Inspector"

  @PositiveCase @RegressionTest @TC5
  Scenario: Verify user successfully edit comment
    Given User on the checkins page
    And User click question that was created
    And User click edit comment
    And User input new comment "Appium and appium desktop"
    When User click submit new comment
    Then User successfully update comment

  @NegativeCase @RegressionTest @TC1
  Scenario: Verify user unsuccessfully create question for general without input quesion field
    Given User on the checkins page
    And User click button chekins
    And User input question ""
    And User click day question Friday and Sunday
    And User set time 9 PM
    And User click icon add member
    And User click check all member
    When User click submit
    Then User unsuccessfully create question

  @NegativeCase @RegressionTest @TC2
  Scenario: Verify user unsuccessfully create question for general without add other member
    Given User on the checkins page
    And User click button chekins
    And User input question "What's is Balmond?"
    And User click day question Friday and Sunday
    And User set time 9 PM
    And User click icon add member
    And User click uncheck all member
    When User click submit question
    Then User Unsuccessfully create question with uncheck all member

  @NegativeCase @RegressionTest @TC3
  Scenario: Verify user unsuccessfully create question private without add other member
    Given User on the checkins page
    And User click button chekins
    And User create private question "What's is java?"
    And User click day question Friday and Sunday
    And User set time 9 PM
    And User click icon add member
    And User click uncheck all member
    And User checklist box private question
    When User click submit
    Then User unsuccessfully create private question

  @NegativeCase @RegressionTest @TC4
  Scenario: Verify user unsuccessfully create private question without input quesion field
    Given User on the checkins page
    And User click button chekins
    And User create private question ""
    And User click day question Friday and Sunday
    And User set time 9 PM
    And User checklist box private question
    When User click submit
    Then User unsuccessfully create private question without input quesion field

  @NegativeCase @RegressionTest @TC5
  Scenario: Verify user unsuccessfully create private question without set day question
    Given User on the checkins page
    And User click button chekins
    And User create private question "Katalon Studio"
    And User set time 9 PM
    And User click icon add member
    And User click check all member
    And User checklist box private question
    When User click submit
    Then User unsuccessfully create private question without set date question
