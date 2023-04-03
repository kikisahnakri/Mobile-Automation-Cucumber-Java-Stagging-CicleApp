@Cicle @Kanban
Feature:Kanban Board

#verif
  @Positive @Functional @TC1
  Scenario: Verify user successfully created title board with valid credential
    Given User is logged in
    And User on the kanban board page
    When User input add new borad "Project"
    Then  User successfully created kanban board "Project"

#verif
  @Positive @Functional @TC2
  Scenario: Verify user successfully created list card with valid credential
    Given User is logged in
    And User on the kanban board page
    When User input new card "Big Project for team N"
    Then User successfully created card "Big Project for team N"

#    verif
  @Positive @Functional @TC3
  Scenario: Verify user successfully edit card with valid credential
    Given User is logged in
    And User on the kanban board page
    And User click project want to edited
    When User input new title "Big Project for team J"
    Then User successfully update title "Big Project for team J"

  @Positive @Functional @TC4erklogadadta
  Scenario: Verify user successfully create description kanban board
    Given User is logged in
    And User on the kanban board page
    And User click project want to add description
    When User input description "This project must use java languange and appium"
    Then User successfully set description "This project must use java languange and appium"

#    verif
  @Positive @Functional @TC5
  Scenario: Verify user successfully add attach file with valid data
    Given User is logged in
    And User on the kanban board page
    And User click project want to add attach file
    When User input file jpg
    Then User successfully upload jpg

  @NegativeCase @Functional @TC1
  Scenario: Verify user unsuccessfully created board with empty title
    Given User is logged in
    And User on the kanban board page
    When User submit empty title ""
    Then  User unsuccessfully created kanban board

  @NegativeCase @Functional @TC2
  Scenario: Verify user unsuccessfully created new card with empty data
    Given User is logged in
    And User on the kanban board page
    When User submit empty card ""
    Then User unsuccessfully created card

#verif
  @NegativeCase @Functional @TC3
  Scenario: Verify user unsuccessfully edit card board with empty data
    Given User is logged in
    And User on the kanban board page
    And User click project want to edited
    When User submit without input data ""
    Then User unsuccessfully edit card

  @NegativeCase @Functional @TC4
  Scenario: Verify user unsuccessfully create description kanban board with html code
    Given User is logged in
    And User on the kanban board page
    And User click project want to add description
    When User input html code "<p style="color:red">Your text here</p>"
    Then User unsuccessfully set description "<p style="color:red">Your text here</p>"

  @NegativeCase @Functional @TC5
  Scenario: Verify user unsuccessfully create label with empty data
    Given User is logged in
    And User on the kanban board page
    And User click project
    When User submit without input data label
    Then User unsuccessfully create label

